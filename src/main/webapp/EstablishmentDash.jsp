<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*" %>
<%@ page import="com.si.model.Candidate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page errorPage="error.jsp" %>


<!DOCTYPE html>
<html lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<body>
<head>
<meta charset="utf-8">
<title>Establishment Dashboard</title>
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
<%
	if (session.getAttribute("est") == null)
		throw new Exception("error logging in");
%>
	<!-- Form Heading -->
	<div class="form-row" >	
		<div class="col-md-12">
		<center>
			<h2>
				<b><mark>Establishment Dashboard</mark></b>
			</h2>
		</center>
		</div>
		<br>
		<br>
	</div>	
	
	 <!-- Header -->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="index.jsp"><img src="Bootstrap/img/National.png" width="200" height="150" alt="" title="" /></img></a>
        
      </div>

     <!-- <nav id="nav-menu-container">
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
         </ul> -->
         <ul class="nav-menu">
         <li><a href="EnterCourse.jsp">Enter Course</a></li>
         </ul>
      </nav>
     <!-- #nav-menu-container -->

      <nav class="nav social-nav pull-right d-none d-lg-inline">
        <ul class="nav navbar-nav navbar-right">
		
				<li><a href="logout">Logout</a></li>
			</ul>
      </nav>
    </div>
  </header>
  <!-- #header -->

	<!-- About -->

	<section class="container" style="padding-top: 20px;">
	<form class="container">

<br>
<div class="form-group">
        <label class="control-label" >${est.name}</label><br>
        <label class="control-label" >Profile Status: ${est.status }</label><br>
       <label class="control-label" ><c:if test="${ est.estRegNo !=0}">Registration Number: ${est.estRegNo }</c:if></label>
      </div>

		<br />
		<p>Application Status:</p>
		<!-- TO BE FILLED BY DB VALUES -->
		<div class="form-row" style="margin: 0 auto;">
			<div class="form-group col-md-12" style="padding: 0;">
				<label class="control-label"></label>
				
					<table class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
							   <th>Contract Number</th>
							   <th>Candidate Registration Number</th>
							    <th>Candidate Name</th>
							    <th>Candidate Gender</th>
							    <th>Candidate DOB</th>
							    <th>Candidate Contact Number</th>
							    <th>Candidate Qualification</th>
							    <th>Candidate Marks</th>
							    <th>Course Id</th>
							    <th>Course Name</th>
							    <th>Stipend</th>
							    <th>Start Date</th>
							    <th>End Date</th>
							    <th>Status</th>
							    <th>Send Offer</th>
							    <th>Reject Application</th>
							</tr>
						</thead>
						</thead>
						<tbody>

							<c:forEach items="${drm}" var="drm">

								<tr>
									<td>${drm.letterNo}</td>
									<td>${drm.canRegNo}</td>
									<td>${drm.name}</td>
									<td>${drm.gender}</td>
									<td>${drm.dob}</td>
									<td>${drm.contactNo}</td>
									<td>${drm.qualification}</td>
									<td>${drm.marks}</td>
									<td>${drm.courseId}</td>
									<td>${drm.courseName}</td>
								    <td>${drm.stipend}</td>
								    <td>${drm.startId}</td>
								    <td>${drm.endDate}</td>
								    <td>${drm.status}</td>
								    
							 	<td><a href="sendOffer.jsp">Fill Offer letter</a></td>
							 	<td><a href="reject/${drm.letterNo}">Reject</a></td>
						
								    
								    
						
								</tr>

							</c:forEach>

						</tbody>
					</table>

				
			</div>
			<br />


		</div>

	</form>
	</section>

	<footer class="site-footer">
	<div class="bottom">
		<div class="container">
			<div class="row">

				<div class="col-lg-6 col-xs-12 text-lg-left text-center">
					<p class="copyright-text">© Skill India</p>
					<div class="credits">
						<abbr title="National Apprenticeship Promotion Scheme">NAPS</abbr>
					</div>
				</div>

				<div class="col-lg-6 col-xs-12 text-lg-right text-center">
					<ul class="list-inline">
						<li class="list-inline-item"><a href="index.jsp">Home</a></li>
						<li class="list-inline-item"><a href="#contact">Contact</a></li>
					</ul>
				</div>

			</div>
		</div>
	</div>
	</footer>
	<a class="scrolltop" href="#"><span class="fa fa-angle-up"></span></a>


	<!-- Required JavaScript Libraries -->
	<script src="Bootstrap/lib/jquery/jquery.min.js"></script>
	<script src="Bootstrap/lib/jquery/jquery-migrate.min.js"></script>
	<script src="Bootstrap/lib/superfish/hoverIntent.js"></script>
	<script src="Bootstrap/lib/superfish/superfish.min.js"></script>
	<script src="Bootstrap/lib/tether/js/tether.min.js"></script>
	<script src="Bootstrap/lib/stellar/stellar.min.js"></script>
	<script src="Bootstrap/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="Bootstrap/lib/counterup/counterup.min.js"></script>
	<script src="Bootstrap/lib/waypoints/waypoints.min.js"></script>
	<script src="Bootstrap/lib/easing/easing.js"></script>
	<script src="Bootstrap/lib/stickyjs/sticky.js"></script>
	<script src="Bootstrap/lib/parallax/parallax.js"></script>
	<script src="Bootstrap/lib/lockfixed/lockfixed.min.js"></script>
	<script src="Bootstrap/lib/jquery-ui/jquery-ui.js"></script>

	<!-- Template Specisifc Custom Javascript File -->
	<script src="Bootstrap/js/custom.js"></script>

	<script src="Bootstrap/contactform/contactform.js"></script>


	<script>
    updateList = function() {
      var input = document.getElementById('file');
      var output = document.getElementById('fileList');

      output.innerHTML = '<ul>';
      for (var i = 0; i < input.files.length; ++i) {
        output.innerHTML += '<li>' + input.files.item(i).name + '</li>';
      }
      output.innerHTML += '</ul>';
    }
    $( document ).ready(function() {
        console.log( "document loaded" );
         $( "#datepicker" ).datepicker();
    });
    
    window.setTimeout(function() {
	    $(".alert").fadeTo(500, 0).slideUp(500, function(){
	        $(this).remove(); 
	    });
	}, 4000);
      
  </script>

</body>
</html>
