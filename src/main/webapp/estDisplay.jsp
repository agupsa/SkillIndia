<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
 
<head>
<meta charset="ISO-8859-1">
<title>Skill India</title>


</head>
<body>

  <br><br>
<center>
<!-- Displaying selected establishment information in table -->
<h2>Table of establishment</h2>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Reg_no</th><th>Est Name</th><th>Email</th><th>Industry type</th><th>Name of head</th><th>Contact Number</th><th>Display Course</th></tr>  
   <c:forEach items="${elst}" var="temp">   
   <tr>  
   <td>${temp.estRegNo}</td>  
   <td>${temp.name}</td>
   <td>${temp.email}</td>
   <td>${temp.indtype}</td>
   <td>${temp.nameOfHead}</td>
   <td>${temp.contactNo}</td>
   <td><a href="searchCourse/${temp.estRegNo}">Display</a></td>      
   </tr>  
   </c:forEach>  
   </table>  
   </center>
</body>
</html>