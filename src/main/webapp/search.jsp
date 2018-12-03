<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page errorPage="error.jsp"%>
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
<link href="Bootstrap/lib/jquery-ui/jquery-ui.structure.css"
	rel="stylesheet">
<link href="Bootstrap/lib/jquery-ui/jquery-ui.theme.css"
	rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="Bootstrap/css/style.css" rel="stylesheet">

<link href="Bootstrap/css/prettyrc.css" rel="stylesheet">
</head>

<body>

	<div class="form-row">
		<div class="col-md-12">
			<center>
				<h2>
					<b><mark>Search By Establishment</mark></b>
				</h2>
			</center>
		</div>
		<br> <br>
	</div>

	<!-- Header -->
	<header id="header">
		<div class="container">

			<div id="logo" class="pull-left">
				<a href="index.jsp"><img src="Bootstrap/img/National.png"
					width="200" height="150" alt="" title="" /></img></a>

			</div>
			<c:if test="${can==null}">
				<nav id="nav-menu-container">
					<ul class="nav-menu">
						<li><a href="#about">About Us</a></li>


						<li class="menu-has-children"><a href="">Candidate</a>
							<ul>
								<li><a href="CandidateRegister.jsp">Candidate Register</a></li>
								<li><a href="CandidateLogin.jsp">Candidate Login</a></li>
							</ul></li>

						<li class="menu-has-children"><a href="">Establishment</a>
							<ul>
								<li><a href="EstablishmentRegistration.jsp">Establishment
										Register</a></li>
								<li><a href="EstablishmentLogin.jsp">Establishment
										Login</a></li>
							</ul></li>
					</ul>
					<ul class="nav-menu">
						<li><a href="search.jsp">Search</a></li>
					</ul>
					<ul class="nav-menu">
						<li><a href="courseApply.jsp">Course Form</a></li>
					</ul>

				</nav>
			</c:if>

			<c:if test="${can!=null }">
				<nav class="nav social-nav pull-right d-none d-lg-inline">

					<ul class="nav navbar-nav navbar-right">

						<li><a href="logout">Logout</a></li>
					</ul>
				</nav>
			</c:if>
			<!-- #nav-menu-container -->
		</div>
	</header>
	<!-- #header -->
	<div class="bcg">
		<c:if test="${can!=null }">
			<section class="container" style="padding-top: 1px;">
				<form class="container">
					<!-- Profile Picture -->
					<br>
					<div class="form-group">
						<label class="control-label">${can.name}</label><br> <label
							class="control-label">Profile Status: ${can.status }</label><br>
						<c:if test="${ can.canRegNo !=0}">
							<label class="control-label">Registration Number:
								${can.canRegNo }</label>
						</c:if>
					</div>
				</form>
			</section>
		</c:if>


		<!-- search by establishment name -->
		<form action="searchEst" method="GET">

			<center>
				<div class="form-group col-md-4">
					<label class="control-label">Search By Institute</label>
					<div class="input-group" style="z-index: 0;">
						<span class="input-group-addon"><i class="fa fa-university"
							aria-hidden="true"></i></span> <input name="establishmentName"
							placeholder="Est Name" class="form-control" type="text" title="">
					</div>
				</div>


				<!-- Submit button -->
				<div class="form-group col-md-4" style="padding: 0;">
					<label class="control-label"></label>
					<div>
						<button type="submit" class="btn btn-primary form-control"
							style="border-radius: 10px;">
							SUBMIT <i class="fa fa-paper-plane-o" aria-hidden="true"></i>
						</button>
					</div>
				</div>
			</center>



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

			<!-- Template Specisifc Custom Javascript File -->
			<script src="js/custom.js"></script>
			<script src="Bootstrap/js/script.js"></script>
			<script src="Bootstrap/js/custom.js"></script>
		</form>
	</div>
</body>
</html>