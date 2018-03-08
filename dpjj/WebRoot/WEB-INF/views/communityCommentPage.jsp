<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh_CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="shortcut icon" href="favicon.ico">
<title>点评保险</title>
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->
<link href="css/common.css" rel="stylesheet">
<link href="css/insurance.css" rel="stylesheet">
<link href="css/insurancepoint.css" rel="stylesheet">
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

@media only screen and (min-width:600px){
	#wholetip .title{
	font-size:2vw;
	}
 
}
@media only screen and (max-width:600px){
	#wholetip .title{
	font-size:3vw;
	}
 
}
</style>
</head>

<body>
	<div class="insurance-head">
		<div class="container">
			<div class="row visible-on" style="background-color:#eee">
			<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5 col-md-offset-2 ">
				<span class="visible-md visible-lg"
					style="height:60px;padding-top:20px"> <img
					src="/header_logo.png" /> 点评经济
				</span>
			</div>
			<div class="col-xs-6 col-sm-3 col-md-5 col-lg-5" style="">
				<span class="visible-md visible-lg"
					style="height:60px;padding-top:20px"> <a class="tag"
					href="../../login/enterpriseUser/login.html">企业登录</a>&nbsp;|&nbsp;
					<a class="tag" href="../../login/generalUser/login.html">个人登录</a>&nbsp;|&nbsp;
					<a class="tag" href="../../regist/enterpriseregistpage.html">企业注册</a>&nbsp;|&nbsp;
					<a class="tag" href="../../regist/generalregistpage.html">个人注册</a>
				</span>
			</div>
		</div>
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
	</div>

	<div class="container" style="border">
    <br>
    	<div id="frame" class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-md-offset-1 rating-items">
       		<div id="wholetip" class="col-lg-12 col-md-12 ">
                	<br>
                	<p class="title" >我与保险行业二三事</p>
                    <hr>
                    <span class="glyphicon glyphicon-pencil"></span>作者：张三丰
                    <hr>
                    <div class="hot_tip_content">
                    	问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番一门东西，还需要去实践一番
                    </div>
                    <br>
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
				<textarea class="form-control" rows="7" placeholder="请将评论写在此处"></textarea>
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
	<script src="js/jquery-1.10.2.min.js"></script>
	<script type="text/javascript">
	/*function render_item(lines,frame){
		
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
		})*/
	</script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/commonfunction.js"></script>
	<script src="js/insurancepoint.js"></script>
</body>
</html>