<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../resources/js/jquery.min.js"></script>
<script type="text/javascript" src="../resources/js/main.js"></script>
</head>
<script type="text/javascript">

$(function(){
	$("#btnAdd").click(function(){
		var username = $("#username").val();
		var age = $("#age").val();
		var user = {
				username:username,
				age:age
		};
		var url = "addUser4";
		/* ajax_post(url,user,{success:function(data){
			alert("name==="+data.username+",age==="+data.age);
		}
		}); */
		$.ajax({
			url:"addUser4",
			data:user,
			type:"get",
			dataType:"json",
			success:function(data){
				alert("name==="+data.username+",age==="+data.age);
			}
		});
	});
});
</script>
<body>
<hr>
<h2>添加用户</h2>
<hr>
<form action="addUser3" method="post">
	姓名:<input id="username" type="text" name="username"/>
	年龄:<input id="age" type="text" name="age"/>
	<input type="submit" value="添加"/>
	<input id="btnAdd" type="button" value="ajax添加">
</form>
</body>
</html>