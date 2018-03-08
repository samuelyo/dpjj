<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=9"/>
<meta name="robots" content="all"/>
<meta name="keywords" content=""/>
<meta name="description" content="注册"/>
<meta name="author" content="dpjj"/>
<meta name="copyright" content="dpjj"/>
<meta http-equiv="pragma" content="no-cache"/>
<meta http-equiv="Cache-Control" content="no-cache, must-revalidate"/>
<meta http-equiv="expires" content="-1"/>
<title>点评经济平台帐号注册</title>
<link rel="stylesheet" href="<%=basePath %>css/index.css" type="text/css"/>
<link rel="stylesheet" href="<%=basePath %>css/g.css" type="text/css"/>
<style>
.clear{clear:left;}
.box_ {
	position: fixed
}

.cover {
	height: 981px
}

#enterBanner {
	display: block;
	width: 610px;
	height: 165px;
	background:
		url(//3gimg.qq.com/qq_product_operations/temp/enterBannerC.jpg)
		no-repeat center;
	margin-left: 60px;
	margin-top: 0;
	margin-bottom: -5px
}

.haomaTitle {
	position: relative;
	width: 604px;
	height: 80px;
	margin-left: 63px;
	border-bottom: 1px solid #ddd
}

.haomaTitle .haoma-inner {
	position: absolute;
	width: 100%;
	height: 25px;
	line-height: 25px;
	font-family: "微软雅黑";
	font-size: 18px;
	text-indent: 6px;
	border-left: 3px solid #59AfE4;
	margin-top: 50px;
	color: #616161
}

#haomaBox {
	width: 610px;
	height: 260px;
	position: fixed;
	background: #fff;
	left: 50%;
	top: 50%;
	margin-top: -130px;
	margin-left: -305px;
	z-index: 9999;
	background: url(//3gimg.qq.com/qq_product_operations/temp/enterC.jpg)
		no-repeat center;
	z-index: 1028;
	display: none;
	_position: absolute
}

#haomaBtn {
	display: block;
	width: 160px;
	height: 40px;
	background: url(//3gimg.qq.com/qq_product_operations/temp/enterBtn.jpg)
		no-repeat center;
	position: absolute;
	top: 180px;
	left: 365px
}

#haomaBox:hover {
	cursor: pointer
}

#haomaClose {
	display: block;
	width: 15px;
	height: 15px;
	background: url(//3gimg.qq.com/qq_product_operations/temp/closeBtn.png)
		no-repeat center;
	position: absolute;
	left: 590px;
	top: 5px;
	background-size: 100%
}

#to_good_num {
	display: block;
	width: 385px;
	height: 96px;
	background:
		url(//3gimg.qq.com/qq_product_operations/temp/ole_num_enter.png);
	margin-top: 150px;
	margin-left: 170px
}

#old_reg {
	display: block;
	width: 385px;
	height: 96px;
	background:
		url(//3gimg.qq.com/qq_product_operations/temp/good_num_enter.png);
	margin-top: 50px;
	margin-left: 170px
}

.phone_box_land {
	z-index: 5
}

.enterB {
	display: none
}

.cover {
	animation: fadeShow 1s ease-in-out;
	-webkit-animation: fadeShow 1s
}

#up_box .tips1 {
	padding-top: 5px;
	color: grey;
	padding-left: 189px;
	padding-top: 10px;
	line-height: 20px
}

.err_tips {
	background: rgba(0, 0, 0, 0)
		url(//6.url.cn/zc/chs/img/pwd_sprite.png?v=10081) no-repeat scroll 0
		-342px;
	color: #f66;
	padding-left: 16px;
	line-height: 32px;
	margin-top: 10px
}

.clr_006DB0 {
	color: #006DB0
}

.clr_808080 {
	color: grey
}

@
-webkit-keyframes fadeShow { 0%{
	opacity: .05
}

</style>
<script type="text/javascript"  src="<%=basePath %>js/json2.js"></script>
<script type="text/javascript"  src="<%=basePath %>js/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	var inputArr=["#other_email","#nick","#password","#password_again","#phone_num","#code"];
	var tipArr=["#email_info","#nick_info","#pwd_info","#password_again_info","#phone_info","#code_info"];
</script>

</head>
<body>
	<div class="web_notice" id="web_notice">
		<div class="web_notice_text" id="web_notice_text"></div>
	</div>
	<div class="cover" id="cover"></div>
	
	
	<div class="bg" id="hbg">
		<div class="container">
			<div class="header" id="hheader">
				<a href="" class="logo"
					target="_self" title=""><img src="../images/header_logo.png" alt="点评经济" /></a>	
			</div>
			<div class="content">
				<div class="left" id="lleft">
					<a id="nav_1" class="nav_box" href="javascript:void(0);"
						onmouseout="this.removeAttribute(&quot;_hover&quot;)"
						onmouseover="this.setAttribute(&quot;_hover&quot;,&quot;over&quot;)">
						<span class="dt nav_1">个人帐号注册</span> <span class="dd">普通用户注册通道</span> 
					</a> 	
				</div>
				
				<div class="right" id="rright">
					<div class="phone" id="phone_quick"></div>
					<div class="enterA" id="enterA" style="display: block;">
						
						<div class="haomaTitle" id="hmtitle">
							<div class="haoma-inner" id="haoma-inner">个人账号注册</div>
						</div>
						<script type="text/javascript">
						function hideTip(obj){
							
							for(var i=0;i<inputArr.length;i++){
								
								if("#"+obj.id==inputArr[i]){
									$(tipArr[i]).attr("class","tip hidden")
								}
							}
							
						}
						
						function checkTel(obj){
						    var isPhone = /^([0-9]{3,4}-)?[0-9]{7,8}$/;
						    var isMob=/^((\+?86)|(\(\+86\)))?(13[012356789][0-9]{8}|15[012356789][0-9]{8}|18[02356789][0-9]{8}|147[0-9]{8}|1349[0-9]{7})$/;
						    var isEmail = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
						    var value=obj.value.trim();
						    if(obj.id=="phone_num"&&(isMob.test(value)||isPhone.test(value)||value=="")){
						    	$("#phone_info").html("请输入手机号")
						        return true
						    }
						    if(obj.id=="other_email"&&(isEmail.test(value)||value=="")){
						    	$("#email_info").html("请输入邮箱")
						        return true
						    }
						    else if(obj.id=="phone_num"){
						    	$("#phone_info").html("该号码串不是手机号码或座机号码，请重新输入")
						    	$("#phone_info").attr("class","tip");
						        return false;
						    }else{
						    	$("#email_info").html("该号码串不是不是电子邮箱，请重新输入")
						    	$("#email_info").attr("class","tip");
						        return false;
						    }
						}	
						
						
						</script>
						<form action=""
							method="post">
							<div id="formArea">
								<div id="email_box" class="">
									
									<div class="box box_2">
										<label class="item" for="other_email">邮箱</label>
										<div id="mail_box" class="ipt_box nobg other"
											style="z-index:99">
											<div class="ipt_other">
												<div id="other_email_bg" class="bg_txt">
													<input id="other_email" type="text" class="new_txt"
														name="other_email" tabindex="3" autocomplete="off"
														maxlength="38" onclick="hideTip(this)" onblur="checkTel(this);"/>
												</div>
											</div>
										</div>
										<div class="info ">
											<table>
												<tbody>
													<tr>
														<td id="email_info" class="tip hidden">请输入邮箱</td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
								</div>
								<div class="box box_3" style="z-index:0">
									<label class="item" for="nick">昵称</label>
									<div class="ipt_box nick_ipt_box">
										<div id="nick_bg" class="bg_txt">
											<input type="text" class="new_txt" id="nick" name="nick"
												tabindex="6" style="z-index:0" maxlength="24"
												autocomplete="off" onclick="hideTip(this)">
										</div>
									</div>
									<div class="info">
										<table>
											<tbody>
												<tr>
													<td id="nick_info" class="tip hidden">请输入昵称</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="box box_4">
									<label class="item" for="password">密码</label>
									<div class="ipt_box">
										<div id="password_bg" class="bg_txt">
											<input type="password" class="new_txt" id="password"
												name="password" tabindex="7" maxlength="16" onclick="hideTip(this)">
										</div>
									</div>
									
									<div class="info pwd_info">
										<div class="tip hidden" id="pwd_info" style="padding-top:12px">请输入密码</div>
										<div class="pwd_tips hide" id="pwd_tips">
											<div class="default" id="pwd_tip1">长度为6-16个字符</div>
											<div class="default" id="pwd_tip3">不能包含空格</div>
											<div class="default" id="pwd_tip2">不能是9位以下纯数字</div>
											
										</div>
										
									</div>
								</div>
								<div class="box box_5">
									<label class="item" for="password_again">确认密码</label>
									<div class="ipt_box">
										<div id="password_again_bg" class="bg_txt">
											<input type="password" class="new_txt" name="pass_again"
												id="password_again" tabindex="8" maxlength="16" onclick="hideTip(this)">
										</div>
									</div>
									<div class="info">
										<table>
											<tbody>
												<tr>
													<td id="password_again_info" class="tip hidden">与密码不一致</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								
								
								<div id="phone_box" class="phone_box_land ">
									
									<div id="land_phone" class="box box_2 land_phone">
										<label class="item" for="phone_num"><span
											style="display:inline-block;text-align:center">联系电话</span></label>
										<div id="" class="ipt_box">
											<div class="ipt_other">
												<div id="phone_num_bg" class="bg_txt">
													<input id="phone_num" type="text" class="new_txt"
														name="phone_num" tabindex="20" autocomplete="off" onclick="hideTip(this)" onblur="checkTel(this);">
													
												</div>
											</div>
										</div>
										<div class="info">
											<table>
												<tbody>
													<tr>
														<td id="phone_info" class="tip hidden">请输入手机号</td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>	
								</div>
								
								<div class="box box_9" id="code_box" style="width:489px">
									<label class="item" style="padding-top:10px" for="code">验证码</label>
									<div id="code_area_img" class="" style="width:300px;float:right;">
										<div style="width: 163px;height: 38px;background: none;border: 1px solid #96a5b4;border-radius: 3px;float:right;">
											<input id="code" class="" type="text" name="code" 
											style="width:143px;border:none;padding:11px 10px;border-radius: 3px;"
												tabindex="18" autocomplete="off" maxlength="8" onclick="hideTip(this)"/> 
										</div>
										<img
											id="verifyimg"
											style="float:left;cursor:pointer;" width="130"
											height="40" src="<%=basePath %>kaptcha/kaptcha"
											title="点击换一张">
										<p class="clear"></p>
									</div>
									<div class="info">
										<table id="code_tips_tbl" class="" style="height: 49px;">
											<tbody>
												<tr>
													<td id="code_info" class="hidden"><span id="code_info_err"
														class="tips">验证码出错</span></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="box box_11">
									<div class="item"></div>
									<div id="submit_box" class="ipt_box">
										<div id="up_msg_err" class="err_tips hide" style="margin:-20px 0px 0px 0px">请阅读《隐私政策》并勾选</div>
										<div class="submit" style="padding-top:10px">
											<input type="button" value="立即注册" title="立即注册" tabindex="23"
												id="submit">
										</div>
									</div>
								</div>
								
								<div class="box box_11">
									<div class="item"></div>
									<div class="ipt_box">
										<div class="agree_box">
											<a name="agree" class="a_1" id="agree" tabindex="22">我已阅读并同意相关服务条款和隐私政策</a>
											<div id="x_box" class="x_box">
												<div id="x_switcher" title="点击查看用户协议"></div>
												<p>
													
													
													<a id="item_3" href="http://www.qq.com/privacy.htm"
														target="_blank" title="点击查看《隐私政策》">《隐私政策》</a><br>
												</p>
											</div>
										</div>
									</div>
									<div class="info"></div>
								</div>
							</div>
						</form>
					</div>
					
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<div class="footer" id="ffooter">
		Copyright <span>©</span>  [...] All Rights Reserved
		[...]版权所有
	</div>
	
	<script type="text/javascript">
	
	$(document).ready(function(e) {
		$("#submit").click(function(){
			for(var i=0;i<inputArr.length;i++){
				if(""==$(inputArr[i]).val()||"tip"==$(tipArr[i]).attr("class")){
					$(tipArr[i]).attr("class","tip");
					return false;
				}
			}
			
			if($("#agree").attr("class")!="a_1 checked"){
				$("#up_msg_err").attr("class","err_tips");
				return false;
			}
			//alert("成功")
			$.ajax({
				url: "/checkgeneralUserRegistPage.html",
				type:POST,
				asyn:false,
				dataType:"json",
				success: function(res){
					return;
				},
				error:function(res){
					
					return;
				}
			});
	
		});
		$("#agree").on("click",function(){
			$("#agree").attr("class",$("#agree").attr("class")=="a_1 checked"?"a_1":"a_1 checked");
			$("#agree").attr("class")=="a_1 checked"?
					$("#up_msg_err").attr("class","err_tips hide"):$("#up_msg_err").attr("class","err_tips");
		})
		
		$("#password").on("focus",function(){
			$("#pwd_tips").attr("class","pwd_tips");
			$("#password_again,#password").val("");
			$("#password_again_info").attr("class","tip hidden")
		});
		$("#password").on("blur",function(){
			$("#pwd_tips").attr("class","pwd_tips hide");
		});	
		$("#password_again").on("blur",function(){
			$("#password_again").val()==$("#password").val()?
					$("#password_again_info").attr("class","tip hidden"):$("#password_again_info").attr("class","tip")
		});	
	
		$("#verifyimg").on("click",function(e){
			$("#verifyimg").attr("src","<%=basePath %>kaptcha/kaptcha?random="+Math.random());
		});
		//$("#user_password,#user_name").on("keypress",checkCapsLock (event));
    });
	</script>
</body>
</html>
