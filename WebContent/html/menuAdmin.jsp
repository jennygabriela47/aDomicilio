<nav class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#colapsar">
					<span class="sr-only">Inicio/Ocultar - Desplegar</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
		</div>
		<% HttpSession hsm = request.getSession();
		String codPedido = (String) hsm.getAttribute("codPedido");%>
		<div class="collapse navbar-collapse" id="colapsar">
			<ul class="nav navbar-nav">
				<li><a href="Usuarios">Usuarios</a></li>
				<li><a href="Menus">Menus</a></li>
				<li><a href="ListaPedidos">Pedidos</a></li>
				<li><a href="Sucursales">Sucursales</a></li>
				
			</ul>
		</div>
</nav>