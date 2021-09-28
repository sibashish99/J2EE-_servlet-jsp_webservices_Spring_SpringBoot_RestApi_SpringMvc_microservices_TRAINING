<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
   h2{
      text-align:center;
   }

   table{
     border:1px solid black;
     margin-left:auto;
     margin-right:auto;
     border-collapse: collapse;
   }
   tr,td,th{
     border:0.5px solid blue;
   }
   
   
</style>
<title>Details</title>
</head>
<body>
<h2>Student details</h2>
<table>
	<tr>
		<th>Sl.no</th>
		<th>Name</th>
		<th>Mark Scored</th>
	</tr>
	<c:forEach items="${foundStudent}" var="each">
	 <tr>
		<td>${each.id}</td>
		<td>${each.name}</td>
		
		<c:if test="${each.markScored < 80}">
		  <td style="color: #ff0000">${each.markScored}</td>
		</c:if>
		
		<c:if test="${each.markScored >= 80}">
		  <td>${each.markScored}</td>
		</c:if>
	 </tr>
	</c:forEach>
	
</table>
</body>
</html>