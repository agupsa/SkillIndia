<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html >
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
<br>
<!-- Form Heading -->
      <center><h2><b><mark>Candidate Registration Form</mark></b></h2></center><br>

   <!-- Header -->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="index.jsp"><img src="Bootstrap/img/National.png" width="200" height="150" alt="" title="" /></img></a>
        
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li><a href="#about">About Us</a></li>
        
         
        <li class="menu-has-children"><a href="">Candidate</a>
            <ul>
              <li><a href="CandidateRegister.jsp">Candidate Register</a></li>
              <li><a href="CandidateLogin.jsp">Candidate Login</a></li>
             </ul>
          </li>
     
     <li class="menu-has-children"><a href="">Establishment</a>
            <ul>
              <li><a href="EstablishmentRegistration.jsp">Establishment Register</a></li>
              <li><a href="EstablishmentLogin.jsp">Establishment Login</a></li>
             </ul>
          </li>
        </ul>
        <ul class="nav-menu">
         <li><a href="search.jsp">Search</a></li>
         </ul>
          <ul class="nav-menu">
         <li><a href="courseApply.jsp">Course Form</a></li>
         </ul>
      </nav>
     <!-- #nav-menu-container -->

    </div>
  </header>
  <!-- #header -->

  <!-- About -->

  <section class="bcg" class="container" style="padding-top: 20px;">
  
    <form class="container" action="registerCandidate" method="post" enctype="multipart/form-data">
      <!-- Form Heading -->

      <!-- Form Fields -->
      <!-- Candidate -->
      
         <!-- Full Name-->
      <div class="form-row">
        <div class="col-md-6 form-group">
          <label class="control-label" >Candidate Name</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
            <input name="name" maxlength="30" placeholder="Full Name" required="required" class="form-control"  type="text"
                title="Enter Full Name">
          </div>
        </div>
      </div>


      <!-- Gender Radio Buttons -->
      <div class="form-group">
        <label class="control-label">Gender</label><font style= "color:red;">*</font>
        <div class="form-row col-md-6" style="border: 1px solid #ddd; border-radius: 5px; padding: 0; padding-top: 8px;">
          <div class="radio radio-inline col-md-4">
            <input type="radio" id="inlineRadio1" value="male" name="gender" checked>
            <label for="inlineRadio1"> Male </label>
          </div>
          <div class="radio radio-inline col-md-4">
            <input type="radio" id="inlineRadio2" value="female" name="gender">
            <label for="inlineRadio2">Female</label>
          </div>
          <div class="radio radio-inline col-md-4">
            <input type="radio" id="inlineRadio3" value="others" name="gender"></input>
            <label for="inlineRadio3">Others</label>
          </div>
        </div>
      </div>

   <!-- Date of birth -->
      <div class="form-group">
        <label class="control-label">Date of birth</label><font style= "color:red;">*</font>
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-calendar" aria-hidden="true"></i></span>
          <input id="dob" type="date" name="dob" title="The Age Limit Range is from 21 Years to 35 Years." required>
          <p><font style= "color:red;">*Age Limit: 21 - 35 yrs.</font></p>
      </div>
      </div>
      
   <!-- Candidate Email -->
 	<div class="form-group">
        <label class="control-label">Candidate Email</label><font style= "color:red;">*</font>
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-envelope" aria-hidden="true"></i></span>
          <input maxlength="30" name="username" placeholder="email" class="form-control" required="required" type="email" title="Enter an e-Mail address of a valid format including the domain name.	">
        </div>
      </div>
      
      <!-- Password & Confirm Password (on the same row) -->
      <div class="form-row">
      <font size="0.2px" color="grey">&nbsp (Password Should be at least 8 characters long and must contain at least one character in Upper Case, Lower Case, Numerical Form, and a Special Character.)</font>
        <div class="col-md-6 form-group">
          <label class="control-label" >Password</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
            <input maxlength="30" id="password" name="pass" placeholder="Password" class="form-control"  required="required" type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                title="Password Should be at least 8 characters long and must contain at least one character in Upper Case, Lower Case, Numerical Form, and a Special Character.">
          </div>
        </div>
<!--         <div class="col-md-6 form-group">
          <label class="control-label" >Confirm Password</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
            <input maxlength="30" id="confirmPassword" name="password" placeholder="Confirm Password" class="form-control" required="required" type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" onkeyup="validate()" 
                title="Password Should be at least 8 characters long and must start with an Upper Case character, then Lower Case characters, spacial characters and numbers.">
          </div>
        </div> -->
      </div>

   

      

      <div class="form-row">
        <!-- Mobile No -->
        <div class="form-group col-md-6">
          <label class="control-label">Contact Number</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-phone" aria-hidden="true"></i></span>
            <input name="contactNo" maxlength="10" placeholder="Contact Number" class="form-control"  type="text" pattern="[789][0-9]{9}" title="Enter Contact Number starting with either 7, 8, or 9.">
          </div>
        </div>

        <!-- Aadhar No -->
        <div class="form-group col-md-6">
          <label class="control-label">Aadhar Number</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-id-card-o" aria-hidden="true"></i></span>
            <input name="aadharNo" maxlength="12" placeholder="Aadhar Number" class="form-control" required="required" type="text" pattern="[1-9][0-9]{11}" title="Enter Aadhaar Number containing 12 digits.">
          </div>
        </div>
      </div>

		<!-- Father Name -->
		<div class="form-group">
          <label class="control-label" >Father's Name</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-male" aria-hidden="true"></i></span>
            <input name="fatherName" maxlength="30" placeholder="Father's Name" class="form-control" required="required" type="text" >
          </div>
        </div>

   
<!-- Qualification details -->
      <div class="form-row">
        <div class="form-group col-md-6">
          <label class="control-label">Highest Qualification</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-graduation-cap" aria-hidden="true"></i></span>
            <select name="qualification" class="form-control"  >
		<option >High School Dropout</option>
              <option >10th(SSC)</option>
              <option >12th(HSC)</option>
              <option >Graduate</option>
              <option >Post Graduate</option>
            </select>
          </div>
        </div>

        <div class="form-group col-md-6">
          <label class="control-label" >Institute Name</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-university" aria-hidden="true"></i></span>
            <input maxlength="50" name="collegeName" placeholder="Institute Name" class="form-control"  type="text" required>
          </div>
        </div>
         <div class="form-group col-md-6">
          <label class="control-label" >Percentage</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-graduation-cap" aria-hidden="true"></i></span>
            <input maxlength="4" name="marks" placeholder="Obtained Marks" class="form-control" min="0" type="number" step="0.1" required >
          </div>
        </div>
        
      </div>

      <!-- <hr style="margin: 50px 0px;"> -->
      
      <div class="form-group">
          <label class="control-label" >Street Name</label><font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-location-arrow" aria-hidden="true"></i></span>
            <input name="addr.addr" maxlength="30" placeholder="Street Name" class="form-control"  type="text" title="Enter Street Name with a minimum of 10 words." required>
          </div>
        </div>


      <div class="form-row">
               
        <!-- State -->
        <div class="form-group col-md-4">
          <label class="control-label">State</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-map-marker" aria-hidden="true"></i></span>
            <select name="addr.state" class="form-control" id="state-select" required>
    			
            </select>
          </div>
        </div>

        <!-- City -->
        <div class="form-group col-md-4">
          <label class="control-label">City</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-building" aria-hidden="true"></i></span>
			<select name="addr.city" class="form-control" id="city-select" required>
    			
            </select>
          </div>
        </div>


        <!-- Zip -->
        <div class="form-group col-md-4">
          <label class="control-label">Pincode</label> <font style= "color:red;">*</font>
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-envelope-open-o" aria-hidden="true"></i></span>
            <input name="addr.pincode" maxlength="6" placeholder="Pincode" class="form-control" pattern="[1-9][0-9]{5}" type="tel" required="required" title="Pincode of 6 digits">
          </div>
        </div>
      </div>  
      
      <!--Document Upload -->
            <div class="form-group">
          <label class="control-label">Photo Upload</label> <font style= "color:red;">*</font>
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-files-o" aria-hidden="true"></i></span>
            <input class="form-control" name="files" type="file" required="required" id="file" onchange="validate_fileupload(this.value);" >
          </div>
        </div>

		<div class="form-group">
          <label class="control-label">Upload AadharCard</label><font style= "color:red;">*</font>
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-files-o" aria-hidden="true"></i></span>
            <input class="form-control" name="files" type="file" required="required" id="file"  onchange="validate_fileupload(this.value);">
          </div>
        </div>



   <div class="form-group">
          <label class="control-label">Education Certificate</label> <font style= "color:red;">*</font>
          <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-files-o" aria-hidden="true"></i></span>
            <input class="form-control" name="files" type="file" required="required" id="file"  onchange="validate_fileupload(this.value);">
          </div>
          <div id="fileList"></div>
        </div>

        <!-- Submit button -->
        <div class="form-group col-md-4" style="padding: 0;">
          <label class="control-label"></label>
          <div>
            <button id="submit-button" type="submit" name="CandidateRegistration" class="btn btn-primary form-control" style="border-radius:10px;">
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

<script>

function validate_fileupload(fileName)
{
    var allowed_extensions = new Array("jpg","pdf");
    var file_extension = fileName.split('.').pop().toLowerCase(); // split function will split the filename by dot(.), and pop function will pop the last element from the array which will give you the extension as well. If there will be no extension then it will return the filename.

    for(var i = 0; i <= allowed_extensions.length; i++)
    {
        if(allowed_extensions[i]==file_extension)
        {
            return true; // valid file extension
        }
    }

    return false;
}
	</script>

</body>
</html>