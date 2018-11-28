<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Skill India</title>

</head>
<body>

  <br><br>
<center>
<!-- Listing courses for selected establishment information in table -->
<h2>Table of Courses for selected Establishment</h2>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Reg_no</th><th>Est Name</th><th>Course Id</th><th>Course Display</th><th>Trainer Name</th><th>Link</th></tr>  
   <c:forEach items="${clst}" var="temp">   
   <tr>  
   <td>${temp.estRegno }</td>
   <td>${temp.estName }</td>
   <td>${temp.courseId}</td>
   <td>${temp.courseName}</td>
   <td>${temp.trainerName}</td>
 
   <td><a href="apply/${temp.courseId}">Apply</a></td>      
   </tr>  
   </c:forEach>  
   </table>  
   </center>
   
   
</body>
</html>