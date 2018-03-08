<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="shortcut icon" href="favicon.ico">
<title>产品综合评价</title>
<link href="../../css/bootstrap.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->
<link href="../../css/insurance.css" rel="stylesheet">
<link href="../../css/insurancecomments.css" rel="stylesheet">
<script src="../../js/jquery/jquery-3.1.1.min.js"></script>
<style type="text/css">
.navigate_blur {
	width: 700px;
	height: 50px;
	margin: 0 auto;
	text-align: center
}

.nav li {
	background-color: #ff5151;
	float: left;
	display: block;
	height: 50px;
	width: 175px;
	line-height: 50px;
	padding: 0 20px;
	position: relative;
	font-size: 24px;
	color: #fff;
}

.nav li:hover {
	background: #cea;
}

.nav li ul li {
	float: none;
	font-size: 19px;
}
/*关键一：将二级菜单设置为display：none;*/
.nav li ul {
	position: absolute;
	top: 50px;
	left: 0;
	display: none;
	padding: 0 0 0 0
}

.nav li ul li:hover {
	background: red;
}
/*关键二：在划过二级菜单从属的一级菜单时，设置为display:block;*/
.nav li:hover ul {
	display: block;
}

.nav a {
	color: #fff;
	text-decoration: none;
}

#home_a:hover {
	background-color: #cea
}


</style>
<script>
  less = {
    env: "development",
    async: false,
    fileAsync: false,
    poll: 1000,
    functions: {},
    dumpLineNumbers: "comments",
    relativeUrls: false,
    rootpath: ":/a.com/"
  };
</script>
<script src="../../js/less.js" type="text/javascript"></script>

</head>

<body>
	<div class="container">
		<%@ include file="pageHeader.jsp" %>
		<div class="row visible-on">
			<div class="col-xs-5 col-sm-5 col-md-12 col-lg-12 "
				style="z-index:1000 ;background-color:#ff5151">
				<span class="navigate_blur visible-md visible-lg"
					style="height:60px;padding-top:0px">
					<ul class="nav nav-tabs">
						<li><a href="../../" id="home_a"
							style="padding:7px 15px 7px 15px;">首页</a></li>
						<li>经济大家评
							<ul>
								<li><a href="../../comment/insurance/enterpriselist.html">保险大家评</a></li>
								<li><a href="../../comment/bank/enterpriselist.html">银行大家评</a></li>
								<li><a href="../../comment/bank/enterpriselist.html">证券大家评</a></li>
							</ul>
						</li>
						<li>公共服务
							<ul>
								<li><a href="#">互助论坛</a></li>
								<li><a href="#">法律小助手</a></li>
							</ul>
						</li>
						<li>个性化
							<ul>
								<li><a href="#">调查问卷</a></li>
								<li><a href="#">个人小档案</a></li>
							</ul>
						</li>

					</ul>

				</span>
			</div>
		</div>
	</div>

	<div class="container">
    	<input id="domain" type="hidden" value="${domain}"/>
    	<input id="product_id" type="hidden" value="${product_id}"/>
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<div class="row">

                <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                <div class="insurance-head">
						<div class="row vertical-align">
							<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 ">
                            	<div class="row visible-lg visible-md">
									<div class="col-lg-12 " >
		  								<div class="row" style="border:#999 1px solid">
		    								<div id="enterprise_logo" class="col-xs-4 col-md-4" >
			  									<img class="img-responsive" src="../../images/test/baoxian3.jpg">
											</div>
            								<div id="enterprise_name" class="row col-xs-8 col-md-8">
			  									<div class="col-xs-12 col-md-12">
			    									<h3 class="">安华保险</h3>
			  									</div>	
            								</div>
          								</div>
        							</div>
								</div>
								<div class="row">
                                	<div class="shadow">
									<div id="product_name" class="col-xs-8 col-lg-12 col-md-12">
										<p class="insurance-title">生命人寿健康险</p>
									</div>
                                    </div>	
								</div>
								<div class="row">
									<div class="col-xs-5 col-lg-5 insurance-detail-wrapper">
										<span><button id="point" type="button" class="btn btn-info" id="comment">为它打分</button></span>
									</div>
                                    <div id="product_score_label" class="col-xs-3 col-lg-3">
										<b>综合评分:</b>
									</div>
                                    <div id="product_score" class="col-xs-3 right-area">
										<p class="overall-rating">7.09</p>
									</div>
								</div>
                               
							</div>
						</div>
				
				</div><!--insurance-head结束-->
				</div>
<script type="text/javascript">
	var product_id=$("#product_id").val();
	$.ajax({
		url:"getproductscore?productid="+product_id,
		type:"GET",
		asyn:false,
		dataType:"json",
		success:function(res){
			$("#enterprise_logo").html("<img class=\"img-responsive\" src=\""
										+res.data.img_path+"\"/>");
			$("#enterprise_name").html("<div class=\"col-xs-12 col-md-12\"><h3>"
										+res.data.enterprise_name+"</h3></div>	");
			$("#product_name").html("<p class=\"insurance-title\">"+res.data.product_name+"</p>");
			$("#product_score").html("<p class=\"overall-rating\">"+res.data.score+"</p>");
		},
		error:function(res){
			return;
		}
	})


</script>

				<div id="frame" class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
				<div class=" rating-items">
					<div class="row">
						<div class="col-xs-6 item-name">
							<p>产品用途</p>
						</div>
						<div class="col-xs-6 item-rating">
							<p>该项得分:{}</p>
						</div>
						<div class="col-xs-12">
							<div class="progress">
								<div class="progress-bar progress-bar-warning"
									style="width: 60%">
									<span class="sr-only"></span>
								</div>
								<div class="progress-bar progress-bar-danger" style="width: 40%">
									<span class="sr-only"></span>
								</div>
							</div>
						</div>
						<div class="col-xs-12">
							<hr>
						</div>
						<div class="col-xs-6 item-name">
							<p>服务质量</p>
						</div>
						<div class="col-xs-6 item-rating">
							<p>该项得分:{}</p>
						</div>
						<div class="col-xs-12">
							<div class="progress">
								<div class="progress-bar progress-bar-warning"
									style="width: 50%">
									<span class="sr-only"></span>
								</div>
								<div class="progress-bar progress-bar-danger" style="width: 50%">
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
							<p>该项得分:{}</p>
						</div>
						<div class="col-xs-12">
							<div class="progress">
								<div class="progress-bar progress-bar-warning"
									style="width: 60%">
									<span class="sr-only"></span>
								</div>
								<div class="progress-bar progress-bar-danger" style="width: 40%">
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
							<p>该项得分:{}</p>
						</div>
						<div class="col-xs-12">
							<div class="progress">
								<div class="progress-bar progress-bar-warning"
									style="width: 60%">
									<span class="sr-only"></span>
								</div>
								<div class="progress-bar progress-bar-danger" style="width: 40%">
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
							<p>该项得分:{}</p>
						</div>
						<div class="col-xs-12">
							<div class="progress">
								<div class="progress-bar progress-bar-warning"
									style="width: 60%">
									<span class="sr-only"></span>
								</div>
								<div class="progress-bar progress-bar-danger" style="width: 40%">
									<span class="sr-only"></span>
								</div>
							</div>
						</div>
					</div>
				</div>
                </div>
				<!--评分框结束-->
<script type="text/javascript">

function parsePercent(fScore){
	var percent_score=fScore*10+"%";//所有的项目评分，包括总评分都取小数点后两位，四舍五入
	return percent_score;
}

function render_itemscore(lines,frame){
	
	for(var i=0;i<lines.length;i++){
		var item_line="<div class=\"col-xs-6 item-name\"><p>"
            		+lines[i].item_name
            		+"</p></div><div class=\"col-xs-6 item-rating\"><p>该项得分:"
            		+lines[i].item_score
            		+"</p></div><div class=\"col-xs-12\"><div class=\"progress\">"
            		+"<div class=\"progress-bar progress-bar-warning\" style=\"width:"
            		+parsePercent(parseFloat(lines[i].item_score))
            		+"\"><span class=\"sr-only\"></span></div>"
            		+"<div class=\"progress-bar progress-bar-danger\" style=\"width:"
            		+parsePercent(1-parseFloat(lines[i].item_score))
            		+"\"><span class=\"sr-only\"></span></div></div></div>"
            		+"<div class=\"col-xs-12\"><hr></div>"
        frame.append(item_line);
	}
}

$.ajax({
	url:"getitemscore?productid="+product_id,
	type:"GET",
	asyn:false,
	dataType:"json",
	success:function(res){
		if("success"==res.result.trim()){
			var frame=$("#frame .row:eq(0)");
			render_itemscore(res.data.lines,frame);
		}
	},
	error:function(res){
		return;
	}
})

</script>				
				
							
                </div><!--row结束-->
                <br><br>
                <span class="visible-lg visible-md">
                	<strong><button type="button" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-plus"></span> 更多评论</button></strong>
                </span>
                <hr>
				<div class="container user-comments">
					<div class="row vertical-align">
						<div class="col-xs-5">
							<p class="username">用户a</p>
						</div>
						<div class="col-xs-7 post-time">
							<p>发表时间:2016-2-1</p>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-6">
							<p>评论：(吐槽)</p>
						</div>
						<div class="col-xs-6 rating">
							<p>评分：6分</p>
						</div>
						<div class="col-xs-12">
							<p class="comment-content">责罚飞飞啊废话废话ISO发考虑的撒酒疯立刻就冻死了开发额啥faefesfjlksjelfkjlk</p>
						</div>
					</div>
					<hr>
					<div class="row vertical-align">
						<div class="col-xs-5">
							<p class="username">用户b</p>
						</div>
						<div class="col-xs-7 post-time">
							<p>发表时间:2016-2-1</p>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-6">
							<p>评论：(吐槽)</p>
						</div>

						<div class="col-xs-6 rating">
							<p>评分：5分</p>
						</div>
						<div class="col-xs-12">
							<p class="comment-content">责罚飞飞啊废话废话ISO发考虑的撒酒疯立刻就冻死了开发额啥faefesfjlksjelfkjlk</p>
						</div>
					</div>
					<hr>
					<div class="row vertical-align">
						<div class="col-xs-5">
							<p class="username">用户c</p>
						</div>
						<div class="col-xs-7 post-time">
							<p>发表时间:2016-2-1</p>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-6">
							<p>评论：(理由)</p>
						</div>
						<div class="col-xs-6 rating">
							<p>评分：5分</p>
						</div>
						<div class="col-xs-12">
							<p class="comment-content">责罚飞飞啊废话废话ISO发考虑的撒酒疯立刻就冻死了开发额啥faefesfjlksjelfkjlk</p>
						</div>
					</div>
					<hr>
				</div>
                <span class="visible-lg visible-md">
                	<strong><button type="button" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-plus"></span> 更多评论</button></strong>
                </span>
<script type="text/javascript">
	
	function render_usercomments(lines,obj){
		
		for(var i=0;i<lines.length;i++){
			var item_line="<div class=\"row vertical-align\"><div class=\"col-xs-5\"><p class=\"username\">"
							+lines[i].user_name
							+"</p></div><div class=\"col-xs-7 post-time\"><p>发表时间:"
							+lines[i].comment_date
							+"</p></div></div><div class=\"row\"><div class=\"col-xs-6\"><p>评论：("
							+parseInt(lines[i].classify.trim())?"吐槽":"理由"
							+")</p></div><div class=\"col-xs-6 rating\"><p>评分："
							+lines[i].user_score
							+"分</p></div><div class=\"col-xs-12\"><p class=\"comment-content\">"
							+lines[i].comment_content
							+"</p></div></div><hr>"
	        obj.append(item_line);
		}
	}
	var max_lines_length=10;
	var last_comment_id=0;
	function getComments(){
		$.ajax({
			url:"getproductcomment?productid="+product_id+"&commentid="+last_comment_id,
			type:"GET",
			asyn:false,
			dataType:"json",
			success:function(res){
				if("success"==res.result.trim()){
					$(".user-comments").html("")
					last_comment_id=res.data.lines[res.data.lines.length-1].comment_id;
					var user_comments=$(".user-comments");
					render_usercomments(lines,user_comments);
				}
			},
			error:function(res){
				return;
			}
		})
	}
	getComments();

</script>				
			</div><!--主体结束-->
		</div>
	</div>
	<jsp:include page="pageFooter.jsp"></jsp:include>s
	<script type="text/javascript">
	
		$(document).ready(function(){
			$(".btn.btn-default.btn-sm").click(function(){
				getComments();
			})
			$("#point").click(function(){
				window.location.href="showpointpage?productid="+product_id  //需要在后台过滤器中检查是否已经登陆
			})
		})
			
	</script>
	<script src="../../js/bootstrap.min.js"></script>
</body>
</html>