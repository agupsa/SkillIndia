<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
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
			<b><mark>Admin</mark></b>
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
			</div>
			</header>

<section  class="bcg">
<form action="adminLogin" method="post">
<div  align="center">
<div class="form-group col-md-4" >
        <label class="control-label">User Name</label> 
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
<input type="text" name ="username" placeholder="User Name" class="form-control" required="required" title=""><br>
</div>
</div>

<div class="form-group col-md-4">
          <label class="control-label" >Password</label> 
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
<input type="password" name="pass" placeholder="Password" class="form-control"><br>
</div>
</div>

<div class="form-group col-md-4" style="padding: 0;">
          <label class="control-label"></label>
          <div>
<button type="submit" value="Log In" name="adminlogin" class="btn btn-primary form-control" style="border-radius:10px; ">
Login<i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
</div>
</div>
</div>
</form>
</section>

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

</body>
</html>