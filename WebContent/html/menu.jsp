<nav class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#colapsar">
					<span class="sr-only">Inicio/Ocultar - Desplegar</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="Inicio" class="navbar-brand">Menú</a>
		</div>
		<% HttpSession hsm = request.getSession();
		String codPedido = (String) hsm.getAttribute("codPedido");%>
		<div class="collapse navbar-collapse" id="colapsar">
			<ul class="nav navbar-nav">
				<li><a href="Entrada?codPedido=<%=codPedido%>">Entradas</a></li>
				<li><a href="PlatoFuerte?codPedido=<%=codPedido%>">Platos fuertes</a></li>
				<li><a href="Postre?codPedido=<%=codPedido%>">Postres</a></li>
				<li><a href="Bebida?codPedido=<%=codPedido%>">Bebidas</a></li>
			</ul>
		</div>
</nav>