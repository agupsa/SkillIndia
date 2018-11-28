<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
  <meta charset="utf-8">
  <title>Login</title>
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
      <center><h1><b><mark>Candidate Login</mark></b></h1></center><br>

  <!-- Header -->
 <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="index.jsp"><img src="Bootstrap/img/National.png" alt="" title="" /></img></a>
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
        <!--   <li class="menu-has-children"><a href="">Registration</a>
            <ul>
              <li><a href="CandidateRegister.jsp">Candidate Registration Page</a></li>
              <li><a href="EstablishmentRegistration.jsp">Establishment Registration Page</a></li>
             </ul>
          </li> -->
          <li><a href="#contact">Contact Us</a></li>
        </ul>
      </nav>
      <!-- #nav-menu-container -->

     
    </div>
  </header>
  <!-- #header -->
<%-- 
  <c:if test="${requestScope.message!=null}">
              	<div class="alert alert-warning" role="alert">
  					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  					<center>${message}</center>
				</div>
  </c:if>
 --%>
  <section class="bcg" class="container" style="padding-top: 20px;">
    <form action="candidatelogin" class="container" method="post" >
  <div  align="center">
      <!-- Form Fields -->
      
      <!-- Candidate -->
      <div class="form-group col-md-4" >
        <label class="control-label">User Name</label> 
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
          <input name="username" placeholder="User Name" class="form-control" required="required" type="text" title="">
        </div>
      </div>

      <!-- Password  -->
      
        <div class="form-group col-md-4">
          <label class="control-label" >Password</label> 
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
            <input id="password" name="password" placeholder="Password" class="form-control"  required="required" type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                title="Password Should be at least 8 characters long and must contain at least one character in Upper Case, Lower Case, Numerical Form, and a Special Character.">
          </div>
        </div>
       

     <!--  <div class="form-group col-md-4">
          <label class="control-label">Login as:</label> 
          <div class="input-group" style="z-index: 0;">
            <span class="input-group-addon"><i class="fa fa-user-circle-o" aria-hidden="true"></i></span>
            <select name="loginAs" class="form-control">
              <option value="candidate">Candidate</option>
              <option value="Establishment">Establishment</option>
            </select>
          </div>
        </div> -->
	  <a href="#">Forgot Password</a>
	  <br/>
	  <p style="text-align: center;">New User?</p>
      <p style="text-align: center;"><a href="CandidateRegister.jsp">Register as a Candidate</a></p>
<!--       <p style="text-align: center"><a href="EstablishmentRegistration.jsp">Register as an Establishment</a></p>
 -->      
        <!-- Submit button -->
       <div class="form-group col-md-4" style="padding: 0;">
          <label class="control-label"></label>
          <div>
            <button type="submit" class="btn btn-primary form-control" style="border-radius:10px; ">
            SUBMIT <i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
          </div>
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
              <p>NAPS<br> Mumbai</p>
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
              <abbr title="National Aprrenticeship Promotion Scheme">NAPS</abbr>
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

  <!-- Template Specisifc Custom Javascript File -->
  <script src="Bootstrap/js/custom.js"></script>

  <script src="Bootstrap/contactform/contactform.js"></script>
  
 <!-- State Drop Down List Scripts -->
    <script type="text/JavaScript" src='js/state.js'></script>
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
