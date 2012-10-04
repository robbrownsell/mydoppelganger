<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : header
    Created on : 13-May-2012, 20:20:03
    Author     : Rob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="../js/jquery-1.7.2.js"></script>
	<script src="../js/ui/jquery.ui.core.js"></script>
	<script src="../js/ui/jquery.ui.widget.js"></script>
	<script src="../js/ui/jquery.ui.datepicker.js"></script>
        
        <script src="../myjs.js"></script>
        
        <script>
	$(function() {
		$( "#dob" ).datepicker();
	});
	</script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../js/doppelstyle.css">
    </head>
    <body>
         <a href='<c:url value="/j_spring_security_logout" />' > Logout</a>
    <hr/>
    </body>
</html>
