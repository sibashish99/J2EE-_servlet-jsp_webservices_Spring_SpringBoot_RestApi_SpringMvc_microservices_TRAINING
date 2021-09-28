<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@include file="menu.html" %>
 <%= session.isNew() %>
 <%= session.getId() %>
 
 <c:set var="location" value="chennai" scope="session" />
 <c:set var="name" value="ramesh" scope="session" />
 <c:out value="${'hello jsp'}" />
 <c:out value="from ${location} , hello ${name}" />

 <a href="showName.jsp">Next</a>
</body>
</html>