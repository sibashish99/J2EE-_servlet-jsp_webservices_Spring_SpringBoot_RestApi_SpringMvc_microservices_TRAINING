<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<tr>
		<td>${foundStudent.id}</td>
		<td>${foundStudent.name}</td>
		<td>${foundStudent.markScored}</td>
	</tr>
	
</table>
</body>
</html>