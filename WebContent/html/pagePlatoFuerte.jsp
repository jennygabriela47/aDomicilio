<%@page import="ec.edu.epn.modelo.vo.MenuVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*,ec.edu.epn.modelo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Platos Fuertes</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<body>
	<%@include file="header.jsp" %>
		<%@include file="menu.jsp" %>
		<div align="center">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-8 col-md-9 col-lg-6">
										<table class="table" >
						<%
						List<MenuVO> li = (List<MenuVO>)request.getAttribute("platosFuertes");
						for(MenuVO entra:li){												
						%>
						<tr>
							<td>
								<%= entra.getNombrePlato()%>
							</td>
							<td>
								<%= "$ "+entra.getPrecio()%>
							</td>
						</tr>
						<tr>
							<td>
								<%= entra.getDescripcionPlato() %>
							</td>
							<td>
								<table>
								<form method="get" action="Pedido">
									<tr>
										<td>
											<input type="number" name="cantidad"/>
										</td>
									</tr>
									
									<tr>
										<td align="right">
											<input type="hidden" name="idPlato" value="<%=entra.getCodigoPlato()%>"/>
											<input type="hidden" name="codPedido" value="<%=codPedido%>"/>
											<button type="submit" class="btn btn-primary btn-xs">Agregar</button>
											
										</td>
									</tr>
								</form>
								</table>
							</td>
						</tr>						
						<%} %>
					</table>		
				</div>
			</div>			
		</div>		
	</div>
	<%@include file="footer.jsp" %>
	<script language="Javascript" type="text/javascript" src="js/jQuery.js"></script>
	<script language="Javascript" type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>