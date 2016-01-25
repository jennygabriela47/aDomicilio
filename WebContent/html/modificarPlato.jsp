<%@page import="ec.edu.epn.modelo.vo.MenuVO"%>
<%@page import="ec.edu.epn.modelo.vo.CategoriaVO"%>
<%@page import="ec.edu.epn.modelo.servicio.ServicioCambioPlato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*,ec.edu.epn.modelo.*" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Nuevo Plato</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<body>
	<%@include file="header.jsp" %>
	<form method="get" action="CambioPlato">
	
		<div class="container">
			<h1>Editar Plato</h1>
		</div>
		<div class="container">
			<table class="table">
				<tr>
					<td>Nombre: </td>
					<td>
						<input type="text" name="nombre" >
					</td>
				</tr>
				<tr>
					<td>Descripción: </td>
					<td>
						<input type="text" name="descricion" >
					</td>
				</tr>
				<tr>
					<td>Precio: </td>
					<td>
						<input type="text" name="precio">
					</td>
				</tr>
				
				<tr>
					<td align="center" colspan="2">
						<button class="btn btn-primary" type="submit" onclick="mensajeFinalizado()">Registrar</button>
					</td>
				</tr>
			</table>
	</div>
	</form>
	<%@include file="footer.jsp" %>
</body>
</html>