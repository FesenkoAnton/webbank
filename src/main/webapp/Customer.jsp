<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>

<table border="3">
    <tr>
        <td>Name</td>
        <td>Surname</td>
        <td>Phone</td>
    </tr>

        <tr valign="top">
            <td>${customer.name}</td>
            <td>${customer.surname}</td>
            <td>${customer.phone}</td>
        </tr>

</table>

</body>
</html>

