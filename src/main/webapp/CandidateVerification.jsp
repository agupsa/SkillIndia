<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<title>Candidate Verification</title>
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
	<br>
	<!-- Form Heading -->
	<center>
		<h2>
			<b><mark>Candidate Verification</mark></b>
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


					<li class="menu-has-children"><a href="#">Candidate
							Verification</a> <!--  <ul>
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
	<center>
		<div class="bcg">
			<br> <br>
			<section>

				<!-- Displaying selected establishment information in table -->
				<h2>Candidate Application</h2>
				<c:set var="accept" value="1" />
				<c:set var="reject" value="0" />
				<table border="2" width="70%" cellpadding="2">
					<tr>
						<th>Registration No.</th>
						<th>Candidate Name</th>
						<th>Gender</th>
						<th>Date Of Birth</th>
						<th>Contact No</th>
						<th>Aadhar Number</th>
						<th>Father's Name</th>
						<th>Education Qualification</th>
						<th>Institute Name</th>
						<th>Percentage</th>
						<th>Address</th>
						<th>Photo</th>
						<th>Aadhar Card</th>
						<th>Marksheet</th>
						<th>Status</th>
						<th>Action
					</tr>
					<c:forEach items="${uCan}" var="c">

						<tr>
							<td>${c.canRegNo}</td>
							<td>${c.name}</td>
							<td>${c.gender}</td>
							<td>${c.dob}</td>
							<td>${c.contactNo}</td>
							<td>${c.aadharNo}</td>
							<td>${c.fatherName}</td>
							<td>${c.qualification}</td>
							<td>${c.collegeName}</td>
							<td>${c.marks}</td>
							<td>${c.addr.state}<br>${c.addr.city }<br>${c.addr.pincode}</td>
							<td><a href="dispfile/${c.canRegNo}/${1}">Photo</a></td>
							<td><a href="dispfile/${c.canRegNo}/${2}">Aadhar Card</a></td>
							<td><a href="dispfile/${c.canRegNo}/${3}">Marksheet</a></td>
							<td>${c.status}</td>
							<td><a href="cverify/${c.canRegNo}/${accept}">Accept</a><br>
								<a href="cverify/${c.canRegNo}/${reject}">Reject</a></td>
						</tr>
					</c:forEach>
				</table>
			</section>
		</div>
	</center>

	<br></br>
    <c:if test="${not empty msg}">
    <script>
    window.addEventListener("load",function(){
         alert("${msg}");
    })
    </script>
        <c:set var="msg" value="null"></c:set>
</c:if>

</body>
</html>