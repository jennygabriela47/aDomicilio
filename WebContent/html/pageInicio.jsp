<%@page import="ec.edu.epn.modelo.servicio.ServicioSector"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*,ec.edu.epn.modelo.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Inicio</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<body>
	<%@include file="header.jsp" %>
	<br>
	<form method="get" action="html/pageSegunda.jsp">
		<div class="container">
			<section class="main">
			<div class="row">
				<div class="col-xs-12 col-sm-4 col-md-3 col-lg-6" align="center">
				<h4>Lugar de env�o: </h4>
					<select style="width:180px; height:40px;">
						<option value="Seleccione">Selecciona</option>
						<option value="Quito">Quito</option>
					</select>
					<select style="width:180px; height:40px;">
						<option value="Seleccione">Seleccione...</option>
						<%
							ServicioSector cs = new ServicioSector();
							List<String> listaSectores = (List<String>)request.getAttribute("comboSector");
							for(String ls:listaSectores){
						%>
						<option value="<%=ls%>"><%=ls%></option>
						<%}%>
										
					</select>
				</div>
				<div class="col-xs-12 col-sm-8 col-md-9 col-lg-6" align="center">
					<img src="imagenes/foodNow.png" class="img-responsive"/>
					<h4>Tiempo de entrega: 30 minutos</h4>
					<h4>Monto m�nimo: $5.00</h4>
					<h4>Modo de pago: Efectivo</h4>
					<button type="submit" class="btn btn-primary" >Ingresar</button>
				</div>
			</div>		
			</section>
		</div>
	</form>	
	<br>
	<%@include file="footer.jsp" %>
	<script language="Javascript" type="text/javascript" src="js/jQuery.js"></script>
	<script language="Javascript" type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>