<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">



<!-- Favicon -->
<link href="Bootstrap/img/favicon.ico" rel="icon">

<!-- Google Fonts -->
<!--  <link href="https://fonts.googleapis.com/css?family=Raleway:400,500,700|Roboto:400,900" rel="stylesheet"> -->

<!-- Bootstrap CSS File -->
<link href="Bootstrap/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Libraries CSS Files -->
<link href="Bootstrap/lib/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="Bootstrap/css/style.css" rel="stylesheet">
</head>
<body>

	<%
		response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1

		response.addHeader("Cache-Control", "no-store, must-revalidate");

		response.addHeader("Cache-Control", "must-revalidate");

		response.addHeader("Pragma", "no-cache"); //HTTP 1.0

		response.setDateHeader("Expires", 0); //Proxies
	%>
	<%
		if (session.getAttribute("admin") == null)
			response.sendRedirect("redirect:/admin.jsp");
	%>

	<!-- Form Heading -->
	<center>
		<h1>
			<b><mark>Admin Dashboard</mark></b>
		</h1>
	</center>
	<br>

	<!-- Header -->
	<header id="header">
		<div class="container">

			<div id="logo" class="pull-left">
				<a href="index.jsp"><img src="Bootstrap/img/National.png"
					width="200" height="150" alt="" title="" /></img></a>

			</div>

			<nav id="nav-menu-container">
				<ul class="nav-menu">
					<!--   <li><a href="#about">About Us</a></li> -->


					<li class="menu-has-children"><a href="canver">Candidate
							Verification</a> <!--  <ul>
              <li><a href="CandidateRegister.jsp">Candidate Register</a></li>
              <li><a href="CandidateLogin.jsp">Candidate Login</a></li>
             </ul> --></li>

					<li class="menu-has-children"><a href="estver">Establishment
							Verification</a> <!-- <ul>
              <li><a href="EstablishmentRegistration.jsp">Establishment Register</a></li>
              <li><a href="EstablishmentLogin.jsp">Establishment Login</a></li>
             </ul> --></li>
				</ul>
				<ul class="nav-menu">
					<li><a href="contrver">Contract Verification</a></li>
				</ul>
				<!--  <ul class="nav-menu">
         <li><a href="courseApply.jsp">Course Form</a></li>
         </ul> -->
			</nav>
			<!-- #nav-menu-container -->

			<nav class="nav social-nav pull-right d-none d-lg-inline">
				<!-- <a href="https://www.twitter.com"><i class="fa fa-twitter"></i></a> <a href="https://www.facebook.com"><i class="fa fa-facebook"></i></a> <a href="https://www.linkedin.com"><i class="fa fa-linkedin"></i></a> <a href="https://www.outlook.com"><i class="fa fa-envelope"></i></a> -->
			</nav>
		</div>
		<nav class="nav social-nav pull-right d-none d-lg-inline">
			<ul class="nav navbar-nav navbar-right">

				<li><a href="logout">Logout</a></li>
			</ul>
		</nav>
	</header>
	<!-- #header -->

	<div class="bcg">
		<br> <br>
		<section>
			<center>
				<h1>Welcome TO Skill India</h1>
			</center>
		</section>
	</div>
	<br></br>

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
	<script src="Bootstrap/JSON/script.js"></script>

	<!-- Template Specisifc Custom Javascript File -->
	<script src="Bootstrap/js/custom.js"></script>
	<script src="Bootstrap/js/script.js"></script>
	<script src="Bootstrap/js/candidate.js"></script>

	<script src="Bootstrap/contactform/contactform.js"></script>

	<c:if test="${not empty msg}">
		<script>
			window.addEventListener("load", function() {
				alert("${msg}");
			})
		</script>
		<c:set var="msg" value="null"></c:set>
	</c:if>

</body>
</html>