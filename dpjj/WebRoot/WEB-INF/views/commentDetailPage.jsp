<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="<%=basePath%>css/bootstrap.css" rel="stylesheet">
	<link href="<%=basePath%>css/insurance.css" rel="stylesheet">
	<script src="<%=basePath%>js/jquery/jquery-3.1.1.min.js"></script>
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
	<script type="text/javascript">
	function closeWin(){
		var terminal=$("#terminal").val()
		parseInt(terminal)?history.back():window.close()
	}
	</script>
  </head>
  
  <body >
    <div class="container" style="border:2px double #000">
    	<div class="row">
    	<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-md-offset-3" style="text-align:center">
    	<div style="width:100%;padding:5%"><h2>${title}</h2></div>
    	</div>
    	</div>
    	<div class="row">
    	<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-md-offset-3">
    	<button onclick="closeWin()">关闭详情</button>
    	</div>
    	</div>
    	<br>
    	<div class="row">
    	<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-md-offset-2">
    	<div style="width:100%;padding:5%">${content}</div>
    	</div>
    	</div>
    </div>
    <input id="terminal" type="hidden" value="${terminal}"/>
  </body>
  <script type="text/javascript">
	
</script>
</html>
