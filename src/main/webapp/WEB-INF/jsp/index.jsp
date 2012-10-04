<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to MyDoppelganger</title>
        <link rel="stylesheet" href="../js/doppelstyle.css">
    </head>
    <%@ include file="header.jsp" %>
    <body>
        <h3>MyDoppelganger</h3>



        <table>
            <tr>
                <td><a href="register/registerProfile.htm">Register</a></td>
                <td><a href="profile/showProfile.htm">My Profile</a></td>
            </tr>
        </table>    

        <%@ include file="footer.jsp" %>
    </body>
</html>
