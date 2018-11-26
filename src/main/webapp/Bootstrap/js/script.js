
function validate(){
	var password1 = document.getElementById('password');
	var password2 = document.getElementById('confirmPassword');

	var some = document.getElementById('some');
	if(password1.value===password2.value){
		console.log('yes');
		password2.style.outline = "none";
	}
	else{
		password2.style.outline = "2px solid red";
	}
}