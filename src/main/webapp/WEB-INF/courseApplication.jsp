<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
       <form modelAttribute="contract" action="applicationSave" method="POST">    
        <table >    
        <tr>  
        <td>Course Id: </td>    
         <td><input type="text" value="${course.courseId}" readonly/></td>  
         </tr>   
         <tr>    
          <td>Course Name: </td>   
          <td><input type="text" value="${course.courseName}" readonly/></td>  
         </tr>    
         <tr>    
          <td>Trainer Form:</td>    
          <td><input type="text" value="${course.trainerName}" readonly/></td>  
         </tr>   
         <tr>    
          <td>Trainer Contact Number:</td>    
          <td><input type="text" value="${course.trainerContact}" readonly/></td>  
         </tr>   
           <tr>    
          <td>Establishment Registration Number:</td>    
          <td><input type="text" value="${course.estRegno}" readonly/></td>  
         </tr> 
          <tr>    
          <td>Establishment Name:</td>    
          <td><input type="text"  value="${course.estName}" readonly/></td>  
         </tr>   
         <tr>    
          <td>Candidate Registration Number:</td>    
          <td><input type="text" name="canRegNo" placeholder="Candidate Reg No" required/></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Apply" /></td>    
         </tr>    
        </table>    
       </form>    
</body>
</html>