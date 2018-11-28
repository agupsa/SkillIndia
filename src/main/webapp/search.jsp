<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<body>
<head>
<meta charset="utf-8">
<title>Search</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- Favicon -->
<link href="Bootstrap/img/favicon.ico" rel="icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Raleway:400,500,700|Roboto:400,900"
	rel="stylesheet">

<!-- Bootstrap CSS File -->
<link href="Bootstrap/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Libraries CSS Files -->
<link href="Bootstrap/lib/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">

<link href="Bootstrap/lib/jquery-ui/jquery-ui.css" rel="stylesheet">
<link href="Bootstrap/lib/jquery-ui/jquery-ui.structure.css" rel="stylesheet">
<link href="Bootstrap/lib/jquery-ui/jquery-ui.theme.css" rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="Bootstrap/css/style.css" rel="stylesheet">

<link href="Bootstrap/css/prettyrc.css" rel="stylesheet">
</head>

<body>

<div class="form-row" >	
		<div class="col-md-12"><center><h2><b><mark>Search By Establishment</mark></b></h2></center></div>
		<br><br>
		</div>	
		
	 <!-- Header -->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="index.jsp"><img src="Bootstrap/img/National.png" width="200" height="150" alt="" title="" /></img></a>
        
      </div>

      <nav id="nav-menu-container">
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
          <ul class="nav-menu">
         <li><a href="courseApply.jsp">Course Form</a></li>
         </ul>
      </nav>
     <!-- #nav-menu-container -->

      <nav class="nav social-nav pull-right d-none d-lg-inline">
        <!-- <a href="https://www.twitter.com"><i class="fa fa-twitter"></i></a> <a href="https://www.facebook.com"><i class="fa fa-facebook"></i></a> <a href="https://www.linkedin.com"><i class="fa fa-linkedin"></i></a> <a href="https://www.outlook.com"><i class="fa fa-envelope"></i></a> -->
      </nav>
    </div>
  </header>
  <!-- #header -->
      <br></br>
      
      <!-- <div class="form-group col-md-4" >
        <label class="control-label">User Name</label> 
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
          <input name="username" placeholder="User Name" class="form-control" required="required" type="text" title="">
        </div>
      </div> -->
      
	
<!-- search by establishment name -->
<form action="searchEst" method="GET">

 <center><div class="form-group col-md-4" >
        <label class="control-label">Search By Institute</label> 
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-university" aria-hidden="true"></i></span>
          <input name="establishmentName" placeholder="Est Name" class="form-control"  type="text" title="">
        </div>
      </div>


   <!-- Submit button -->
       <div class="form-group col-md-4" style="padding: 0;">
          <label class="control-label"></label>
          <div>
            <button type="submit" class="btn btn-primary form-control" style="border-radius:10px; ">
            SUBMIT <i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
          </div>
        </div></center>

</form>
</body>
</html>