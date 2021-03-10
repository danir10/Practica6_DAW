<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Formulario 2</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<h2 class="mt-5 ml-5 mb-3 text-center">Formulario 2</h2>

	<div class="container">
		<div class="row">
			<div class="col-12 col-md-4 offset-md-4">
				<form method="post" action="form2" class="text-center">
					<div class="form-group ml-5">
						<label for="nombre">Nombre <span class="text-danger">*</span></label>
						<input type="text" id="nombre" class="form-control" name="nombre"
							required>
					</div>
					<div class="form-group ml-5">
						<label for="apellidos">Apellidos <span class="text-danger">*</span></label>
						<input type="text" class="form-control" id="apellidos"
							name="apellidos" required>
					</div>
					<button type="submit" class="btn btn-primary">Transformar</button>
				</form>
			</div>
			<div class="col-12 text-center mt-5">
				<a class="btn btn-primary" href="inicio.jsp">Volver</a>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
