<footer>
	<div class="container">
	<% HttpSession hscs = request.getSession();
	String idccs = (String) hscs.getAttribute("idusuario");
	if(idccs != null && !idccs.equals("")){%>
		<a href="Salir"><h5>Derechos Reservados</h5></a>
	<%}%>
	</div>
</footer>
