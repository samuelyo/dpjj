<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<script>
(function() {

})();
</script>
<script>
(function()
{

})();
</script>
<html lang="zh-cmn">
	<head>
    	<title>点评经济登录平台</title>
        <meta name="renderer" content="webkit" />
        <meta name="save" content="history" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" type="text/css" href="<%=basePath %>css/loginpage25194d.css" />
        
    </head>
    <body>
		<script type="text/javascript">

		</script>
    	
    	<div class="container">
    		<div class="header">
        		<a class="header_logo" href="/">点评经济</a>
            	<!-- div class="header_link">
            		<a href="">基本版</a>
                	&nbsp;|&nbsp;
                	<a href="">English</a>
                	&nbsp;|&nbsp;
                	<a href="" target="_blank">手机版</a>
                	
            	</div> -->
        	</div>
        	<div class="content">

        	<div class="content_wrapper">
        		<div class="login_container" id="login">     
            		<iframe id="login_frame" name="login_frame" height="100%" scrolling="no" width="100%" frameborder="0" 
            			src="<%=basePath %>login/xlogin?referer={$refererURL}&role={$role}">
                    </iframe>  
                	<div class="login_box second_login_box" style="display:none;" >
                		<div class="login_box_header">
                    		<h1 class="login_box_title">点评经济平台登录</h1>
                    	</div>
                    	
                    	<div class="login_operate" id="web_login">
                    		<form id="loginform" onsubmit="return QMLogin.checkInput();" method="post" name="loginform" target="_self" autocomplete="on" >
                        		<div class="login_submit" style="">
                            		<input class="login_button" id="btlogin" name="btlogin" type="submit" value="登录" tabindex="5" />
                            	</div>
                        	</form>
                    	</div>
                    	<a class="login_box_forgotpassword" href="" target="_blank">忘记密码？
                    	</a>
                    	<div style="display:none;" id="switch" class="lineright" onmouseup="QMLogin.switchMode()"></div>
                	</div>
            	</div>
            	<div class="login_pictures">
            		<div class="login_pictures_picture" style="background-image:url('');background-position:234px 130px;"></div>
                	<div class="login_pictures_txt">
                		<p class="login_pictures_title">点评经济</p>
                    	<p>和您一起</p>
                    	<p>纵览经济</p>
                    	<p>做您经济生活中的</p>
                    	<p>最知心伙伴</p>
                    	<p class="login_pictures_info"><a href="" target="_blank">了解更多实事资讯</a></p>
                	</div> 
            	</div>
        	</div>
    	</div>
    	<div class="footer">
    		<a href="" target="_blank">关于我们</a>&nbsp;|&nbsp;
        	<a href="" target="_blank">服务条款</a>&nbsp;|&nbsp;
        	<a href="" target="_blank">客服中心</a>&nbsp;|&nbsp;
        	<a href="" target="_blank">联系我们</a>&nbsp;|&nbsp;
        	<a href="" target="_blank">帮助中心</a>&nbsp;|&nbsp;
        	<span class="gray">&copy;2016 - ¡­¡­¡­ +++++ Inc. All Rights Reserved.</span>
    	</div>
	</div>
	<script type="text/javascript">

(function()
{

})();
	</script>
</body>
</html>