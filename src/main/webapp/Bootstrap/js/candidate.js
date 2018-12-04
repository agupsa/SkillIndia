
$("#dob").change(function() {
	var dateDom = document.getElementById("dob")
	var date = dateDom.value;
	var curYear = new Date().getUTCFullYear();
	var datejs = new Date(date).getUTCFullYear();
	var age = curYear - datejs;
	console.log(age);
	if (age < 21 || age > 35) {
		dateDom.style.outline = "2px solid red";
		document.getElementById("submit-button").disabled = true;
	} else {
		dateDom.style.outline = "none";
		document.getElementById("submit-button").disabled = false;
	}

});
