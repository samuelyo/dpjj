<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh_CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="shortcut icon" href="favicon.ico">
<title>点评保险</title>
<link href="../../css/bootstrap.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->
<link href="../../css/common.css" rel="stylesheet">
<link href="../../css/insurance.css" rel="stylesheet">
<link href="../../css/insurancepoint.css" rel="stylesheet">
</head>

<body>
	<div class="insurance-head">
		<div class="container">
			<div class="row vertical-align">
				<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-md-offset-2">
					
					<div class="row vertical-align">
						<div class="col-xs-9 col-sm-9 col-md-8 col-lg-8 left-area">
							<div class="col-xs-8" style="border:double">
								<p class="insurance-title">生命人寿健康险
								</p>
							</div>
							<div class="col-xs-4 total_point">
								<b>综合评分:</b>
							</div>
						</div>
						<div class="col-xs-3 right-area">
							<p id="overall-rating">-</p>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-xs-3 insurance-detail-wrapper">
							<a id="details" onclick="details();" class="insurance-detail">产品详情</a>
						</div>
						<div class="col-xs-9">
							<p>(点击评分，某项分数过低需填写理由)
							</p>
						</div>
					</div>
					
					
				</div>
				
			</div>
		</div>
	</div>

	<div class="container">
	<div id="frame" class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-md-offset-2 rating-items">
		<div class="row">
			<div class="col-xs-6 item-name">
				<p>产品用途</p>
			</div>
			<div class="col-xs-6 item-rating">
				<p>
					该项得分:<span id="123" class="rate"></span>
				</p>
			</div>
			<div class="col-xs-12">
				<div class="progress">
					<div class="progress-bar progress-bar-warning" style="width: 100%">
						<span class="sr-only"></span>
					</div>
					<div class="progress-bar progress-bar-danger" style="width: 0%">
						<span class="sr-only"></span>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<hr>
			</div><!-- 一个分项结束     -->
			<div class="col-xs-6 item-name">
				<p>服务质量</p>
			</div>
			<div class="col-xs-6 item-rating">
				<p>
					该项得分:<span id="234" class="rate"></span>
				</p>
			</div>
			<div class="col-xs-12">
				<div class="progress">
					<div class="progress-bar progress-bar-warning" style="width: 100%">
						<span class="sr-only"></span>
					</div>
					<div class="progress-bar progress-bar-danger" style="width: 0%">
						<span class="sr-only"></span>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<hr>
			</div>
			<div class="col-xs-6 item-name">
				<p>理赔善后</p>
			</div>
			<div class="col-xs-6 item-rating">
				<p>
					该项得分:<span id="345" class="rate"></span>
				</p>
			</div>
			<div class="col-xs-12">
				<div class="progress">
					<div class="progress-bar progress-bar-warning" style="width: 100%">
						<span class="sr-only"></span>
					</div>
					<div class="progress-bar progress-bar-danger" style="width: 0%">
						<span class="sr-only"></span>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<hr>
			</div>
			<div class="col-xs-6 item-name">
				<p>合同履行</p>
			</div>
			<div class="col-xs-6 item-rating">
				<p>
					该项得分:<span id="456" class="rate"></span>
				</p>
			</div>
			<div class="col-xs-12">
				<div class="progress">
					<div class="progress-bar progress-bar-warning" style="width: 100%">
						<span class="sr-only"></span>
					</div>
					<div class="progress-bar progress-bar-danger" style="width: 0%">
						<span class="sr-only"></span>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<hr>
			</div>
			<div class="col-xs-6 item-name">
				<p>安全保障</p>
			</div>
			<div class="col-xs-6 item-rating">
				<p>
					该项得分:<span id="789" class="rate"></span>
				</p>
			</div>
			<div class="col-xs-12">
				<div class="progress">
					<div class="progress-bar progress-bar-warning" style="width: 100%">
						<span class="sr-only"></span>
					</div>
					<div class="progress-bar progress-bar-danger" style="width: 0%">
						<span class="sr-only"></span>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<br/><br/>

	<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-md-offset-2 comment-post">
		<div class="row">
			<div class="col-xs-4">
				<p>发表点评论吧</p>
			</div>
			<div class="col-xs-5">
				<label class="radio-inline"> <input type="radio"
					name="commentType" id="normal-comment" value="normal"
					checked="checked"> 吐槽
				</label> <label class="radio-inline"> <input type="radio"
					name="commentType" id="reason-comment" value="reason"> 理由
				</label>
			</div>
			<div class="col-xs-3">
				<button type="button" class="btn btn-info" id="post">发表</button>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-xs-12">
				<textarea class="form-control" rows="7" placeholder="吐槽或者需要填写的理由"></textarea>
			</div>
		</div>
	</div>
	<div id="alert" style="display:none;z-index:1000 ;text-align:center">
		<br>
		<div class="row"><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" ><br><div style="margin:0 auto"><p>发表成功!</p></div></div></div>
		<br>
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<div style="margin:0 auto">
				<button class="btn btn-default btn-sm" style="background-color:#bbf;margin:20px" id="close">关闭本页面</button>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-default btn-sm" style="background-color:#bbf;margin:20px" id="remain">留在本页面</button>
			</div>
			</div>
		</div>
	
	</div>
	<input id="product_id" type="hidden" value="${product_id}">
	<input id="user_id" type="hidden" value="${user_id}">
	<script src="../../js/jquery/jquery-3.1.1.min.js"></script>
	<script type="text/javascript">
	function render_item(lines,frame){
		
		for(var i=0;i<lines.length;i++){
			var item_line="<div class=\"col-xs-6 item-name\"><p>"
							+lines[i].item_name
							+"</p></div><div class=\"col-xs-6 item-rating\"><p>"
							+"该项得分:<span id=\""
							+lines[i].item_id
							+"\" class=\"rate\"></span></p></div><div class=\"col-xs-12\">"
							+"<div class=\"progress\">"
							+"<div class=\"progress-bar progress-bar-warning\" style=\"width: 100%\">"
							+"<span class=\"sr-only\"></span></div><div class=\"progress-bar progress-bar-danger\" style=\"width: 0%\">"
							+"<span class=\"sr-only\"></span></div></div></div><div class=\"col-xs-12\"><hr></div>"
	        frame.append(item_line);
		}
	}
	
	function details(){
		var url="showproductdetail?productid="+$("#product_id").val()
		if (window.innerWidth) winWidth = window.innerWidth;
		else if ((document.body) && (document.body.clientWidth)) winWidth = document.body.clientWidth;
		if(winWidth<1000){
			window.location.href=url+"&terminal=1"
			return;
		}
		window.open(url+"&terminal=0")
	}
	
	$.ajax({
		url:"getitemsname",
		type:"GET",
		asyn:false,
		dataType:"json",
		success:function(res){
			if("success"==res.result.trim()){
				var frame=$("#frame .row:eq(0)");
				render_item(res.data.lines,frame);
			}
		},
		error:function(res){
			return;
		}
	})
	
	$(document).ready(function(){

			$("#post").click(function(){
				var overall_rate=$("#overall-rating").val();
				var data={
						"product_id":$("#product_id").val(),
						 "user_id":$("#user_id").val(),
						 "items_score":{}
						};
				
				$("#frame .rate").each(function() {
					data.items_score[$(this).attr("id")]=$(this).html();
				});
				
				$.ajax({
					url:"commititemscores",
					type:"POST",
					data:data,
					asyn:false,
					dataType:"json",
					success:function(res){
						if("success"==res.result.trim()){
							$("#alert").show();
						}
					},
					error:function(res){
						$("#alert .row:eq(0)").html("<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">"
								+"<br><div style=\"margin:0 auto\"><p>发表失败！<br>请重新发表</p></div></div>")
						$("#alert").show();
						setTimeout(3000,function(){$("#alert").hide();})
						return false;
					}
				})
				
				$("#close").click(function(){
					history.back();
				})
				
				$("#remain").click(function(){
					$("#alert").hide();
				})
				
				
			})
		})
	</script>
	<script src="../../js/bootstrap.min.js"></script>
	<script src="../../js/commonfunction.js"></script>
	<script src="../../js/insurancepoint.js"></script>
</body>
</html>