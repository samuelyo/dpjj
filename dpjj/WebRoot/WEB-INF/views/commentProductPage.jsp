<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="zh_CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="shortcut icon" href="favicon.ico">
	<title>点评经济</title>
	<link href="../../css/bootstrap.css" rel="stylesheet">

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="../../css/carousel.css" rel="stylesheet">
   <script src="../../js/jquery/jquery-3.1.1.min.js"></script>
<style type="text/css">
.navigate_blur{
	width: 700px;
	height: 50px;
	margin: 0 auto;
	text-align:center}

.nav li{
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
.nav li:hover{background: #cea;}
.nav li ul li{float: none;
	font-size:19px;}
/*关键一：将二级菜单设置为display：none;*/
.nav li ul{position: absolute;top:50px;left: 0; display: none;padding:0 0 0 0}
.nav li ul li:hover{background: red;}
/*关键二：在划过二级菜单从属的一级菜单时，设置为display:block;*/
.nav li:hover ul{display: block;}

.nav a{color:#fff ;text-decoration:none;}
#home_a:hover{background-color:#cea}

.small_paper{border:1px solid #faa}
	</style>
</head>

<body>
<input id="domain" type="hidden" value="${domain}"/>
<input id="id" type="hidden" value="${id}"/>
<input id="page_total" type="hidden" value="${page_total}"/>
<div class="container" >
    <%@ include file="pageHeader.jsp" %>
    <div class="row visible-on" >
        <div class="col-xs-5 col-sm-5 col-md-12 col-lg-12 " style="z-index:1000 ;background-color:#ff5151" >
            <span class="navigate_blur visible-md visible-lg" style="height:60px;padding-top:0px">
            
            	<ul  class="nav nav-tabs">
  					<li ><a href="../../"  id="home_a" style="padding:7px 15px 7px 15px;">首页</a>
                    
                    </li>
  					<li >经济大家评
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
	
	<div class="container searchbar" style="margin-bottom:">
	  <form class="form-inline" role="search">
	    <div class="row" style="margin:0px 0px 20px 0px;background-color:#C33">
          <div class="form-group col-xs-3 col-md-2 col-md-offset-1">
        	<button type="button" class="btn btn-primary btn-lg" style="margin:10px 0px">
  				<span class="glyphicon glyphicon-user"></span> 吐槽
			</button>
          </div>
		  <div class="form-group col-xs-6 col-md-3 col-md-offset-3 input-group-lg" >
		    <input type="text" class="form-control" placeholder="保险产品名" style="margin:10px 0px">
		  </div>
		  <div class="col-xs-3 col-md-1">
		    <button type="submit" class="btn  btn-lg" style="margin:10px 0px;padding:10px">search</button>
		  </div>
		</div>
	  </form>
	</div>
	
	
	<!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div id="content_container" class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-md-6 col-lg-6 small_paper" id="567">
		  <div class="row">
		    <div class="col-xs-4 col-md-3 col-lg-3">
			 	<img class="img-responsive " id="567" src="../../images/test/baoxian1.jpg" alt="first">
			</div>
            <div class="col-xs-4 col-md-3 col-lg-3">
             	<div class="col-xs-12 col-md-12">
			    	<h3 class="insurance-score"><strong>No.1</strong></h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-score">9.9分</h2>
			  	</div>
			</div>
			<div class="col-xs-4 col-md-6 col-lg-6">
			   	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-enterprise">中国人保</h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<p class="insurance-product">xxx保险产品名</p>
			  	</div> 
            </div>
          </div>
        </div><!-- /.col-lg-4 -->
		<div class="col-md-6 col-lg-6 small_paper" id="123">
		  <div class="row">
		    <div class="col-xs-4 col-md-3 col-lg-3">
			 	<img class="img-responsive" id="123" src="../../images/test/baoxian2.jpg" alt="first">
			</div>
            <div class="col-xs-4 col-md-3 col-lg-3">
             	<div class="col-xs-12 col-md-12">
			    	<h3 class="insurance-rank"><strong>No.1</strong></h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-score">9.9分</h2>
			  	</div>
			</div>
			<div class="col-xs-4 col-md-6 col-lg-6">
			   	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-enterprise">中国人保</h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<p class="insurance-product">xxx保险产品名</p>
			  	</div> 
            </div>
          </div>
        </div><!-- /.col-lg-4 -->
      </div>
      <div class="row">
		<div class="col-md-6 col-lg-6 small_paper" id="234">
		  <div class="row">
		    <div class="col-xs-4 col-md-3 col-lg-3">
			 	<img class="img-responsive"  id="234" src="../../images/test/baoxian3.jpg" alt="first">
			</div>
            <div class="col-xs-4 col-md-3 col-lg-3">
             	<div class="col-xs-12 col-md-12">
			    	<h3 class="insurance-rank"><strong>No.1</strong></h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-score">9.9分</h2>
			  	</div>
			</div>
			<div class="col-xs-4 col-md-6 col-lg-6">
			   	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-enterprise">中国人保</h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<p class="insurance-product">xxx保险产品名</p>
			  	</div> 
            </div>
          </div>
        </div><!-- /.col-lg-4 -->
      
		<div class="col-md-6 col-lg-6 small_paper" id="345">
		  <div class="row">
		    <div class="col-xs-4 col-md-3 col-lg-3">
			 	<img class="img-responsive"  id="345" src="../../images/test/baoxian4.jpg" alt="first">
			</div>
            <div class="col-xs-4 col-md-3 col-lg-3">
             	<div class="col-xs-12 col-md-12">
			    	<h3 class="insurance-rank"><strong>No.1</strong></h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-score">9.9分</h2>
			  	</div>
			</div>
			<div class="col-xs-4 col-md-6 col-lg-6">
			   	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-enterprise">中国人保</h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<p class="insurance-product">xxx保险产品名</p>
			  	</div> 
            </div>
          </div>
        </div><!-- /.col-lg-4 -->
      </div>
      <div class="row">
		<div class="col-md-6 col-lg-6 small_paper" id="456">
		  <div class="row">
		    <div class="col-xs-4 col-md-3 col-lg-3">
			 	<img class="img-responsive"  id="456" src="../../images/test/baoxian4.jpg" alt="first">
			</div>
            <div class="col-xs-4 col-md-3 col-lg-3">
             	<div class="col-xs-12 col-md-12">
			    	<h3 class="insurance-rank"><strong>No.1</strong></h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-score">9.9分</h2>
			  	</div>
			</div>
			<div class="col-xs-4 col-md-6 col-lg-6">
			   	<div class="col-xs-12 col-md-12">
			    	<h4 class="insurance-title">中国人保</h2>
			  	</div>
			  	<div class="col-xs-12 col-md-12">
			    	<p class="insurance-product">xxx保险产品名</p>
			  	</div> 
            </div>
          </div>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->
	</div>
	
	<div class="container">
		<div class="row visible-on" style="text-align:center">
		<span class="visible-md visible-lg">
			<div class="col-md-2 col-lg-2">
  				<ul class="pager pager-lg">
    				<li class="next previous_page"><a >上一页</a></li>
    			</ul>
  			</div>
			<div class="col-md-8 col-lg-8" style="margin:0 auto">
  				<ul id="ul" class="pagination pagination-lg">
    				<!-- <li><a class="previous_page">«</a></li>
    				<li><a href="#">1</a></li>
    				<li><a href="#">2</a></li>
    				<li class="disabled"><a href="#">3</a></li>
    				<li><a href="#">4</a></li>
    				<li><a href="#">5</a></li>
    				<li><a href="#">6</a></li>
    				<li><a href="#">7</a></li>
    				<li><a href="#">8</a></li>
    				<li><a href="#">9</a></li>
    				<li class="active"><a href="#">10</a></li>
    				<li><a class="next_page">»</a></li> -->
  				</ul>
  			</div>
  			<div class="col-md-2 col-lg-2">
  				<ul class="pager pager-lg">
    				<li class="previous next_page"><a >下一页</a></li>
    			</ul>
  			</div>
  			</span>
  		</div>
	</div>
	<script type="text/javascript">
		var paper_counter=30;
		var li_counter=10;
		var li_flag_suf=7;//判断是否需要从新渲染导航条，使现在页面所处位置为导航条低于5号位
		var li_flag_inf=3;
		var flag=0;
		var start=0;
		var current_position=1;
		
		var li_template_header="<li><a >«</a></li>";
		var li_template_footer="<li><a >»</a></li>";
		var li_template_1="<li "
		var li_template_2="><a  id=\""
		var li_template_3="\" onclick=\"active_li(this)\"> ";
		var li_template_5="</a></li>"
		var li_template_active="class=\"active\""
		
		var div_template_header="<div class=\"row\">";
		var div_template_body="</div><div class=\"row\">"
		var div_template_footer="</div>"
		var page_total=parseInt($("#page_total").val());
		
		
		var pagination=""+li_template_header;
		function render_nav(start){
			for(var i=start,j=0;i<(li_counter<(page_total-start)?li_counter:(page_total-start))+start;i++,j++){
				pagination+=li_template_1
				if(i==flag){
					pagination+=li_template_active
					flag=100000
				}
				pagination+=li_template_2+(j+1)+li_template_3+(i+1)+li_template_5;
			}
			pagination+=li_template_footer;
			$(".pagination").html(pagination);
			pagination=li_template_header;
			if(i==0) active_li(document.getElementById("ul").childNodes[1].getElementsByTagName("a")[0]);
		}
		function render_div(lines){
			var counter=2;
			var panel=""+div_template_header;
			for(var line in res.data.lines){
				panel+="<div class=\"col-md-6 col-lg-6 small_paper\" id=\""
						+line.product_id
						+"\"><div class=\"row\"><div class=\"col-xs-4 col-md-3 col-lg-3\"><img class=\"img-responsive\" src=\""
						+line.img_path
						+"\" alt=\"first\"></div><div class=\"col-xs-4 col-md-3 col-lg-3\"><div class=\"col-xs-12 col-md-12\"><h3 class=\"insurance-rank\"><strong>No."
						+line.rank
						+"</strong></h2></div><div class=\"col-xs-12 col-md-12\"><h4 class=\"insurance-score\">"
						+line.score
						+"分</h2></div></div><div class=\"col-xs-4 col-md-6 col-lg-6\"><div class=\"col-xs-12 col-md-12\"><h4 class=\"insurance-enterprise\">"
						+line.enterprise_name
						+"</h2></div><div class=\"col-xs-12 col-md-12\"><p class=\"insurance-product\">"
						+line.product_name
						+"</p></div></div></div></div>"
				if(counter==1){
					panel+=div_template_body;
					counter=2;
					continue;
				}
				counter--;
			}
			panel+=div_template_footer;
			$("#content_container").html(panel);
			return;
		}
		function active_li(obj){
			var page_num=parseInt(obj.innerHTML.trim());
			//alert(page_num)
			var index1=(page_num-1)*paper_counter+1,index2=page_num*paper_counter;
			if(page_num>=5&&(page_num>li_flag_suf||page_num<li_flag_inf)){
				start=page_num-5;
				li_flag_suf=page_num+2;
				li_flag_inf=li_flag_suf-4;
				render_nav(start);
				var ele=document.getElementById("ul").getElementsByTagName("li").item(5);
			}else if(page_num<5){
				start=0;
				li_flag_suf=7;
				li_flag_inf=li_flag_suf-4;
				render_nav(start);
				var ele=document.getElementById("ul").getElementsByTagName("li").item(page_num);
			}else{
				if("NaN"==page_num.toString()) return false;
				var ele = obj.parentNode;
				var li_arr = ele.parentNode.getElementsByTagName("li");
				for(var i=0;i<li_arr.length;i++){		
					li_arr[i].setAttribute("class","")
				}
			}
			ele.setAttribute("class","active");
			$.ajax({
				url:"getnewproduct",
				data:{index1:index1,index2:index2},
				type:"POST",
				asyn:true,
				dataType:"json",
				success: function(res){
					if(res.result=="success") render_div(res.data.lines);
					return;
				},
				error:function(e){
					return;
				}
			});
			return false;
		}
	
		$(document).ready(function(){
			render_nav(start);
			$(".img-responsive,.insurance-rank,.insurance-score,.insurance-enterprise,.insurance-product").on("click",function(){
				var product_id=$(this).parent(".small_paper").attr("id");
				window.location.href="showscore?id="+product_id;
			})
			/* $("#carousel_container .item").on("click",function(){
				var id=$(this).attr("id");
				$.ajax({
					url:"../../shownews",
					data:{id:id},
					type:"GET",
					asyn:false,
					success: function(res){
						return;
					},
					error:function(e){
						return false;
					}
				});
			}) */
			 $(".previous_page ").on("click",function(){
				//var now_position = $("#ul .active").attr("id")
				var now_position=document.getElementById("ul").getElementsByClassName("active")[0].getElementsByTagName("a")[0].id;
				//alert(now_position)
				if(now_position==1) return false;
				var next_ele=document.getElementById("ul").getElementsByTagName("li")[parseInt(now_position)-1]
				var next_a=next_ele.getElementsByTagName("a")[0]
				//alert(next_a.innerHTML)
				active_li(next_a)
			})
			$(".next_page").on("click",function(){
				var now_position=document.getElementById("ul").getElementsByClassName("active")[0].getElementsByTagName("a")[0].id;
				//alert(now_position)
				var next_ele=document.getElementById("ul").getElementsByTagName("li")[parseInt(now_position)+1]				
				var next_a=next_ele.getElementsByTagName("a")[0]
				//alert(next_a.innerHTML)
				active_li(next_a)
			}) 
		})
	</script>
    <jsp:include page="pageFooter.jsp"></jsp:include>
	
	<script src="../../js/bootstrap.min.js"></script>
</body>
</html>