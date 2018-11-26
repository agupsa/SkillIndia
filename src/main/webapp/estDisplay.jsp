<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Skill India</title>
</head>
<body>
<h2>Table of Establishment</h2>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Reg_no</th>
<th>Est Name</th>
<th>Email</th>
<th>Industry type</th>
<th>No of Employess</th>
<th>Workdays</th>
<th>name of head</th>
<th>Contact No</tr>  
   <c:forEach items="${elst}" var="temp">
   <tr>  
   <td>${temp.estRegNo}</td>
   <td>${temp.name}</td>
   <td>${temp.email}</td>
   <td>${temp.indtype}</td>
   <td>${temp.noOfEmp}</td>
   <td>${temp.workdays}</td>
   <td>${temp.nameOfHead}</td>
   <td>${temp.contactNo}</td>  
   </tr>  
   </c:forEach>  
   </table>  
</body>
</html>