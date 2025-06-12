<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${ pageContext.request.contextPath }/hello/hello.do">hello</a><br>
	<a href="${ pageContext.request.contextPath }/method/method.do">method</a><br>
	<a href="${ pageContext.request.contextPath }/form/joinForm.do">form</a><br>
	<a href="${ pageContext.request.contextPath }/ajax/resBody.do">resBody</a><br>
	<a href="${ pageContext.request.contextPath }/ajax/resBody.json">resBody</a><br>
	<a href="${ pageContext.request.contextPath }/ajax/resBodyVO.json">resBody VO</a><br>
	<a href="${ pageContext.request.contextPath }/ajax/resBodyVOList.json">resBody VO LIST</a><br>	
</body>
</html>