<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户注册</title>
		<script type="text/javascript" src="/js/regutils.js" ></script>
		<script>
			function showTips(spanID,msg){
				var span = document.getElementById(spanID);
				span.innerHTML = msg;
			}
			function checkPassword(){
				var uPass = document.getElementById("password").value;				
				var span = document.getElementById("span_password");			
				if(uPass.length < 6){
					span.innerHTML = "<font color='red' size='2'>密码不能小于6位</font>";
					return false;
				}else{
					span.innerHTML = "<font color='red' size='2'>密码可用</font>";
					return true;
				}
			}
			function checkRePassword(){
				var uPass = document.getElementById("password").value;
				var uRePass = document.getElementById("repassword").value;				
				var span = document.getElementById("span_repassword");
				if(uPass != uRePass){
					span.innerHTML = "<font color='red' size='2'>两次密码必须一致</font>";
					return false;
				}else{
					span.innerHTML = "";
					return true;
				}
			}
			function checkMail(){
				var umail = document.getElementById("email").value;			
				var flag = checkEmail(umail);			
				var span = document.getElementById("span_email");
				if(flag){
					span.innerHTML = "<font color='red' size='2'>邮箱可用</font>";
					return true;
				}else{
					span.innerHTML = "<font color='red' size='2'>邮箱格式错误</font>";
					return false;
				}
			}
			
			function checkForm(){
				var flag = checkPassword() && checkRePassword() && checkMail();
				return flag;
			}
			
		</script>
	</head>
	<body>
		<form action="${pageContext.request.contextPath}/RegisterServlet" method="post">
			用户名 <input type="text" id="username"/> *<br />
			密码 <input type="password" id="password" onblur="checkPassword()"/> *<span id="span_password"></span><br />
			确认密码 <input type="password" id="repassword" onblur="checkRePassword()"/> *<span id="span_repassword"></span><br />
			性别 <input type="radio" name="sex" value="男" checked="checked">男  <input type="radio" name="sex" value="女">女 <br> 
			邮箱 <input type="text" id="email" onblur="checkMail()" /><span id="span_email"></span><br />
			
			<input type="submit" value="提交" />
		</form>
	</body>
</html>