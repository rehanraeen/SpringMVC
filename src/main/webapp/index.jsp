<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String na = (String) request.getAttribute("name");
	List<String> fri = (List<String>) request.getAttribute("f");
	%>
	<h1>hii</h1>
	<h1>
		my name is
		<%=na%></h1>
	${name}
	<c:forEach items="${f}" var="j">
	<c:out value="${j}"></c:out>
	</c:forEach>
	
	
</body>
</html>