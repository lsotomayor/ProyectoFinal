<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" name="Menu" content="EmpleadoMenu">
<title><fmt:message key="empleadoList.title"/>Empleados List</title>
</head>
<body>
<div id="actions" class "btn-group">
<a href='<c:url value="/empleadoform"/>' class="btn btn-primary">'
<i class="icon-plus icon-white"></i> <fmt:message key="button.add"/></a>
    <a href='<c:url value="/home"/>' class="btn btn-default"><i class="icon-ok"></i> <fmt:message key="button.done"/></a>
    
    <display:table name="empleadoList" class="table table-condensed table-striped table-hover" requestURI=""
               id="empleadoList" export="true" pagesize="25">
    <display:column property="cedula" sortable="true" href="empleadoform" media="html"
        paramId="cedula" paramProperty="cedula" titleKey="empleado.cedula"/>
    <display:column property="cedula" media="csv excel xml pdf" titleKey="empleado.cedula"/>
    <display:column property="nombre" sortable="true" titleKey="empleado.nombre"/>
    <display:column property="apellido1" sortable="true" titleKey="empleado.apellido1"/>
     <display:column property="apellido2" sortable="true" titleKey="empleado.apellido2"/>
    <display:column property="correoElectronico" sortable="true" titleKey="empleado.correo"/>
 
    <display:setProperty name="paging.banner.item_name"><fmt:message key="empleadoList.empleado"/></display:setProperty>
    <display:setProperty name="paging.banner.items_name"><fmt:message key="empleadoList.empleados"/></display:setProperty>
 
    <display:setProperty name="export.excel.filename"><fmt:message key="empleadoList.title"/>.xls</display:setProperty>
    <display:setProperty name="export.csv.filename"><fmt:message key="empleadoList.title"/>.csv</display:setProperty>
    <display:setProperty name="export.pdf.filename"><fmt:message key="empleadoList.title"/>.pdf</display:setProperty>
</display:table>
</div>
</body>
</html>



 
