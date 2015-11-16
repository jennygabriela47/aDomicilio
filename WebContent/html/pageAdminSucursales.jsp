<%@page import="ec.edu.epn.modelo.vo.SucursalVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*,ec.edu.epn.modelo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>SUCURSALES</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<body>
	<%@include file="header.jsp" %>
	<form method="get" action="Sucursales">
		<%@include file="menuAdmin.jsp" %>
		<div align="center">
		
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-8 col-md-9 col-lg-6">
					<table class="table" >
						
							
						<tr>
						<th>NOMBRE</th><th>DIRECCION</th>
						</tr>
						<%
						
						List<SucursalVO> li = (List<SucursalVO>)request.getAttribute("sucursal");
						for(SucursalVO sucursal:li){												
						%>
						<tr>
							<td>
								<%= sucursal.getNombreS()%>
							</td>
							<td>
								<%= sucursal.getDireccionS()%>
							</td>
							<td>
							<button type="submit" class="btn btn-primary btn-xs" align="right">Eliminar</button>
						</td>
						</tr>
						<%} %>
							</table>
				</div>
			</div>			
		</div>
	</div>
	
	</form>
	<%@include file="footer.jsp" %>
	<script language="Javascript" type="text/javascript" src="js/jQuery.js"></script>
	<script language="Javascript" type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>