<%@page import="ec.edu.epn.modelo.vo.DatoClienteVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Actualizar</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<script type="text/javascript">

</script>
<body>
	<%@include file="header.jsp" %>
	<%@include file="menu.jsp" %>
	<form method="get" action="ActualizacionUsuario">
	<%HttpSession hsau = request.getSession(); 
		DatoClienteVO dc = (DatoClienteVO) hsau.getAttribute("usuario");%>
		<div class="container">
			<h1>Actualiza tu Información</h1>
		</div>
	
		<div class="container">
			<table class="table">
				<tr>
					<td>Nombres: </td>
					<td>
						<input type="text" name="nombre" value="<%=dc.getNombre()%>" disabled/> 
					</td>
				</tr>
				<tr>
					<td>Apellidos: </td>
					<td>
						<input type="text" name="apellidos" value="<%=dc.getApellido()%>" disabled/>
					</td>
				</tr>
				<tr>
					<td>E-mail: </td>
					<td>
						<input type="text" name="email" value="<%=dc.getCorreo()%>" disabled/>
					</td>
				</tr>
				<tr>
					<td>Teléfono: </td>
					<td>
						<input type="text" name="telefono" value="<%=dc.getTelefono()%>"/>
					</td>
				</tr>
				<tr>
					<td>Clave: </td>
					<td>
						<input type="password" name="clave">
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<button class="btn btn-primary" type="submit" >Actualizar</button>
					</td>
				</tr>
			</table>
	</div>
	</form>
	<%@include file="footer.jsp" %>
</body>
</html>