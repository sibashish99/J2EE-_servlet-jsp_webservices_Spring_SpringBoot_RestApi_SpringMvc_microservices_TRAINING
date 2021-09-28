<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
 <h1>List of names</h1>
 <c:out value="${name} ${location}"></c:out>

 <% session.invalidate(); %>
 <a href="Fourth.jsp" >Link</a>
</body>
</html>