<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:include page="WEB-INF/templates/header.jsp" ></jsp:include>
	<main class="container mt-10">
		<div class="columns is centered">
			<div class="column is-7">
				<form method="POST" action="AgregarSolicitudesController.do" >
					<div class="card" >
						<div class="card-header has-background-warning" >
							<span class="card-header-tittle">Ingresar Solicitudes</span>
						</div>
						<div class="card-content">
						</div>
						<div class="card-content">
						<div class="field">
							<label class="label" for="Rut-txt">Rut del cliente</label>
							<div class="card-footer">
							 <imput type="text" class="input" id="rutdelcliente-txt" name="rutdelcliente-txt" />
							</div>			
						</div>
						<div class="card-content">
						<div class="field">
							<label class="label" for="Rut-txt">Nombre Del Cliente</label>
							<div class="card-footer">
							 <imput type="text" class="input" id="nombredelcliente-txt" name="nombredelcliente-txt" />
							</div>			
						</div>
			<div class="field">
			<label class="label" for="tipodesolicitud-select">Tipo de Solicitud></label>
				<div class="control">
					<div class="select">
						<select name="tipodesolicitud-select" id=tipodesolicitud-select">
						<option> - Solicitud de cedula de Identidad</option>
						<option> - Retiro de cedula de Identidad</option>
						<option> - Solicitud certificado de Nacimiento</option>
						<option> - Solicitud Certificado de Defuncion</option>
						</select>
			</div>
			</div>
			</div>
						</div>
						</div>
					</div>
					<div class="card-footer"></div>
				</form>
			</div>
			<div class="card-footer has-text-centered">
				<button type="submit" class="button is-primary">Ingresar Solicitud</button>
			</div>
			</div>
		</div>
	</main>

</body>
</html>