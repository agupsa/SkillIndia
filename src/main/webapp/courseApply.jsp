<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skill India</title>
 <!-- Favicon -->
  <link href="Bootstrap/img/favicon.ico" rel="icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Raleway:400,500,700|Roboto:400,900" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="Bootstrap/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="Bootstrap/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">

  <link href="Bootstrap/lib/jquery-ui/jquery-ui.css" rel="stylesheet">
  <link href="Bootstrap/lib/jquery-ui/jquery-ui.structure.css" rel="stylesheet">
  <link href="Bootstrap/lib/jquery-ui/jquery-ui.theme.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="Bootstrap/css/style.css" rel="stylesheet">

  <link href="Bootstrap/css/prettyrc.css" rel="stylesheet">
</head>
<body>

<!-- Form Heading -->
      <center><h2><b><mark>Course Application Form</mark></b></h2></center><br>
      
       <section class="bcg" class="container" style="padding-top: 20px;">
  
    <form class="container" modelAttribute="contract" action="registerCourse" method="post">
      <!-- Form Heading -->

      <!-- Form Fields -->
      <!-- Course -->
      
         <!-- Candidate Registration Number-->
      <div class="form-group">
          <label class="control-label" >Candidate Registration Number</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-location-arrow" aria-hidden="true"></i></span>
            <input name="canRegNo" placeholder="Candidate Reg No" class="form-control"  type="text" >
          </div>
        </div>

  
       <!-- Establishment Registration Number-->
      <div class="form-group">
          <label class="control-label" >Establishment Registration Number</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-location-arrow" aria-hidden="true"></i></span>
            <input name="estRegNo" placeholder="Establishment Reg No" class="form-control"  type="text" >
          </div>
        </div>
        
<!-- Establishment Name-->
<div class="form-group col-md-6">
          <label class="control-label" >Establishment Name</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-university" aria-hidden="true"></i></span>
            <input maxlength="50" name="estName" placeholder="Establishment Name" class="form-control"  type="text">
          </div>

      <!-- Course Id-->
      <div class="form-group">
          <label class="control-label" >Course Id</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-location-arrow" aria-hidden="true"></i></span>
            <input name="courseId" placeholder="Course Id" class="form-control"  type="text" >
          </div>
        </div>

  
       <!-- Submit button -->
        <div class="form-group col-md-4" style="padding: 0;">
          <label class="control-label"></label>
          <div>
            <button id="submit-button" type="submit" name="Course Apply" class="btn btn-primary form-control" style="border-radius:10px;">
            SUBMIT <i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
          </div>
        </div>
        
        
        
      
    </form>
  </section>
     
     <!-- @component: footer -->

  <section id="contact">
    <div class="container">
      <div class="row">
        <div class="col-md-12 text-center">
          <h2 class="section-title">Contact Us</h2>
        </div>
      </div>

      <div class="row justify-content-center">
        <div class="col-lg-3 col-md-4">
          <div class="info">
            <div>
              <i class="fa fa-map-marker"></i>
              <p>NAPS<br>Mumbai</p>
            </div>

            <div>
              <i class="fa fa-envelope"></i>
              <p>skillindia.co.in</p>
            </div>

            <div>
              <i class="fa fa-phone"></i>
              <p>+91 12345 67890</p>
            </div>

          </div>
        </div>

     

      </div>
    </div>
  </section>

  <footer class="site-footer">
    <div class="bottom">
      <div class="container">
        <div class="row">

          <div class="col-lg-6 col-xs-12 text-lg-left text-center">
            <p class="copyright-text">
              © Skill India
            </p>
            <div class="credits">
              <a href="https://bootstrapmade.com/">NATIONAL APPRENTTICESHIP PROMOTION SCHEME(NAPS)</a>
            </div>
          </div>

          <div class="col-lg-6 col-xs-12 text-lg-right text-center">
            <ul class="list-inline">
              <li class="list-inline-item">
                <a href="index.jsp">Home</a>
              </li>
             <li class="list-inline-item">
                <a href="#contact">Contact</a>
              </li>
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
  <script src="Bootstrap/JSON/script.js"></script>

  <!-- Template Specisifc Custom Javascript File -->
  <script src="Bootstrap/js/custom.js"></script>
  <script src="Bootstrap/js/script.js"></script>
  <script src="Bootstrap/js/candidate.js"></script>

  <script src="Bootstrap/contactform/contactform.js"></script>

     
</body>
</html>