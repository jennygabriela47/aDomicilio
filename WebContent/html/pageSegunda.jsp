<%@page import="java.text.DecimalFormat"%>
<%@page import="ec.edu.epn.modelo.vo.PedidoVO"%>
<%@page import="ec.edu.epn.modelo.vo.MenuVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Food Now</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<body>
	<% //String codPedido = request.getParameter("codPedido"); %>
	<%@include file="header.jsp" %>
	<% HttpSession hs = request.getSession();
		List<PedidoVO> pedidos = (List<PedidoVO>) request.getAttribute("pedido");
		int cont=1;
	%>
	<form method="get" action="Pedido">
		<%@ include file="menu.jsp" %>
		<div class="container">
			<h3 align="center">3 Sencillos Pasos</h3>
			<div class="container-fluid" align="center">
				<div class="row">
					<div class="col-md-2">
						<img src="imagenes/pasos.gif" class="img-responsive"/>
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
						<%for (PedidoVO pedido:pedidos){%>
						<tr>
							<td><%=cont%></td>
							<td><%=pedido.getNombrePlato()%></td>
							<td><%=pedido.getCantidad()%></td>
							<td><%=pedido.getPrecio()%></td>
							<!--<td><button type="submit" class="btn btn-xs btn-info">Editar</button></td>-->
							<input type="hidden" name="codPedido" value="<%=codPedido%>"/>
							<td><button type="submit" class="btn btn-xs btn-info" name="borrar<%=pedido.getCodigoPlato()%>" value="<%=pedido.getCodigoPlato()%>">Eliminar</button></td>            
						</tr>
						<%cont++;
						}%>
					</tbody>
				</table>
			</div>	
		</div>
		<div class="container">
		<%double subtotal=0.0;
		for (PedidoVO pedido:pedidos){
			subtotal += (pedido.getPrecio()*pedido.getCantidad());
		}
		double iva = subtotal * 0.12;
		double total = subtotal+iva;
		DecimalFormat df = new DecimalFormat("0.00");%>
			<table class="table table-condensed">
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><h6>Subtotal</h6></td>
					<td><h6><%=df.format(subtotal)%></h6></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><h6>Iva</h6></td>
					<td><h6><%=df.format(iva)%></h6></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><h6>Total</h6></td>
					<td><h6><%=df.format(total)%></h6></td>
				</tr>
			</table>
		</div>		
	</form>
	<form method="get" action="Datos">
		<div class="container" align="center";>
		<% String subtotalSt = subtotal+"";
			String totalSt = total+"";
			subtotalSt = subtotalSt.replace(",", "");
			totalSt = totalSt.replace(",", "");
		%>
			<input type="hidden" name="subtotal" value="<%=subtotalSt%>"/>
			<input type="hidden" name="total" value="<%=totalSt%>"/>
			<input type="hidden" name="codPedido" value="<%=codPedido%>"/>
			<button type="submit" class="btn btn-primary">Hacer pedido</button>
		</div>
	</form>
	<br>
	<%@include file="footer.jsp"%>
	<script language="Javascript" type="text/javascript" src="js/jQuery.js"></script>
	<script language="Javascript" type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>