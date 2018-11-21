<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Update</title>
</head>
<body>

<form action="${pageContext.servletContext.contextPath}/customer/edit" method="POST">
    <input type="hidden" name="id" value="${customer.id}">
    <tr><td>Name:</td>
        <td>
            <input type="text" name="name" value="${customer.name}">
        </td>
    </tr>

    <tr><td>Surname:</td>
        <td>
            <input type="text" name="surname" value="${customer.surname}">
        </td>
    </tr>

    <tr><td>Phone:</td>
        <td>
            <input type="text" name="phone" value="${customer.phone}">
        </td>
    </tr>

    <tr>
        <td><input type="submit" name="Submit"/></td>
    </tr>
</form>
</body>
</html>
