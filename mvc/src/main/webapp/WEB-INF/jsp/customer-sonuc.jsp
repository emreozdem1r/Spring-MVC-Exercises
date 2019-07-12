<%--
  Created by IntelliJ IDEA.
  User: erpas
  Date: 9.07.2019
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sonuc</title>
</head>
<body>
        <i>Müşteri onaylanmıştır.</i>
        <br>
        Müşteri adı ve soyadı: ${customer.firstName} ${customer.lastName}
        <br><br>
        Musteri Degerlendirmesi :${customer.degerlendirme}
        <br><br>
        Musteri Posta Kodu: ${customer.postaKodu}
</body>
</html>
