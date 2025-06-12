<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${ pageContext.request.contextPath }/form/join.do" method="post">
		아이디 : <input type="text" name="id"><br>
		암호 : <input type="text" name="password"><br>
		이름 : <input type="text" name="name"><br>
		<button type="submit">저장</button>
	</form>
</body>
</html>