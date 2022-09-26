function validar(){
	var user = document.getElementById("usuario").value;
	var password = document.getElementById("contraseña").value;

	if(user.length < 1){
		alert("Ingrese el correo");
		return false;
	}
	else{
		if(password.length < 1){
			alert("Ingrese la contraseña")
			return false;
		}
	}

	if (user === "Julian" && password === "1234"){
		alert("Exitoso","succes")
		window.location = "DASH-CLIENTE/index.html";
	}
	else
		if(user === "Geraldin" && password === "4444"){
			alert("Exitoso","succes")

			window.location="index.html";
		}

		else{
			alert("Error de validacion")
		}


}

