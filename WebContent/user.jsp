<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
springmvc欢迎你！
<hr>
<h2>方法名称</h2>
${method }
<hr>
<form action="addUser" method="post">
	<input type="submit" value="post提交1"/>
</form>
<form action="deleteUser" method="post">
	<input type="submit" value="post提交2"/>
</form>
</body>
</html>