<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<head>
<meta charset="ISO-8859-1">
<title>Skill India</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Reg_no</th><th>Est Name</th><th>Industry type</th><th>name of head</th><th>State<th>course Id</th><th>course name</th><th>trainer name</th></tr>  
   <c:forEach var="est" items="${estList}">   
   <tr>  
   <td>${est.estRegNo}</td>  
   <td>${est.name}</td>  
     
   </tr>  
   </c:forEach>  
   </table>  
</body>
</html>