<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="./css/loginpage25194d.css" />
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css"/>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css"/>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script> 

<title>点评经济首页</title>
<style type="text/css">
body{
	-webkit-font-smoothing: antialiased;
    background-color: #ffffef;
    font: 12px/1.5 Microsoft YaHei, tahoma, arial, Hiragino Sans GB, \\5b8b\4f53, sans-serif;}
.nav li{   
	background-color: #fff;  
	padding: 8px 40px;    
	float: left;   
	list-style: none;   
	color:#fff; 
	font-size:24px; }
*{margin:0;padding: 0;list-style: none;text-decoration: none;}
.navigate_blur{
	width: 700px;
	height: 50px;
	background: #d3a4ff;
	margin: 0 auto;
	text-align:center}
.navigate_blur a{color:#fff}
ul{background: #d3a4ff}
ul li{
	background-color: #ff5151 ; 
	float:left; 
	display:block; 
	height: 50px;
	width:175px; 
	line-height: 50px; 
	padding: 0 20px; 
	position: relative;
	font-size:24px;
	color:#fff;}
ul li:hover{background: #cea;}
ul li ul li{float: none;
	font-size:19px;}
/*关键一：将二级菜单设置为display：none;*/
ul li ul{position: absolute;top:50px;left: 0; display: none;}
ul li ul li:hover{background: red;}
/*关键二：在划过二级菜单从属的一级菜单时，设置为display:block;*/
ul li:hover ul{display: block;}

#header_logo{float:left;
	}
.header_link{float:right}
.clear{clear:left;}
.body{
	width:1100px;
	margin:0px auto;}
.title{width:550px}
.top_half_page{width:1100px;
	margin:0px auto;}
.headline{width:550px;
	
	float:left}
.hot{width:550px;
	
	float:right}
.bottom_half_page{width:1100px;
	margin:0px auto;}
.secondary_title{width:365px;}
#laws{width:363px;
	border:1px solid #000099;
	float:left;
	margin:0px auto;
	}
#recommendation{width:370px;
	border:1px solid #000099;
	float:left;
	margin:0px auto;
	}
#latest_comments{width:365px;
	border:1px solid #000099;
	float:left;
	margin:0px auto;
	}
#body{width:1100px;background-color:#fff;margin:0 auto}
.headline img{width:550px;height:400px;}
.img{position: relative;width:550px;height:40px;top:-40px}
.image{width:550px;height:400px}
.shadow{position: absolute; bottom:0;left: 0; width: 550px; height: 40px;  background: #000;}
.opacity{  
      filter:alpha(opacity=50);  
      -moz-opacity:0.5;  
      -khtml-opacity: 0.5;  
      opacity: 0.5;  
} 
._row{width:550;height:190;padding:20px}
.left{float:left;width:250px;height:140px} 
.right{float:right;width:250px;height:140px}   
</style>

<script type="text/javascript">

</script>
</head>

<body>
<div id="body">
<div class="header">
   <%@ include file="WEB-INF/views/pageHeader.jsp" %>
</div>

<div class="navigate_blur" style="">
    <ul>
    		<li ><a href="/dpjj">首页</a>
                    
                    </li>
  					<li >经济大家评
                    	<ul>
                			<li><a href="comment/insurance/enterpriselist.html">保险大家评</a></li>
                    		<li><a href="comment/bank/enterpriselist.html">银行大家评</a></li>
                    		<li><a href="comment/security/enterpriselist.html">证券大家评</a></li>
                		</ul>
                    </li>
  					<li>公共服务
                    	<ul>
                	<li><a href="community/communitytipslist.html">互助论坛</a></li>
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
</div>



<div class="body" style="z-index:0;text-align:center;">
	<div class="top_half_page">
    	<div class="headline" style="z-index:0">
        	
                            <div class="image" style="z-index:0">                            
                            <img id="image" style="z-index:0" src="images/test/1.jpg" name="" alt="图片无法显示">
                            </div>
                            <div class="img" style="z-index:0">                            
                        		<span id="shadow" class="shadow opacity" style="font-size:30px;color:#fff"><strong>图片新闻标题位置</strong></span>
                            </div>
                
        </div>
        <script type="text/javascript">
        (function(){
        	$.ajax({
				url:"getnews/headline/title",
				type:"GET",
				asyn:true,
				dataType:"json",
				success: function(res){
					var title=res.data.title;
					var element=document.getElementById("shadow");
					element.innerHTML="<strong>"+title+"</strong>";
					var image=document.getElementById("image");
					image.src="getnews/hot/image?id="+res.data.id;
					image.name=res.data.id;
					return;
				},
				error:function(e){
					return;
				}
			});
        })()
			
		</script>
        <div class="hot">
        	<input id="index1" type="hidden" value="0"/>
        	<input id="index2" type="hidden" value="0"/>
        	<div class="hot_table_head"><strong>热门资讯</strong><a href="#" onclock="getwholenews()">更多</a></div>
        	<div id="hot" class="hot_table_body">
        	<div class="_row">
        		<div class="small_paper" id="567">
			  		<img class="left" src="images/test/baoxian1.jpg" alt="first"/>
        		</div><!-- /.col-lg-4 -->
				<div class="small_paper" id="123">
			  		<img class="right" src="images/test/baoxian2.jpg" alt="first"/>
        		</div><!-- /.col-lg-4 -->
        		<p class="clear"></p>
        	</div>
      		<div class="_row">
				<div class="small_paper" id="234">
			  		<img class="left" src="images/test/baoxian3.jpg" alt="first"/>
        		</div><!-- /.col-lg-4 -->
        		<div class="small_paper" id="234">
			  		<img class="right" src="images/test/baoxian3.jpg" alt="first"/>
        		</div>
        		<p class="clear"></p>
      		</div>
        	</div>
        </div>
        <p class="clear"></p>
        <script type="text/javascript">
    
    		var index1 = $("#index1").val();
    		var index2 = $("#index2").val();
    		var counter = 4;
    		function getwholenews(){
    			var url1 = "/getnews/hot/titles?index1="+index1+"&index2="+index2;	
    			var element=document.getElementById("hot");
    			var div = document.createElement("div");
				$.ajax({
    				url: url1,
    				type:GET,
    				asyn:true,
    				dataType:"json",
    				success: function(res){
    					$("#index1").val(index1+counter),$("#index2").val(index2+counter);
    					var title=res.data.title;
    					var id=res.data.id;
    					var url2 = "/getnews/hot/iamge?id="+id;
    					var news="<div class=\"content\">"+title[0]+"<a href=\"shownews?id="+id[0]+"\"><img src=\""+"/getnews/hot/iamge?id="+id[0]+"\" alt=\"无法加载\"/></a></div>"
    								+"<div class=\"content\">"+title[1]+"<a href=\"shownews?id="+id[1]+"\"><img src=\""+"/getnews/hot/iamge?id="+id[1]+"\" alt=\"无法加载\"/></a></div>"
    								+"<div class=\"content\">"+title[2]+"<a href=\"shownews?id="+id[2]+"\"><img src=\""+"/getnews/hot/iamge?id="+id[2]+"\" alt=\"无法加载\"/></a></div>"
    								+"<div class=\"content\">"+title[3]+"<a href=\"shownews?id="+id[3]+"\"><img src=\""+"/getnews/hot/iamge?id="+id[3]+"\" alt=\"无法加载\"/></a></div>";
    					element.innerHTML=news;
    					return;
    				},
    				error:function(e){
    					element.innerHTML="无法加载"
    					return;
    				}
    			});
    			
    		}
    		getwholenews();
    		
		</script>
    </div>
    
    <div class="bottom_half_page" style="text-align:center;">
    	<div id="laws">
        	<div class="secondary_title">政策法规</div>
            <div class="content"></div>
        </div>
        <div id="recommendation">
        	<div class="secondary_title">热门推荐</div>
            <div class="content"></div>
        </div>
        <div id="latest_comments">
        	<div class="secondary_title">最新点评</div>
            <div class="content"></div>
        </div>
        <p class="clear"></p>
    </div>
    <script>
	var url3="getlaws",url4="getrecommendations",url5="getcomments",
		href1="showlaw",href2="showrecommendation",href3="showcomment";
	var element=document.getElementById("laws").lastElementChild;
	var innerhtml="";
	function getSource(url,href){
		$.ajax({
			url:url,
			type:"GET",
			asyn:true,
			dataType:"json",
			success: function(res){
				var lines=res.data.lines;
				
				for(var i=0;i<line.length;i++){
					innerhtml+="<a class=\"line\" href=\""+href+"?id="+line[i].id+"\">"+lines[i].content+"</a></br>";
				}
				element.innerHTML=innerhtml;
				return;
			},
			error:function(e){
				return;
			}
		});
	}
	getSource(url3,href1);
	getSource(url4,href2);
	getSource(url5,href3);
	$(document).ready(function(){
		$("#image").click(function(){
			var id=$(this).attr("name");
			window.location.href="shownews?id="+id
		})
	})
	</script>
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
</body>
</html>