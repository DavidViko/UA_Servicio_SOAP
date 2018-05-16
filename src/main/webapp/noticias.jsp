<%@include file="/templates/head.jsp"%>
<%@include file="/templates/navbar.jsp"%>
<%@ page import="java.util.Date"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<h1>Universidad de Alicante</h1>

<div class="container">
	<div class="row">
		<div class="col-sm-8">
			<h2>Noticias</h2>
			<c:forEach items="${noticias}" var="noticia">
				<h4>
					<a href="${noticia.url}">${noticia.titulo}</a>
				</h4>
		   ${noticia.contenido} <br />
			</c:forEach>
		</div>
		<div class="col-sm-4">
			<h2>Días festivos</h2>
			<c:forEach items="${diasFestivos}" var="festivos">
				${festivos.fechaini} - ${festivos.nomtipo}
		    <br />
			</c:forEach>
		</div>
	</div>
</div>


<%@include file="templates/footer.jsp"%>