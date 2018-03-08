<%@ page language="java" import="java.util.*,main.java.com.core.webUtil.WebConstants" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String userId=(String)session.getAttribute(WebConstants.CURRENT_USER);

%>

<!DOCTYPE html>
<html lang="zh_CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="shortcut icon" href="favicon.ico">
	<title>点评经济</title>



	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->

   <script type="text/javascript">
   
   $("#logout").click(function(){
	   var bool=confirm("请确认是否注销？")
	   if(!bool) return false;
	   window.location.href="<%=basePath%>logout";
   })
   </script>
  </head>
  
  <body>
   <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8 " style="float:left">
            <span class="visible-md visible-lg" style="height:60px;padding-top:20px">
            	<img src="<%=basePath%>images/header_logo.png"/>
            	点评经济
            </span>
        </div>
        <div class="col-xs-6 col-sm-4 col-md-4 col-lg-4" style="">
            <span class="visible-md visible-lg" style="height:60px;padding-top:20px">
            
            <%if(null==userId||""==userId){ %>
            <a class="tag" href="../../login/enterpriseUser/login.html">企业登录</a>&nbsp;|&nbsp;
            <a class="tag" href="../../login/generalUser/login.html">个人登录</a>&nbsp;|&nbsp;
            <a class="tag" href="../../regist/enterpriseregistpage.html">企业注册</a>&nbsp;|&nbsp;
            <a class="tag" href="../../regist/generalregistpage.html">个人注册</a> 
            <%}else{ %>
            <a class="tag" >${user_info.userName}</a>&nbsp;|&nbsp;
          	您好！
            <a class="tag" id="logout">注销</a>&nbsp;|&nbsp;
            <% }%>
            </span>
        </div> 
  </body>
</html>
