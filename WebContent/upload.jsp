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

</script>
<body>
<hr>
<h2>文件上传</h2>
<hr>
<form action="upload2" method="post" enctype="multipart/form-data">
	选择文件:<input type="file" name="file"/>
	<input type="submit" value="上传"/>
</form>
</body>
</html>