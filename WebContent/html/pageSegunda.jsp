<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<body>
	<%@include file="header.jsp" %>
	<form method="get" action="/pageDatos.jsp">
		<%@ include file="menu.jsp" %>
		<div class="container">
			<h3 align="center">3 Sencillos Pasos</h3>
			<div class="container-fluid" align="center">
				<div class="row">
					<div class="col-md-2">
						<img src="../imagenes/pasos.gif" class="img-responsive"/>
					</div>
				</div>
			</div>
		</div>
		<br>
		<div class="container">
			<div class="table-responsive">
				<table class="table">
					<thead>
						<tr class="success">
							<th>#</th>
							<th>Detalle</th>
							<th>Cantidad</th>
							<th>Precio</th>			
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Parrillada</td>
							<td>1</td>
							<td>12.00</td>
							<td><button type="submit" class="btn btn-xs btn-info">Editar</button></td>
							<td><button type="submit" class="btn btn-xs btn-info">Eliminar</button></td>            
						</tr>
					</tbody>
				</table>
			</div>	
		</div>
		<div class="container">
			<table class="table table-condensed">
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><h6>Subtotal</h6></td>
					<td><h6>12.00</h6></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><h6>Iva</h6></td>
					<td><h6>0,12</h6></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><h6>Total</h6></td>
					<td><h6>12,12</h6></td>
				</tr>
			</table>
		</div>
		<div class="container" align="center";>
			<button type="submit" class="btn btn-primary">Hacer pedido</button>
		</div>
	</form>
	<br>
	<%@include file="footer.jsp" %>
	<script language="Javascript" type="text/javascript" src="js/jQuery.js"></script>
	<script language="Javascript" type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>