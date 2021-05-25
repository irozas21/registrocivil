<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="vendor/bulma/css/bulma.min.css" rel="stylesheet" />
</head>
<body>
	<header>
		<nav class="navbar has-background-warning" role="navigation" aria-label="main navigation">
			<div class="navbar-brand">
				<a class="navbar-item" href="https://bulma.io"> <img
					src="https://bulma.io/images/bulma-logo.png" width="112"
					height="28">
				</a> <a role="button" class="navbar-burger" aria-label="menu"
					aria-expanded="false" data-target="navbarBasicExample"> <span
					aria-hidden="true"></span> <span aria-hidden="true"></span> <span
					aria-hidden="true"></span>
				</a>
			</div>

			<div id="navbarBasicExample" class="navbar-menu">
				<div class="navbar-start">
					<a class="navbar-item"> Home </a> 

					<div class="navbar-item has-dropdown is-hoverable">
						<a class="navbar-link"> Ingreso Solicitud </a>
						<div> class="navbar-dropdown">
							<a class="navbar-item">Tipo de Solicitud</a></div>

						<div class="navbar-dropdown">
							<a class="navbar-item"> Atender Solicitudes </a> 
							<div class="navbar-item has-dropdown is-hoverable">
							<a class="navbar-link"> Tabla </a></div>
						</div>
					</div>
				</div>
			</div>
		</nav>
	</header>