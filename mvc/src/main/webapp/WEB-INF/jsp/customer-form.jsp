<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
    <style>
        .hatali{
            color:red;
        }
    </style>
</head>
<body>
    <i>Lütfen müşteri formunu doldurunuz. Soyadi boş geçilemez</i>
<br><br>
    <form:form action="processForm" modelAttribute="customer">
        İsim : <form:input path="firstName"/><br>

        *Soyisim:<form:input path="lastName"/><br>
        <form:errors path="lastName" cssClass="hatali"/>

        Degerlendirme:<form:input path="degerlendirme"/><br>
        <form:errors path="degerlendirme" cssClass="hatali"/>

        *Postakodu:<form:input path="postaKodu"/><br>
        <form:errors path="postaKodu" cssClass="hatali"/>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
