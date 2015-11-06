<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
	<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="../css/estilos.css" type="text/css">
</head>
<body>
	<%@include file="header.jsp" %>
	<form method="get" action="../html/pageSegunda.jsp">
		<%@include file="menu.jsp" %>
		<div align="center">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-8 col-md-9 col-lg-6">
					<table class="table table-condensed" >
						<tr>
							<td>
							<h3>Albóndigas con salsa blanca</h3>
							</td>
							<td>
							<h4><small>$2,50 c/u </small></h4>
							</td>
						</tr>
						<tr>
							<td>
								<h4>
									<small>Albondigas en salsa blanca de champiñones</small>
								</h4>
							</td>
							<td>
								<table>
									<tr>
										<td>
											<input type="text" />
										</td>
									</tr>
									<br>
									<tr>
										<td align="right">
											<button type="submit" class="btn btn-primary btn-xs">Agregar</button>
										</td>
									</tr>
								</table>							
							</td>
						</tr>
					</table>	
				</div>
			</div>			
		</div>
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-8 col-md-9 col-lg-6">
					<table class="table table-condensed">
						<tr>
							<td>
							<h3>Albóndigas con salsa de tres chiles</h3>
							</td>
							<td>
							<h4><small>$2,00 c/u </small></h4>
							</td>
						</tr>
						<tr>
							<td>
								<h4>
									<small>Albóndigas en salsa roja de chile</small>
								</h4>
							</td>
							<td>
								<table>
									<tr>
										<td>
											<input type="text" />
										</td>
									</tr>
									<br>
									<tr>
										<td align="right">
											<button type="submit" class="btn btn-primary btn-xs">Agregar</button>
										</td>
									</tr>
								</table>							
							</td>
						</tr>
					</table>	
				</div>
			</div>			
		</div>
	</div>
	</form>
	<%@include file="footer.jsp" %>
</body>
</html>