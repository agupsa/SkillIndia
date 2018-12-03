<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skill India</title>
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

<link rel="stylesheet" type="text/css" href="style.css">
<link href="Bootstrap/css/style.css" rel="stylesheet">

<link href="Bootstrap/css/prettyrc.css" rel="stylesheet">
<script>$('#popUpModal').modal('show')</script>
</head>
<body>
 <h3>Send Offer to candiadte by filling following details</h3>  
  <section class="bcg" class="container" style="padding-top: 20px;">
       <form class="container" modelAttribute="contract" action="sendOffer" method="post">
      <!-- Form Heading -->

      <!-- Form Fields -->
      <!-- Contract -->
      
      <!--Contract Number-->
       <div class="form-group">
				<label class="control-label">Contract Number</label><font
					style="color: red;">*</font>
				<div class="input-group" style="z-index: 0;">
					<span class="input-group-addon"><i
						class="fa fa-location-arrow" aria-hidden="true"></i></span> <input
						name="letterNo" maxlength="30"
						placeholder="Contract Number" class="form-control"
						type="number" value="${letterNo}" readonly>
				</div>
			</div>
           
      
       <!--Stipend-->
           <div class="form-group">
				<label class="control-label">Stipend</label><font
					style="color: red;">*</font>
				<div class="input-group" style="z-index: 0;">
					<span class="input-group-addon"><i
						class="fa fa-location-arrow" aria-hidden="true"></i></span> <input
						name="stipend" maxlength="30"
						placeholder="Stipend" class="form-control"
						type="text">
				</div>
			</div>
      
      <!-- Start Date -->
      <div class="form-group">
        <label class="control-label">Start Date </label><font style= "color:red;">*</font>
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-calendar" aria-hidden="true"></i></span>
          <input id="dob" type="date" name="startDate">         
      </div>
      </div>
      
      <!-- End Date -->
      <div class="form-group">
        <label class="control-label">End Date</label><font style= "color:red;">*</font>
        <div class="input-group" style="z-index: 0;">
          <span class="input-group-addon"><i class="fa fa-calendar" aria-hidden="true"></i></span>
          <input id="dob" type="date" name="endDate">         
      </div>
      </div>
      
                   
         <!-- Submit button -->
        <div class="form-group col-md-4" style="padding: 0;">
          <label class="control-label"></label>
          <div>
            <button id="submit-button" type="submit" name="sendOffer" class="btn btn-primary form-control" style="border-radius:10px;">
            SUBMIT <i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
          </div>
        </div>
        
</form>
</section>
</body>
</html>