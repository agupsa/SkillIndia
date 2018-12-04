<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
      <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>

<html lang="en">

<head>
  <meta charset="utf-8">
  <title>Skill india</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">


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
      <center><h2><b><mark>Set New password for candidate</mark></b></h2></center><br>
      
 <section class="bcg" class="container" style="padding-top: 20px;">
  
    <form class="container" modelAttribute="candidate" action="forgotPsCan" method="post">
      <!-- Form Heading -->

      <!-- Form Fields -->

<!-- Candidate Email -->
 	<div class="form-group">
        <label class="control-label">Candidate Email</label><font style= "color:red;">*</font>
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-envelope" aria-hidden="true"></i></span>
          <input maxlength="30" name="username" placeholder="email" class="form-control" required="required" type="email" title="Enter an e-Mail address of a valid format including the domain name.	">
        </div>
      </div>
      
       
      <div class="form-row">
      
      <!-- Aadhar No -->
        <div class="form-group col-md-6">
          <label class="control-label">Aadhar Number</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-id-card-o" aria-hidden="true"></i></span>
            <input name="aadharNo" maxlength="12" placeholder="Aadhar Number" class="form-control" required="required" type="text" pattern="[0-9]{12}" title="Enter Aadhaar Number containing 12 digits.">
          </div>
        </div>

      <!--New Password-->
      <font size="0.2px" color="grey">&nbsp (Password Should be at least 8 characters long and must contain at least one character in Upper Case, Lower Case, Numerical Form, and a Special Character.)</font>
        <div class="col-md-6 form-group">
          <label class="control-label" >New Password</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
            <input maxlength="30" id="password" name="pass" placeholder="New Password" class="form-control"  required="required" type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                title="Password Should be at least 8 characters long and must contain at least one character in Upper Case, Lower Case, Numerical Form, and a Special Character.">
          </div>
        </div>
      </div>

 <!-- Submit button -->
        <div class="form-group col-md-4" style="padding: 0;">
          <label class="control-label"></label>
          <div>
            <button id="submit-button" type="submit" name="ForgotPs" class="btn btn-primary form-control" style="border-radius:10px;">
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