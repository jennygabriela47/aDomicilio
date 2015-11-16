<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registro</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<script type="text/javascript">

</script>
<body>
	<%@include file="header.jsp" %>
	<form method="get" action="Registro">
		<div class="container">
			<h1>REGISTRO</h1>
		</div>
	
		<div class="container">
			<table class="table">
				<tr>
					<td>Nombres: </td>
					<td>
						<input type="text" name="nombre">
					</td>
				</tr>
				<tr>
					<td>Apellidos: </td>
					<td>
						<input type="text" name="apellido">
					</td>
				</tr>
				<tr>
					<td>E-mail: </td>
					<td>
						<input type="text" name="email">
					</td>
				</tr>
				<tr>
					<td>Teléfono: </td>
					<td>
						<input type="text" name="telefono">
					</td>
				</tr>
				<tr>
					<td>Clave: </td>
					<td>
						<input type="text" name="clave">
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<button class="btn btn-primary" type="submit" >Registrar</button>
					</td>
				</tr>
			</table>
	</div>
	</form>
	<%@include file="footer.jsp" %>
</body>
</html>