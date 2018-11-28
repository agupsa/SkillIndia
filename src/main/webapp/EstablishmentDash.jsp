<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<body>
<head>
<meta charset="utf-8">
<title>Candidate Dashboard</title>
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
        <a href="index.html"><img src="Bootstrap/img/National.png" alt="" title="" /></img></a>
        <!-- Uncomment below if you prefer to use a text image -->
        <!--<h1><a href="#hero">Bell</a></h1>-->
      </div>

      <!-- #nav-menu-container -->

		<nav class="nav social-nav pull-right d-none d-lg-inline"> 
			<ul class="nav navbar-nav navbar-right">
				<li style="font-size:14px; color:white;">Welcome, ${Object.firstName}</li>
				<li><a href="index.jsp">Logout</a></li>
			</ul>
		</nav>
	</div>
	</header>
	<!-- #header -->

	<!-- About -->

	<section class="container" style="padding-top: 20px;">
	<form class="container">
	

		<!-- <center><div style="margin: 0 auto;">
				<div style="margin: 0 auto;">	
					<a style="margin: 0 auto;" href="CandidateHistory" class="btn">History
						<i class="fa fa-clock-o" aria-hidden="true"></i>
					</a>
				</div>
			</div>
			
		</div></center> -->

		<br />

		<%-- <c:if test="${requestScope.message!=null}">
			<div class="alert alert-success" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				${message}
			</div>
		</c:if>
 --%>
 
<br>
<div class="form-group">
        <label class="control-label" >Profile Status</label>
      </div>

		<br />
		<p>Application Status:</p>
		<!-- TO BE FILLED BY DB VALUES -->
		<div class="form-row" style="margin: 0 auto;">
			<div class="form-group col-md-12" style="padding: 0;">
				<label class="control-label"></label>
				<c:if
					test="${sessionScope.courseList !=null and not empty sessionScope.courseList}">

					<table class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
							   <th>Course Name</th>
							   <th>Candidate Name</th>
							    <th>Candidate Address</th>
							    <th>Candidate Contact</th>
							    <th>Accept or Reject</th>
							</tr>
						</thead>
						</thead>
						<tbody>

							<c:forEach items="${sessionScope.courseList}" var="e">

								<tr>
									<td scope="row"></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								<%-- 	<td><a href="DetailedCourse?cId=${e.cId}">More Details</a>
								</tr>
 --%>
							</c:forEach>

						</tbody>
					</table>

				</c:if>
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
