<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
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
         <td><input type="number" value="${course.courseId}" name="courseId" readonly/></td>  
         </tr>   
         <tr>    
          <td>Course Name: </td>   
          <td><input type="text" value="${course.courseName}" name="courseName" readonly/></td>  
         </tr>    
         <tr>    
          <td>Trainer Form:</td>    
          <td><input type="text" value="${course.trainerName}" name="trainerName" readonly/></td>  
         </tr>   
         <tr>    
          <td>Trainer Contact Number:</td>    
          <td><input type="number" value="${course.trainerContact}" name="trianerContact" readonly/></td>  
         </tr>   
           <tr>    
          <td>Establishment Registration Number:</td>    
          <td><input type="number" value="${course.estRegno}" name="estRegNo" readonly/></td>  
         </tr> 
          <tr>    
          <td>Establishment Name:</td>    
          <td><input type="text"  value="${course.estName}" name="estName" readonly/></td>  
         </tr>   
         <tr>    
          <td>Candidate Registration Number:</td>    
          <td><input type="number" name="canRegNo" placeholder="Candidate Reg No" name="canRegNo" required/></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Apply" /></td>    
         </tr>    
        </table>    
       </form>    
</body>
</html>