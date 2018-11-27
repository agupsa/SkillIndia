<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Skill India</title>
<!-- Favicon -->
  <link href="Bootstrap/img/favicon.ico" rel="icon">

  <!-- Google Fonts -->
 <!--  <link href="https://fonts.googleapis.com/css?family=Raleway:400,500,700|Roboto:400,900" rel="stylesheet"> -->
 
  <!-- Bootstrap CSS File -->
  <link href="Bootstrap/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="Bootstrap/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="Bootstrap/css/style.css" rel="stylesheet">

</head>
<body>

  <!-- Form Heading -->
      <h1>Skill India</h1>
<header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="index.jsp"><img src="Bootstrap/img/National.png" width="200" height="150" alt="" title="" /></img></a>
        
      </div>

      <nav id="nav-menu-container">
      
      <ul class="nav-menu">
         <li><a href="index.jsp">Home</a></li>
         </ul>
         
        <ul class="nav-menu">
          <li><a href="#about">About Us</a></li>
        
         
        <li class="menu-has-children"><a href="">Candidate</a>
            <ul>
              <li><a href="CandidateRegister.jsp">Candidate Register</a></li>
              <li><a href="CandidateLogin.jsp">Candidate Login</a></li>
             </ul>
          </li>
     
     <li class="menu-has-children"><a href="">Establishment</a>
            <ul>
              <li><a href="EstablishmentRegistration.jsp">Establishment Register</a></li>
              <li><a href="EstablishmentLogin.jsp">Establishment Login</a></li>
             </ul>
          </li>
        </ul>
        <ul class="nav-menu">
         <li><a href="search.jsp">Search</a></li>
         </ul>
      </nav>
     <!-- #nav-menu-container -->

      <nav class="nav social-nav pull-right d-none d-lg-inline">
        <!-- <a href="https://www.twitter.com"><i class="fa fa-twitter"></i></a> <a href="https://www.facebook.com"><i class="fa fa-facebook"></i></a> <a href="https://www.linkedin.com"><i class="fa fa-linkedin"></i></a> <a href="https://www.outlook.com"><i class="fa fa-envelope"></i></a> -->
      </nav>
    </div>
  </header>
  <!-- #header -->

<!-- search by establishment name -->
<br><br><br>
<center>
<form action="searchEst" method="POST">
<table cellpadding="2">
<tr><td>Search by Establishment Name: </td>
<td><input type="text" name="establishmentName"></td>
</tr>
</table>
 
<br><input type="submit" value="submit">
</form>
</center>
</body>
</html>