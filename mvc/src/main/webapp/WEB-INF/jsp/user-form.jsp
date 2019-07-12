<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: erpas
  Date: 9.07.2019
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
                    <title>User Form</title>
    </head>
        <body>
            <form:form action="processForm" modelAttribute="user">
                isim : <form:input path="firstName"/><br>
                soyisim:<form:input path="lastName"/><br>
                <form:select path="language">
                  <form:options items="${user.languages}"/>



                </form:select>
                <input type="submit" value="Submit" />
            </form:form>
        </body>
</html>
