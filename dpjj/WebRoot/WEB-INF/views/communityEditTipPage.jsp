<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh_CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="wi
dth=device-width, initial-scale=1">
<link rel="shortcut icon" href="favicon.ico">
<title>互助论坛</title>
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->

<script src="js/jquery-1.10.2.min.js"></script>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}
a, img {
	border: 0;
	text-decoration: none;
}
body {
	font: 12px/180% Arial, Helvetica, sans-serif, "新宋体";
}
#page-wrap {
	width: 100%;
	margin: 25px 0px 25px 0px;
}
/* 一级 */
ul.dropdown {
	width: 100%;
}
ul.dropdown li {
	font-weight: bold;
	width: 100%;
	background: #FCF;
	position: relative;
	border: 1px solid #96a5b4;
	border-radius: 3px;
}
ul.dropdown a:hover {
	color: #000;
}
ul.dropdown li a {
	display: block;
	padding: 20px 8px;
	color: #FFF;
	position: relative;
	z-index: 2000;
	font-size: 18px
}
ul.dropdown li a:hover, ul.dropdown li a.hover {
	background: #F3D673;
	position: relative;
}
/* 二级 */
ul.dropdown ul {
	display: none;
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	z-index: 1000;
}
ul.dropdown ul li {
	font-weight: normal;
	background: #f6f6f6;
	color: #000;
	border-bottom: 1px solid #ccc;
}
ul.dropdown ul li a {
	display: block;
	background: #c00 !important;
	font-size: 18px
}
ul.dropdown ul li a:hover {
	display: block;
	background: #F3D673 !important;
}
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
@media only screen and (min-width:600px) {
.tip_title {
	font-size: 2vw;
}
}
@media only screen and (max-width:600px) {
.tip_title {
	font-size: 3vw;
}
}
.hot_tip_content {
	overflow: hidden;
	text-overflow: ellipsis;
	display: -webkit-box;
	-webkit-line-clamp: 7;
	-webkit-box-orient: vertical;
}
</style>
<script type="text/javascript" src="./dropDown.js"></script>
</head>

<body>
<input id="" type="hidden" value=""/>
<div class="container">
  <div class="row visible-on" style="background-color:#eee">
    <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5 col-md-offset-2 "> <span class="visible-md visible-lg"
					style="height:60px;padding-top:20px"> <img
					src="/header_logo.png" /> 点评经济 </span> </div>
    <div class="col-xs-6 col-sm-3 col-md-5 col-lg-5" style=""> <span class="visible-md visible-lg"
					style="height:60px;padding-top:20px"> <a class="tag"
					href="../../login/enterpriseUser/login.html">企业登录</a>&nbsp;|&nbsp; <a class="tag" href="../../login/generalUser/login.html">个人登录</a>&nbsp;|&nbsp; <a class="tag" href="../../regist/enterpriseregistpage.html">企业注册</a>&nbsp;|&nbsp; <a class="tag" href="../../regist/generalregistpage.html">个人注册</a> </span> </div>
  </div>
  <div class="row visible-on">
    <div class="col-xs-5 col-sm-5 col-md-12 col-lg-12 "
				style="z-index:1000 ;background-color:#ff5151"> <span class="navigate_blur visible-md visible-lg"
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
      </span> </div>
  </div>
</div>
<div class="container" >
<div class="row">
  <div class="col-lg-3 col-md-3 visible-lg visible-md commendation-tips">
    <div class="row" style="border:2px #F00 solid;background-color:#2FF">
      <div class="col-lg-12 col-md-12 " style="border-bottom:2px #F00 solid;font-size:24px;font-weight:600;padding:20px">全部帖文</div>
      <div class="col-lg-12 col-md-12 "> <br>
        <p style="font-size:18px">我与保险行业二三事</p>
        <hr>
        <span class="glyphicon glyphicon-heart">36</span>
        <hr>
        <div class="hot_tip_content"> 问卷调查页面显示
          由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番 </div>
        <br>
      </div>
      <div class="col-lg-12 col-md-12 "> <br>
        <p style="font-size:18px">我与保险行业二三事</p>
        <hr>
        <span class="glyphicon glyphicon-heart">36</span>
        <hr>
        <div class="hot_tip_content"> 问卷调查页面显示
          由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番 </div>
        <br>
      </div>
    </div>
  </div>
  <div class="col-lg-9 col-md-9 col-xs-12 col-sm-12 all-tips-panel">
    <div class="row">
      <div class="col-lg-8 col-md-8 col-xs-12 col-sm-12"> <br>
        <div style="padding: 20px 100px 10px 10px;">
          <form class="bs-example bs-example-form" role="form" id="${user_info.userId}">
            <div class="input-group">
              <input type="text" class="form-control" placeholder="请输入题目">
            </div>
            <hr>
            <button type="button" class="btn btn-info" id="post">发表</button>
            <hr>
            <div class="input-group">
            <label>
            作者：
            <input type="text" class="form-control" value="${user_info.username}" disabled="disabled"></label>
            </div>
            <div class="input-group">
            <label>
            文章来源：
            <input id="is_original" type="text" class="form-control" value="${is_original}" disabled="disabled"></label>
            </div>
            <div class="input-group">
            <label>
            创作时间：
            <input id="edit_time" type="text" class="form-control" value="" disabled="disabled"></label>
            </div>
            
          </form>
          <div id="sorts" style="display:none">
            <label>
            险种分类：
            <select id="select"  class="form-control">
            	<option >--请选择--</option>
                <option >儿童险</option>  
    			<option >老人险</option>  
    			<option >财产险财产险</option>  
    			<option >交通险</option>  
    			<option >意外险意外险意外险意外险</option>  
    			<option >商业险</option>  
    			<option >农业险农业险</option>  
    			<option >社会险</option>  
    			<option >家庭险</option>  
    			<option >交通险交通险交通险</option>
                <option >--请选择--</option>
                <option >儿童险</option>  
    			<option >老人险</option>  
    			<option >财产险财产险</option>  
    			<option >交通险</option>  
    			<option >意外险意外险意外险意外险</option>  
    			<option >商业险</option>  
    			<option >农业险农业险</option>  
    			<option >社会险</option>  
    			<option >家庭险</option>  
    			<option >交通险交通险交通险</option>
            </select></label>
            </div>
            <hr>
        </div>
        <script type="application/javascript">
									
	var dates = new Date();
    var years = dates.getFullYear();
    var months = dates.getMonth()+1;
    var days = dates.getDate();
    /*var hours = dates.getHours();
    var mins =dates.getMinutes(); 
    var secs = dates.getSeconds();*/
    $("#edit_time").val(years+"-"+months+"-"+days)
						
	
	$(document).ready(function(){
		//alert(window.innerWidth)
		if(parseInt(window.innerWidth)<700){
			$("#sorts").show();
		}
	});
         
								</script> 
      </div>
      </div>
      <div class="row" >
        <div class="col-lg-10 col-md-offset-1"> <br>
          <div class="row">
            <div class="col-xs-12">
              <textarea class="form-control" rows="7" placeholder="请将评论写在此处"></textarea>
            </div>
          </div>
          <hr>
          <button type="button" class="btn btn-default btn-lg"><span class="glyphicon glyphicon-plus"></span>上传图片</button>
          <br>
          <br>
          <div class="row">
            <div class="col-sm-6 col-md-3"> <a href="#" class="thumbnail"> <img src="images/tips_img3.jpg"
                 						alt="通用的占位符缩略图"> </a> </div>
            <div class="col-sm-6 col-md-3"> <a href="#" class="thumbnail"> <img src="images/tips_img4.jpg"
                 						alt="通用的占位符缩略图"> </a> </div>
            <div class="col-sm-6 col-md-3"> <a href="#" class="thumbnail"> <img src="images/tips_img4.jpg"
                 						alt="通用的占位符缩略图"> </a> </div>
            <div class="col-sm-6 col-md-3"> <a href="#" class="thumbnail"> <img src="images/tips_img3.jpg"
                 						alt="通用的占位符缩略图"> </a> </div>
          </div>
        </div>
      </div>
    </div>
    <div id="alert" style="display:none;z-index:1000 ;text-align:center"> <br>
      <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" ><br>
          <div style="margin:0 auto">
            <p>发表成功!</p>
          </div>
        </div>
      </div>
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
  </div>

</div>

  <div style="position:absolute;width:100%;right:18%;top:150px" class="visible-lg visible-md">
    <div style="float:right;border-radius:3px;border:2px double #36F;padding:10px;background-color:#Fdd" >
      <label style="font-size:18px">当前保险分类：<br>
        <br>
        <input type="text" id="classify" disabled="disabled" style="font-size:18px;border-radius:3px" value="全部险种"/>
      </label>
      <br>
      <br>
      <ul class="dropdown " style="text-align:center">
        <li style="height: 63px;"> <a href="" class="">险种分类帖文</a>
          <ul class="sub_menu" style="display: none; padding-top: 63px; top: 0px;">
            <li><a class=""></a></li>
            <li><a class="">全部险种</a></li>
            <li><a class="">老人意外险</a></li>
            <li><a class="">交通意外险</a></li>
            <li><a class="">财产保险</a></li>
            <li><a class="">医疗保险</a></li>
            <li><a class="">退休保险</a></li>
            <li><a class="">养老保险</a></li>
            <li><a class="">失业保险</a></li>
            <li><a class="">交通事故险</a></li>
            <li><a class="">交通伤亡险</a></li>
            <li><a class="">投资保险</a></li>
            <li><a class="">投资保险</a></li>
            <li><a class="">交通事故险</a></li>
            <li><a class="">财产保险</a></li>
            <li><a class="">老人意外险</a></li>
            <li><a class="">大病医疗</a></li>
            <li><a class="">人身意外险</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>

<script src="js/bootstrap.min.js"></script>
</body>
</html>
