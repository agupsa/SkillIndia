<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
  <meta charset="utf-8">
  <title>Institute Registration</title>
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

    <link rel="stylesheet" type="text/css" href="style.css">
  <link href="Bootstrap/css/style.css" rel="stylesheet">

  <link href="Bootstrap/css/prettyrc.css" rel="stylesheet">
</head>

<body>
  <!-- Form Heading -->
      <center><h1><b><mark>Establishment Registration Form</mark></b></h1></center><br>

  <!-- Header -->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="index.html"><img src="Bootstrap/img/National.png" alt="" title="" /></img></a>
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">           
          <li class="menu-has-children"><a href="login.jsp">Login</a></li>
          <li><a href="#contact">Contact Us</a></li>
        </ul>
      </nav>
      <!-- #nav-menu-container -->
    </div>
  </header>
  <!-- #header -->

  <section  class="bcg" class="container" style="padding-top: 20px;">
    <form class="container" action = "registerEstablishment" method= "post">
    
      <!-- Form Fields -->

     <!-- Form Fields -->
     
      <!--Establishment Name -->
      <div class="form-group">
        <label class="control-label" >Establishment Name</label><font style= "color:red;">*</font>
        <div class="input-group">
          <span class="input-group-addon"><i class="fa fa-university" aria-hidden="true"></i></span>
          <input name="name" placeholder="Establishment Name" class="form-control" maxlength="30" pattern="[a-zA-Z]+" type="text" required="required" title="Enter the Establishment name">
        </div>
      </div>
    
      <!-- Email Id -->
      <div class="form-group">
        <label class="control-label" >e-Mail ID</label><font style= "color:red;">*</font>
        <div class="input-group">
          <span class="input-group-addon"><i class="fa fa-paper-plane-o" aria-hidden="true"></i></span>
          <input name="email" placeholder="e-Mail ID" class="form-control"  type="email" title="Enter correct e-Mail ID">
        </div>
      </div>

      <!-- Password & Confirm Password (on the same row) -->
      <div class="form-row">
        <div class="col-md-6 form-group">
          <label class="control-label" >Password</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
            <input id="password" name="pass" placeholder="Password" class="form-control"  required="required" type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                title="Password Should be at least 8 characters long and must contain at least one character in Upper Case, Lower Case, Numerical Form, and a Special Character.">
          </div>
        </div>
        <div class="col-md-6 form-group">
          <label class="control-label" >Confirm Password</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
            <input id="confirmPassword" name="Password" placeholder="Confirm Password" class="form-control" required="required" type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" onkeyup="validate()" 
                title="Password Should be at least 8 characters long and must contain at least one character in Upper Case, Lower Case, Numerical Form, and a Special Character.">
          </div>
        </div>
      </div>
      
<div class="form-row">
        <div class="form-group col-md-6">
          <label class="control-label">Industry Type</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-graduation-cap" aria-hidden="true"></i></span>
            <select name="indtype" class="form-control">
            <option >-Select-</option>
		<option >Industry Type</option>
              <option >Manufacturing</option>
              <option >Services</option>
              <option >Trading</option>
              <option >Other</option>
            </select>
          </div>
        </div>


   <!-- Number of Employees -->
        <div class="form-group col-md-6">
          <label class="control-label">Number of Employees</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-users" aria-hidden="true"></i></span>
            <input name="noOfEmp" placeholder="Number of Employees" class="form-control" pattern="[0-9]{3}" type="number" title="Enter value">
          </div>
        </div>
     </div>
      
       <!-- Number of Working Days -->
       <div class="form-row">
        <div class="form-group col-md-6">
          <label class="control-label">Working Days in a Week</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-calendar" aria-hidden="true"></i></span>
            <select name="workdays" class="form-control">
		<option >-Select-</option>
              <option >5 Days a week</option>
              <option >6 Days a week</option>
               </select>
          </div>
        </div>
		</div>
       
       <!--Name of Head -->
      <div class="form-group">
        <label class="control-label" >Name of Head</label><font style= "color:red;">*</font>
        <div class="input-group">
          <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
          <input name="nameOfHead" placeholder="Name of Head" class="form-control" maxlength="30" pattern="[a-zA-Z]+" type="text" required="required" title="Enter the Establishment name">
        </div>
      </div>

     <!-- Contact Number -->
      <div class="form-group">
        <label class="control-label" >Contact Number</label><font style= "color:red;">*</font>
        <div class="input-group">
          <span class="input-group-addon"><i class="fa fa-phone" aria-hidden="true"></i></span>
          <input name="contactNo" placeholder="Contact Number" class="form-control" required="required" type="text" pattern="(7|8|9)\d{9}" title="Contact number should be at least 10 digits and starting with 7, 8 or 9.">
        </div>
      </div>

        <!--BANK Name -->
      <div class="form-group">
        <label class="control-label" >Bank Name</label><font style= "color:red;">*</font>
        <div class="input-group">
          <span class="input-group-addon"><i class="fa fa-university" aria-hidden="true"></i></span>
          <input name="bankName" placeholder="Bank Name" class="form-control" maxlength="30" pattern="[a-zA-Z]+" type="text" required="required" title="Enter the Bank name">
        </div>
      </div>


         <div class="form-row">
        <!-- IFSC Details -->
        <div class="form-group col-md-6">
          <label class="control-label">IFSC Number</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-id-card-o" aria-hidden="true"></i></span>
            <input name="IFSC" placeholder="IFSC Number" maxlength="10" class="form-control" required="required" type="text" pattern="^([A-Za-z]){5}([0-9]){4}([a-zA-Z]){1}?$" title="Enter IFSC Number.">
          </div>
        </div>

        <!-- Account No. -->
        <div class="form-group col-md-6">
          <label class="control-label"> Account No.</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-id-card-o" aria-hidden="true"></i></span>
            <input name="accountNo" placeholder=" Account No." maxlength="10" class="form-control" type="number" pattern="^[A-Za-z0-9]{9}$" title=" Account No.">
          </div>
        </div>
      </div>

    <hr style="margin: 50px 0px;">

     <!-- Address Proof
      <div class="form-group">
          <label class="control-label">Address Proof</label> 
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-files-o" aria-hidden="true"></i></span>
            <input class="form-control" name="addressProof" type="file" id="file" onchange="javascript:updateList();">
          </div>
          <br/>Selected files:
          <div id="fileList"></div>
        </div>

      <!-- Certificate of Incorporation
            <div class="form-group">
          <label class="control-label">Certificate of Incorporation</label> 
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-files-o" aria-hidden="true"></i></span>
            <input class="form-control" name="vDetails.cOfIncorporation" type="file" id="file" onchange="javascript:updateList();">
          </div>
          <br/>Selected files:
          <div id="fileList"></div>
        </div>

      <!-- PAN Card Document
             <div class="form-group">
          <label class="control-label">PAN Card</label> 
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-files-o" aria-hidden="true"></i></span>
            <input class="form-control"  type="file" id="file" onchange="javascript:updateList();">
          </div>
          <br/>Selected files:
          <div id="fileList"></div>
        </div>-->

        <!-- Submit button -->
        <div class="form-group col-md-4" style="padding: 0;">
          <label class="control-label"></label>
          <div>
            <button type="submit" name = "InstituteRegistration" class="btn btn-primary form-control" style="border-radius:10px;">
            SUBMIT <i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
          </div>
        </div>
    </form>
  </section>

  <!-- /Team -->
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
              <p>NAPS, Mumbai<br>India</p>
            </div>

            <div>
              <i class="fa fa-envelope"></i>
              <p>skillindia.co.in</p>
            </div>

            <div>
              <i class="fa fa-phone"></i>
              <p>+91 123467890</p>
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
              <abbr title="National Apprenticeship Promotion Scheme">NAPS</abbr>
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
      
  </script>

</body>
</html>
