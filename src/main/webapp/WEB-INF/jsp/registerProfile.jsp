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
        <h1>Register</h1>



        <form:form modelAttribute="profile" action="submitProfile.htm" method="post">
            <form:errors path="profileUser.username" />

                <table border ="1">
                    <tr><td>
                            Forename:
                        </td>
                        <td>
                            <form:input path="forename" type="text" name="${status.expression}" value="${status.value}"/>
                            <form:errors path="forename" >
                                forename must be between 2 and 30 characters in length
                            </form:errors>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Surname:
                        </td>
                        <td>
                            <form:input path="surname" type="text" name="${status.expression}" value="${status.value}"/>
                            <form:errors path="surname">
                                surname must be between 2 and 50 characters in length
                            </form:errors>
                        </td>
                    </tr>
                    <tr><td>
                            Username:
                        </td>
                        <td>
                            <form:input path="profileUser.username" id="username" type="text" name="${status.expression}" value="${status.value}"/>
                            <form:errors path="profileUser.username">
                                must be at least 6 characters
                            </form:errors>
                        </td>
                    </tr>
                    <tr><td>
                            Password:
                        </td>
                        <td>
                            <form:input path="profileUser.password" type="password" name="${status.expression}" value="${status.value}"/>
                            <form:errors path="profileUser.password">
                                must be at least 6 characters
                            </form:errors>
                        </td>
                    </tr>
                    <tr><td>
                            Date of Birth:
                        </td>
                        <td>
                            <form:input path="dob" id="dob" type="text" name="${status.expression}" value="${status.value}"/>
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

        </form:form>

        <%@ include file="footer.jsp" %>
    </body>
</html>
