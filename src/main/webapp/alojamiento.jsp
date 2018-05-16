<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!--  https://cvnet.cpd.ua.es/servicioweb/publicos/pub_gral.asmx?WSDL -->
<h1>Universidad de Alicante</h1>

<div class="container">
  <div class="row">
    <div class="col-sm-8">
      <h2>Alojamientos</h2>
		<c:forEach items="${alojam}" var="piso">
		   ${piso.direccion}">${piso.precio}
		 ${piso.observaciones}
		</c:forEach>
    </div>
  </div>
</div>




<%@include file="templates/footer.jsp" %>