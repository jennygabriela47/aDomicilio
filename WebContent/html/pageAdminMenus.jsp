<%@page import="ec.edu.epn.modelo.vo.MenuVO"%>
<%@page import="ec.edu.epn.modelo.servicio.ServicioMenu"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*,ec.edu.epn.modelo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Menus</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<body>
	<%@include file="header.jsp" %>
	
	<center>
	<%@include file="menu.jsp" %>
		<div class="container">
		<div align="center">
		<form method="get" action="NuevoPlato">
		<button type="submit" class="btn btn-primary ">NUEVO PLATO</button>
		</form>
		</div>	
		</div>		
		</center>
			<center>
	<form method="get" action="Menus">
		
	
				<div>
				<h2>ENTRADAS</h2>
				
					<table class="table" >
				
						<%
						List<MenuVO> en = (List<MenuVO>)request.getAttribute("entradas");
						for(MenuVO entra:en){												
						%>
						<tr>
							<td>
								<b><%= entra.getNombrePlato()%></b>
							</td>
							
						</tr>
						<tr>
							<td>
								<%= entra.getDescripcionPlato() %>
							</td>
						
		
							
									
						</tr>	
			
					<%} %>	
				
								</table>
								</div>
					
					
		
						<div>
				<h2>PLATOS FUERTES</h2>
						<table class="table" >
						
						<% 
						List<MenuVO> fu = (List<MenuVO>)request.getAttribute("platosFuertes");
						for(MenuVO entra:fu){												
						%>
						<tr>
							<td>
								<b><%= entra.getNombrePlato()%></b>
							</td>
							
						</tr>
						<tr>
							<td>
								<%= entra.getDescripcionPlato() %>
							</td>
						
		
							
						</tr>	
											
						<%} %>
						</table>
						</div>
						<div>
				<h2>POSTRES</h2>
					
					<table class="table" >
						<%
						List<MenuVO> po = (List<MenuVO>)request.getAttribute("postres");
						for(MenuVO entra:po){												
						%>
						<tr>
							<td>
								<b><%= entra.getNombrePlato()%></b>
							</td>
							
						</tr>
						<tr>
							<td>
								<%= entra.getDescripcionPlato() %>
							</td>
							
		
						</tr>	
											
						<%} %>
							</table>
						</div>
						
						<div>
				<h2>BEBIDAS</h2>
						<table class="table" >
						<%
					
						List<MenuVO> be = (List<MenuVO>)request.getAttribute("bebidas");
						for(MenuVO entra:be){												
						%>
						<tr>
							<td>
								<b><%= entra.getNombrePlato()%></b>
							</td>
							
						</tr>
						<tr>
							<td>
								<%= entra.getDescripcionPlato() %>
							</td>
						
							
						</tr>	
											
						<%} %>
						
					</table>
					</div>	
					</form>
	
	<input type="hidden" name="codPedido" value="<%=codPedido%>"/>
	
	</center>
	<%@include file="footer.jsp" %>
	<script language="Javascript" type="text/javascript" src="js/jQuery.js"></script>
	<script language="Javascript" type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>