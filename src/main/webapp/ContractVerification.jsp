<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contract Verification</title>
<meta charset="utf-8">
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

<link href="Bootstrap/css/prettyrco.css" rel="stylesheet">

</head>
<body>
	<br>
	<!-- Form Heading -->
	<center>
		<h2>
			<b><mark>Contract Verification</mark></b>
		</h2>
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


					<li class="menu-has-children"><a
						href="CandidateVerification.jsp">Candidate Verification</a> <!--  <ul>
              <li><a href="CandidateRegister.jsp">Candidate Register</a></li>
              <li><a href="CandidateLogin.jsp">Candidate Login</a></li>
             </ul> --></li>

					<li class="menu-has-children"><a
						href="EstablishmentVerification.jsp">Establishment
							Verification</a> <!-- <ul>
              <li><a href="EstablishmentRegistration.jsp">Establishment Register</a></li>
              <li><a href="EstablishmentLogin.jsp">Establishment Login</a></li>
             </ul> --></li>
				</ul>
				<ul class="nav-menu">
					<li><a href="ContractVerification.jsp">Contract
							Verification</a></li>
				</ul>
				<!--  <ul class="nav-menu">
         <li><a href="courseApply.jsp">Course Form</a></li>
         </ul> -->
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
<center>
		<div class="bcg">
			<br> <br>
			<section>

				<!-- Displaying selected establishment information in table -->
				<h2>Contracts Application</h2>
				<c:set var="accept" value="1" />
				<c:set var="reject" value="0" />
				<table border="2" width="70%" cellpadding="2">
					<tr>
						<th>Contract No.</th>
						<th>Candidate Registration No</th>
						<th>Candidate Name</th>
						<th>Establishment Registration No</th>
						<th>Establishment Name</th>
						<th>Course Id</th>
						<th>Course Name</th>
						<th>Stipend</th>
						<th>Start Date of Apprenticeship</th>
						<th>End Date of Apprenticeship</th>
						<th>Status</th>
						<th>Action
					</tr>
					<c:forEach items="${uContr}" var="co">

						<tr>
							<td>${co.letterNo}</td>
							<td><%-- <a href="canfetch/${co.canRegNo}"> --%>${co.canRegNo}<!-- </a> --></td>
							<td>${co.canName}</td>
							<td><%-- <a href="estfetch/${co.estRegNo}"> --%>${co.estRegNo}<!-- </a> --></td>
							<td>${co.estName}</td>
							<td><%-- <a href="coverify/${co.courseId}"> --%>${co.courseId}<!-- </a> --></td>
							<td>${co.courseName}</td>
							<td>${co.stipend}</td>
							<td>${co.startDate}</td>
							<td>${co.endDate}</td>
							<td>${co.status}</td>
							<td><a href="coverify/${co.letterNo}/${accept}">Approve</a><br>
								<a href="coverify/${co.letterNo}/${reject}">Reject</a></td>
						</tr>
					</c:forEach>
				</table>
			</section>
		</div>
	</center>

		<br>
		<br>

    <script>
    window.addEventListener("load",function(){
         alert("${msg}");
    })
    </script>
		</body>
</html>