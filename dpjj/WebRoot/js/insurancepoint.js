$(document).ready(function() {
	var rateThreshhold = 3;//阈值
	

	$(".progress").click(function(e) {
		var x = getRelativeX(e, this);
		var rate = (x / $(this).width() * 10).toFixed(2);
		$(this).parent().prev().find(".rate").text(rate);
		$(this).children().eq(0).css({"width" : rate * 10 + "%"});
		$(this).children().eq(1).css({"width" : 100 - rate * 10 + "%"});
		var totalRate = 0.0;
		var overallRate = 0.0;
		var rateCount = 0;
		var rateThreshholdFlag = false; //是否小于阈值的标志
		$(".rate").each(function() {
			if ($(this).text() != "") {
				totalRate += parseFloat($(this).text());
				rateCount++;
			}
			if (parseFloat($(this).text()) <= rateThreshhold) {
				rateThreshholdFlag = true;
			}
 	 	});
		if(rateThreshholdFlag) { 
			$("#reason-comment").prop('checked', true);
			$("#normal-comment").prop('disabled', true);
		} else {
			$("#normal-comment").prop('disabled', false); 
		}

 	 	overallRate = (totalRate / rateCount).toFixed(2);
 	 	$("#overall-rating").text(overallRate);
	});
	
});