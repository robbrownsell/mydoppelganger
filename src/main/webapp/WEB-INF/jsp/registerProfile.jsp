<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%-- 
    Document   : nameView
    Created on : 22-Apr-2012, 20:09:44
    Author     : Rob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Register</title>





    </head>
    <body>
        <%@ include file="header.jsp" %>
        <h1>Enter your name</h1>
        <spring:nestedPath path="profile">
            <form action="submitProfile.htm" method="post">
                <table border ="1">
                    <tr><td>
                            Forename:
                        </td>
                        <td>
                            <spring:bind path="forename">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                            <form:errors path="forename" >
                                forename must be between 2 and 30 characters in length
                            </form:errors>
                        </td>
                    </tr>
                    <tr><td>
                            Surname:
                        </td>
                        <td>
                            <spring:bind path="surname">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                            <form:errors path="surname">
                                surname must be between 2 and 50 characters in length
                            </form:errors>
                        </td>
                    </tr>
                    <tr><td>
                            Username:
                        </td>
                        <td>
                            <spring:bind path="profileUser.username">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                            <form:errors path="profileUser.username">
                                must be at least 6 characters
                            </form:errors>
                        </td>
                    </tr>
                    <tr><td>
                            Password:
                        </td>
                        <td>
                            <spring:bind path="profileUser.password">
                                <input type="password" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                            <form:errors path="profileUser.password">
                                must be at least 6 characters
                            </form:errors>
                        </td>
                    </tr>
                    <tr><td>
                            Date of Birth:
                        </td>
                        <td>
                            <spring:bind path="dob">
                                <input id="dob" type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                            <form:errors path="dob">
                            DOB must be of format dd/mm/yyyy    
                            </form:errors>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="OK">
                        </td>
                    </tr>
                </table>
            </form>
        </spring:nestedPath>
        <%@ include file="footer.jsp" %>
    </body>
</html>
