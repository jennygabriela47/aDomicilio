<nav class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#colapsar">
					<span class="sr-only">Inicio/Ocultar - Desplegar</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="Inicio" class="navbar-brand">Inicio</a>
		</div>
		<div class="collapse navbar-collapse" id="colapsar">
			<ul class="nav navbar-nav">
			<% HttpSession hsm = request.getSession();
			String codPedido = (String) hsm.getAttribute("codPedido");
			String idusuario = (String) hsm.getAttribute("idusuario");
			if(idusuario != null && !idusuario.equals("")){%>
				<%if(idusuario.equals("73")){%>
					<li><a href="Usuarios">Usuarios</a></li>
					<li><a href="Menus">Menus</a></li>
					<li><a href="ListaPedidos">Pedidos</a></li>
					<li><a href="Sucursales">Sucursales</a></li>
				<%}%>
				<%if(codPedido != null && !codPedido.equals("")){%>
				<li><a href="Entrada?codPedido=<%=codPedido%>">Entradas</a></li>
				<li><a href="PlatoFuerte?codPedido=<%=codPedido%>">Platos fuertes</a></li>
				<li><a href="Postre?codPedido=<%=codPedido%>">Postres</a></li>
				<li><a href="Bebida?codPedido=<%=codPedido%>">Bebidas</a></li>			
			<%}%>
				<li><a href="ActualizacionUsuario">Actualiza tus Datos</a></li>
				<li><a href="Salir">Salir</a></li>
			<%}
			else{%>
				<li><a href="Registro">Regístrate</a></li>
				<li><a href="Sesion">Iniciar Sesión</a></li>
			<%}%>
			</ul>
		</div>
</nav>