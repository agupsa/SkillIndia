<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Skill India</title>
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

	<!-- Form Heading -->
	<center>
		<h1>
			<b><mark>Establishment Display</mark></b>
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
		<section>
			<center>
				<!-- Displaying selected establishment information in table -->
				<h2>Table of establishment</h2>
				<table border="2" width="70%" cellpadding="2">
					<tr>
						<th>Reg_no</th>
						<th>Est Name</th>
						<th>Email</th>
						<th>Industry type</th>
						<th>street</th>
						<th>city</th>
						<th>state</th>
						<th>Name of head</th>
						<th>Contact Number</th>
						<th>Display Course</th>
					</tr>
					<c:forEach items="${elst}" var="temp">
						<tr>
							<td>${temp.estRegNo}</td>
							<td>${temp.name}</td>
							<td>${temp.email}</td>
							<td>${temp.indtype}</td>
							<td>${temp.addr.addr}</td>
							<td>${temp.addr.city}</td>
							<td>${temp.addr.state}</td>
							<td>${temp.nameOfHead}</td>
							<td>${temp.contactNo}</td>
							<td><a href="searchCourse/${temp.estRegNo}">Display</a></td>
						</tr>
					</c:forEach>
				</table>
			</center>
		</section>
	</div>
	<br></br>
	 

</body>
</html>