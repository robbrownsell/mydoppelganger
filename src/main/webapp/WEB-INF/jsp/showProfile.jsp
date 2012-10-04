<%-- 
    Document   : showProfile
    Created on : 22-Apr-2012, 20:10:11
    Author     : Rob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <h1>Profile Details</h1>
        <table>
            <tr><th colspan="2">${profile.forename}</th></tr>
            <tr><td>Name:</td><td>${profile.forename} ${profile.surname}</td></tr> 
            
        </table>
        <%@ include file="footer.jsp" %>
    </body>
</html>
