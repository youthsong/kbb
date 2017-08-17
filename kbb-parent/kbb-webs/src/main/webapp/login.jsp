<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head xmlns="http://www.w3.org/1999/xhtml">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/skin_/login.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.select.js"></script>
<title>上船吧后台管理系统_用户登录</title>
</head>
<body>
<div id="container">
    <div id="bd">
    	<div id="main">
        	<div class="login-box">
                <div id="logo"></div>
                <h1></h1>
                
             <!--  后台登录的表单 -->
             <form action="${pageContext.request.contextPath }/login.action" method="post" >
                <div class="input username" id="username">
                    <label for="userName">用户名</label>
                    <span></span>
                    <input type="text" id="userName" name="managerUserName" />
                </div>
                <div class="input psw" id="psw">
                    <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
                    <span></span>
                    <input type="password" id="password" name="managerPassWord"/>
                </div>
<!--                 <div class="input validate" id="validate"> -->
<!--                     <label for="valiDate">验证码</label> -->
<!--                     <input type="text" id="valiDate" /> -->
<!--                     <div class="value">X3D5</div> -->
<!--                 </div> -->
<!--                 <div class="styleArea"> -->
<!--                     <div class="styleWrap"> -->
<!--                         <select name="style"> -->
<!--                             <option value="默认风格">默认风格</option> -->
<!--                             <option value="红色风格">红色风格</option> -->
<!--                             <option value="绿色风格">绿色风格</option> -->
<!--                         </select> -->
<!--                     </div> -->
<!--                 </div> -->
                <div id="btn" class="loginButton">
                    <span style="color: red">${erromessage }</span>
                    <input type="submit" class="button" value="登录"  />
                </div>
            </form>    
                
            </div>
        </div>
        <div id="ft">CopyRight&nbsp;2017&nbsp;&nbsp;版权所有&nbsp;&nbsp;<a href="http://www.mycodes.net/" target="_blank">上船吧</a> &nbsp;&nbsp;</div>
    </div>
   
</div>

</body>
<script type="text/javascript">
	var height = $(window).height() > 445 ? $(window).height() : 445;
	$("#container").height(height);
	var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
	$('#bd').css('padding-top', bdheight);
	$(window).resize(function(e) {
        var height = $(window).height() > 445 ? $(window).height() : 445;
		$("#container").height(height);
		var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
		$('#bd').css('padding-top', bdheight);
    });
	$('select').select();
	
// 	$('.loginButton').click(function(e) {
//         document.location.href = "main.html";
//     });
</script>

</body>
</html>