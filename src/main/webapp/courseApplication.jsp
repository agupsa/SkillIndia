<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skill India</title>
</head>
<body>
  
        <h3>Course Application Form</h3>  
       <form:form method="POST" action="/applicationsave">    
        <table >    
        <tr>  
        <td>Course Id: </td>    
         <td><form:input path="courseId" /></td>  
         </tr>   
         <tr>    
          <td>Course Name: </td>   
          <td><form:input path="courseName"  /></td>  
         </tr>    
         <tr>    
          <td>Trainer Form:</td>    
          <td><form:input path="trainerName" /></td>  
         </tr>   
         <tr>    
          <td>Trainer Contact Number:</td>    
          <td><form:input path="trainerContact" /></td>  
         </tr>   
           <tr>    
          <td>Establishment Registration Number:</td>    
          <td><form:input path="estRegno" /></td>  
         </tr> 
          <tr>    
          <td>Establishment Name:</td>    
          <td><form:input path="estName" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Apply" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>