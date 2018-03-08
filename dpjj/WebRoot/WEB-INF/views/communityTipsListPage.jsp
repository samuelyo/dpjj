<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh_CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" conten
t="width=device-width, initial-scale=1">
	
	<link rel="shortcut icon" href="favicon.ico">
	<title>互助论坛</title>
	<link href="../css/bootstrap.css" rel="stylesheet">

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    
   	<script src="../js/jquery/jquery-3.1.1.min.js"></script>
<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;text-decoration:none;}
body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体";}
#page-wrap{width:100%;margin:25px 0px 25px 0px;} 
/* 一级 */
ul.dropdown{width:100%;}
ul.dropdown li{font-weight:bold;width:100%;background:#FCF;position:relative;border: 1px solid #96a5b4;border-radius: 3px;}
ul.dropdown a:hover{color:#000;}
ul.dropdown li a{display:block;padding:20px 8px;color:#FFF;position:relative;z-index:2000;font-size:18px}
ul.dropdown li a:hover,
ul.dropdown li a.hover{background:#F3D673;position:relative;}
/* 二级 */
ul.dropdown ul{display:none;position:absolute;top:0;left:0;width:100%;z-index:1000;}
ul.dropdown ul li{font-weight:normal;background:#f6f6f6;color:#000;border-bottom:1px solid #ccc;}
ul.dropdown ul li a{display:block;background:#c00 !important;font-size:18px} 
ul.dropdown ul li a:hover{display:block;background:#F3D673 !important;}

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
	.tip_title{
	font-size:2vw;
	}
 
}
@media only screen and (max-width:600px){
	.tip_title{
	font-size:3vw;
	}
 
}

.hot_tip_content{
	overflow:hidden;
text-overflow: ellipsis;
display:-webkit-box;
-webkit-line-clamp:7;
-webkit-box-orient:vertical;
}

	</style>

<script type="text/javascript" src="../js/dropDown.js"></script>
</head>

<body>
<input id="" type="hidden" value=""/>
<div class="container">
		<%@ include file="pageHeader.jsp" %>
		<div class="row visible-on">
			<div class="col-xs-5 col-sm-5 col-md-12 col-lg-12 "
				style="z-index:1000 ;background-color:#ff5151">
				<span class="navigate_blur visible-md visible-lg"
					style="height:60px;padding-top:0px">
					<ul class="nav nav-tabs">
						<li><a href="../" id="home_a"
							style="padding:7px 15px 7px 15px;">首页</a></li>
						<li>经济大家评
							<ul>
								<li><a href="../comment/insurance/enterpriselist.html">保险大家评</a></li>
								<li><a href="../comment/bank/enterpriselist.html">银行大家评</a></li>
								<li><a href="../comment/bank/enterpriselist.html">证券大家评</a></li>
							</ul>
						</li>
						<li>公共服务
							<ul>
								<li><a href="../community/communitytipslist.html">互助论坛</a></li>
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
<div class="container" >
	<div class="row">
    	<div class="col-lg-3 col-md-3 visible-lg visible-md commendation-tips">
        	<div class="row" style="border:2px #F00 solid;background-color:#2FF">
            	<div class="col-lg-12 col-md-12 " style="border-bottom:2px #F00 solid;font-size:24px;font-weight:600;padding:20px">热文推荐</div>
            	<div class="col-lg-12 col-md-12 ">
                	<br>
                	<p id="" style="font-size:18px">我与保险行业二三事</p>
                    <hr>
                    <span class="glyphicon glyphicon-heart">36</span>
                    <hr>
                    <div class="hot_tip_content">
                    	问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番
                    </div>
                    <hr>
                </div>
                <div class="col-lg-12 col-md-12 ">
                	<br>
                	<p style="font-size:18px">我与保险行业二三事</p>
                    <hr>
                    <span class="glyphicon glyphicon-heart">36</span>
                    <hr>
                    <div class="hot_tip_content">
                    	问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番
                    </div>
                    <hr>
                </div>
            </div>
        </div>
        <script type="text/javascript">
        var div_template_header="<div class=\"col-lg-12 col-md-12 \" style=\"border-bottom:2px #F00 "
        				+"solid;font-size:24px;font-weight:600;padding:20px\">热文推荐</div>"
        
        function render_commendation(lines){
    		var panel=""+div_template_header;
    		for(var line in res.data.lines){
    			panel+="<div class=\"col-lg-12 col-md-12 \"><br><p id=\""
    				+line.tip_id
    				+"\" style=\"font-size:18px\">"
    				+line.tip_name
    				+"</p><hr><span class=\"glyphicon glyphicon-heart\">"
    				+line.like_num
    				+"</span><hr><div class=\"hot_tip_content\">"
    				+line.outline
    				+"</div><hr></div>";
    		}
    		panel+=div_template_footer;
    		$(".commendation-tips .row:eq(0)").html(panel);
    		return;
    	}
        $.ajax({
			url:"getrecommendtips",
			data:{num:"3"},
			type:"GET",
			asyn:true,
			dataType:"json",
			success: function(res){
				if(res.result=="success") render_commendation(res.data.lines);
				return;
			},
			error:function(e){
				return;
			}
		});
		
        
        </script>
        <div class="col-lg-9 col-md-9 col-xs-12 col-sm-12 all-tips-panel">
        	<div class="row">
            	<div class="col-lg-8 col-md-8 col-xs-12 col-sm-8">
                	<br>
                    
							<div id="big_map_tip" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
								
								<div class="carousel-inner">
									<div class="item active" id="7_8_9">
			  							<img id="" src="../images/test/tips_img4.jpg" alt="First slide">
			  							<div class="container">
											<div class="carousel-caption">
				  								<p>display something</p>
											</div>
			  							</div>
									</div>
				
								</div>
								
							</div>
    					<script type="application/javascript">
										
                        	$(".carousel-inner img").each(function(index, element) {
                                width=$(this).width()
								
								$(this).height(width*0.75)
                            });
							$(document).ready(function(){
								//alert(window.innerWidth)
								if(parseInt(window.innerWidth)<700){
									$.ajax({
										url:"getinsurancesorts",
										type:"GET",
										asyn:true,
										dataType:"json",
										success: function(res){
											if(res.result=="success") render_select(res.data.lines);
											return;
										},
										error:function(e){
											return;
										}
									});
									$("#sorts").show();
								}
							});
							
							function render_select(lines){
								$(".dropdown li ul").html("")
				    			$("#sorts").html("<option selected=\"selected\">全部</option>")
								
								for(var line in res.data.lines){
									var li="<li><a id=\"
										+line.category_id
										+\">"
										+line.category_name
										+"</a></li>"
					    			var option="<option id=\""
					    				+line.category_id
					    				+"\">"
					    				+line.category_name
					    				+"</option>"
					    			$(".dropdown li ul").append(li)
					    			$("#sorts").append(option)		
					    		}
					        	
					        	return;
					    	}
		        function render_bigmap(data){
		        	$(".carousel-inner img").each(function(index, element) {
						$(this).attr("src",data.map_url).attr("id",data.tip_id)
						$(this).parent().find(".carousel-caption").html("<p>"+data.tip_name+"</p>")
                    });		    		
		        	return;
		    	}
		        $.ajax({
					url:"getbigmaptips",
					type:"GET",
					asyn:true,
					dataType:"json",
					success: function(res){
						if(res.result=="success") render_bigmap(res.data);
						return;
					},
					error:function(e){
						return;
					}
				});
							
                        
									</script>
            	</div>
        		
            </div>
            <hr>
            <div id="sorts" style="display:none">
            
            <label>
            险种分类博文：
            <select id="select" class="form-control" >
            	<option >全部</option>
                <option >儿童险</option>  
    			<option >老人险</option>  
    			<option >财产险财产险</option>  
    			<option >交通险</option>  
    			<option selected="selected">意外险意外险意外险意外险</option>  
    			<option >商业险</option>  
    			<option >农业险农业险</option>  
    			<option >社会险</option>  
    			<option >家庭险</option>  
    			<option >交通险交通险交通险</option>
                <option >全部</option>
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
            <script type="text/javascript">
            
            $(document).ready(function(){
        		//alert(window.innerWidth)
        		if(parseInt(window.innerWidth)<700){
        			$("#sorts").show();
        		}
        	});
            </script>
            <div class="row tips-list">
            	<div id="123" name="father" class="col-lg-12 col-md-12 col-xs-12 col-sm-12" style="margin-top:20px;margin-bottom:20px">
                	<div id="tips" class="row">
                    	<div class="col-lg-3 col-md-3 col-xs-4 col-sm-4">
                        	<img class="img-responsive " src="../images/test/tip_img2.jpg" alt="帖文照片">
                        </div>
                        <div class="col-lg-8 col-md-8 col-xs-8 col-sm-8">
                        	<div class="row">
                            	<div class="col-lg-8 col-md-8 col-xs-12 col-sm-12 tip_title" >
                                	<table style="table-layout:fixed" class="table table-condensed table-bordered table-hover table-striped tip_title">
                                	<tr>
                                    	<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">我与保险行业二三事
										</td>
                                    </tr>
                                </table>
                                </div>
                                <div class="col-lg-4 col-md-4 col-xs-12 col-sm-12">
                                	作者：&nbsp;&nbsp;&nbsp;张三丰
                                </div>
                            </div>
                            <div class="row">
                            	<table style="table-layout:fixed" class="table table-condensed table-bordered table-hover table-striped" style="background-color:#fff;border:none">
                                	<tr>
                                    	<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;background-color:#fff;border:hidden" >问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番，真的能碰到很多问题。在回答我的问卷调查上，因为题目有三种类型，所以遍历的时候需要判断题目类型。并且最后要把填好的数据组装好，转换成Json数据格式，传给后台，而是
										</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="col-lg-1 col-md-1 col-xs-12 col-sm-12">
                        	<div class="row">
                        		<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-heart">36</span>
                        		</div>
                            	<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-pencil"></span>
                        		</div>
                            	<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-share"></span>
                        		</div>
                            </div>
                        </div>
                    </div>
                </div><!--一篇博文结束-->
               <div id="567" name="father" class="col-lg-12 col-md-12 col-xs-12 col-sm-12" style="margin-top:20px;margin-bottom:20px">
                	<div class="row">
                    	<div class="col-lg-3 col-md-3 col-xs-4 col-sm-4">
                        	<img class="img-responsive " src="../images/test/tip_img2.jpg" alt="帖文照片">
                        </div>
                        <div class="col-lg-8 col-md-8 col-xs-8 col-sm-8">
                        	<div class="row">
                            	<div class="col-lg-8 col-md-8 col-xs-12 col-sm-12 tip_title" >
                                	<table style="table-layout:fixed" class="table table-condensed table-bordered table-hover table-striped tip_title">
                                	<tr>
                                    	<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">我与保险行业二三事
										</td>
                                    </tr>
                                </table>
                                </div>
                                <div class="col-lg-4 col-md-4 col-xs-12 col-sm-12">
                                	作者：&nbsp;&nbsp;&nbsp;张三丰
                                </div>
                            </div>
                            <div class="row">
                            	<table style="table-layout:fixed" class="table table-condensed table-bordered table-hover table-striped" style="background-color:#fff;border:none">
                                	<tr>
                                    	<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;background-color:#fff;border:hidden" >问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番，真的能碰到很多问题。在回答我的问卷调查上，因为题目有三种类型，所以遍历的时候需要判断题目类型。并且最后要把填好的数据组装好，转换成Json数据格式，传给后台，而是
										</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="col-lg-1 col-md-1 col-xs-12 col-sm-12">
                        	<div class="row">
                        		<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-heart">36</span>
                        		</div>
                            	<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-pencil"></span>
                        		</div>
                            	<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-share"></span>
                        		</div>
                            </div>
                        </div>
                    </div>
                </div><!--一篇博文结束-->
                <div  id="789" name="father" class="col-lg-12 col-md-12 col-xs-12 col-sm-12" style="margin-top:20px;margin-bottom:20px">
                	<div class="row">
                    	<div class="col-lg-3 col-md-3 col-xs-4 col-sm-4">
                        	<img class="img-responsive " src="../images/test/tip_img2.jpg" alt="帖文照片">
                        </div>
                        <div class="col-lg-8 col-md-8 col-xs-8 col-sm-8">
                        	<div class="row">
                            	<div class="col-lg-8 col-md-8 col-xs-12 col-sm-12 tip_title" >
                                	<table style="table-layout:fixed" class="table table-condensed table-bordered table-hover table-striped tip_title">
                                	<tr>
                                    	<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">天下之大多一份保险，多一份安全
										</td>
                                    </tr>
                                </table>
                                </div>
                                <div class="col-lg-4 col-md-4 col-xs-12 col-sm-12">
                                	作者：&nbsp;&nbsp;&nbsp;张三丰
                                </div>
                            </div>
                            <div class="row">
                            	<table style="table-layout:fixed" class="table table-condensed table-bordered table-hover table-striped" style="background-color:#fff;border:none">
                                	<tr>
                                    	<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;background-color:#fff;border:hidden" >问卷调查页面显示
由于最近做的项目有一个问卷调查模块，而问卷模块需要一个预览你设计的问卷功能，而在网上案例都是固定的题目，而我的题目都是重数据库调用，这就需要使用JQuery的遍历，因为没有这样的案例，所以我觉得有必要写一写，之前对于JQuery不是很懂，在成功做出之前，确实让自己很痛苦，像老师和同学问了很多，真正的体会到，学一门东西，还需要去实践一番，真的能碰到很多问题。在回答我的问卷调查上，因为题目有三种类型，所以遍历的时候需要判断题目类型。并且最后要把填好的数据组装好，转换成Json数据格式，传给后台，而是
										</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="col-lg-1 col-md-1 col-xs-12 col-sm-12">
                        	<div class="row">
                        		<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-heart">36</span>
                        		</div>
                            	<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-pencil"></span>
                        		</div>
                            	<div class="col-lg-12 col-md-12 col-xs-4 col-sm-4" style="border:1px solid #999">
                        			<span class="glyphicon glyphicon-share"></span>
                        		</div>
                            </div>
                        </div>
                    </div>
                </div><!--一篇博文结束-->
            </div>
        	<span class="visible-lg visible-md">
        		<hr>
                	<strong><button type="button" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-plus"></span> 更多帖文</button></strong>
            </span>
        </div>
	
</div>

<script type="text/javascript">
function render_tips(lines,obj){
	
	for(var i=0;i<lines.length;i++){
		var item_line="<div id=\""
					+lines[i].tip_id
					+"\" name=\"father\" class=\"col-lg-12 col-md-12 col-xs-12 col-sm-12\" style=\"margin-top:20px;margin-bottom:20px\"><div class=\"row\">"
					+"<div class=\"col-lg-3 col-md-3 col-xs-4 col-sm-4\"><img class=\"img-responsive \" src=\""
					+lines[i].map_url
					+"\" alt=\"帖文照片\">"
					+"</div><div class=\"col-lg-8 col-md-8 col-xs-8 col-sm-8\"><div class=\"row\"><div class=\"col-lg-8 col-md-8 col-xs-12 col-sm-12 tip_title\" >"
					+"<table style=\"table-layout:fixed\" class=\"table table-condensed table-bordered table-hover table-striped tip_title\"><tr>"
					+"<td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;\">"
					+lines[i].tip_name
					+"</td></tr></table></div><div class=\"col-lg-4 col-md-4 col-xs-12 col-sm-12\">作者：&nbsp;&nbsp;&nbsp;"
					+lines[i].tip_user_name
					+"</div></div><div class=\"row\"><table style=\"table-layout:fixed\" class=\"table table-condensed table-bordered table-hover "
					+"table-striped\" style=\"background-color:#fff;border:none\"><tr><td style=\"overflow:hidden;white-space:nowrap;text-overflow:ellipsis;background-color:#fff;border:hidden\" >"
					+lines[i].outline
					+"</td></tr></table></div></div><div class=\"col-lg-1 col-md-1 col-xs-12 col-sm-12\"><div class=\"row\"><div class=\"col-lg-12 col-md-12 col-xs-4 col-sm-4\""
					+" style=\"border:1px solid #999\"><span class=\"glyphicon glyphicon-heart\">"
					+lines[i].like_num
					+"</span></div><div class=\"col-lg-12 col-md-12 col-xs-4 col-sm-4\" style=\"border:1px solid #999\"><span class=\"glyphicon glyphicon-pencil\"></span></div>"
					+"<div class=\"col-lg-12 col-md-12 col-xs-4 col-sm-4\" style=\"border:1px solid #999\"><span class=\"glyphicon glyphicon-share\"></span>"
					+lines[i].comment_num
					+"</div></div></div></div></div>"
        obj.append(item_line);
	}
}
var max_lines_length=10;
var last_tip_id=0;
function getTips(){
	if(window.innerWidth>800){
		if($(".dropdown li ul li .active")){
			
		}
	}else{
		
	}
	$.ajax({
		url:"gettiplines?category_id="+category_id+"&last_tip_id="+last_tip_id,
		type:"GET",
		asyn:false,
		dataType:"json",
		success:function(res){
			if("success"==res.result.trim()){
				$("#tips").html("")
				last_tip_id=res.data.lines[res.data.lines.length-1].comment_id;
				var user_tip=$("#tips");
				render_tips(lines,user_comments);
			}
		},
		error:function(res){
			return;
		}
	})
}
getTips();
</script>
     <div style="position:absolute;width:100%;right:18%;top:150px" class="visible-lg visible-md">
    <div style="float:right;border-radius:3px;border:2px double #36F;padding:10px;background-color:#Fdd" >
      <label style="font-size:18px">当前保险分类：<br>
        <br>
        <input type="text" id="classify" disabled="disabled" style="font-size:18px;border-radius:3px" value="全部险种"/>
      </label>
      <br>
      <br>
      <ul class="dropdown " style="text-align:center">
        <li style="height: 63px;"> <a href="" class="">险种分类帖文<img src='../images/down-arrow.png' /></a>
          <ul class="sub_menu" style="display: none; padding-top: 63px; top: 0px;">
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

	<jsp:include page="pageFooter.jsp"></jsp:include>
	<script type="text/javascript">
	$(document).ready(function(){
		$(".btn.btn-default.btn-sm").click(function(){
			getTips();
		})
		$("div[name=father] img,div[name=father] td,div[name=father] .glyphicon-pencil").click(function(){ //进入帖文详情页面
			var tipid=$(this).parent("div[name=father]").attr("id")
			window.location.href="showtippage?tipid="+tipid
		})
		$("div[name=father] .glyphicon-heart").click(function(){ //点赞
			var tipid=$(this).parent("div[name=father]").attr("id")
			window.location.href="showtippage?tipid="+tipid
		})
		$("div[name=father] .glyphicon-share").click(function(){ //分享和写帖文都进入编辑帖文页面
			var tipid=$(this).parent("div[name=father]").attr("id")
			window.location.href="showtippage?tipid="+tipid
		})
	})
	</script>
	
	<div id="edit_tip" style="position:fixed;bottom:0px,right:0px;text-align:center">
		<button type="button" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-edit"></span>写帖文</button>
	
	</div>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>