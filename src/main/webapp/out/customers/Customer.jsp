<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Customer</title>
</head>
<body>

<form action="${pageContext.servletContext.contextPath}/out/customers/create" method="POST">
    <tr><td>Name:</td>
    <td><input type="text" name="name"></td>
    </tr>

    <tr><td>Surname:</td>
        <td><input type="text" name="surname"></td>
    </tr>

    <tr><td>Phone:</td>
        <td><input type="text" name="phone"></td>
    </tr>

    <tr>
        <td><input type="submit" name="Submit"/></td>
    </tr>
</form>

<table border="3">
    <tr>
        <td>Name</td>
        <td>Surname</td>
        <td>Phone</td>
    </tr>
    <c:forEach items="${customers}" var="customer" varStatus="status">
        <tr valign="top">
                <%--<td>${customer.getName()}</td>--%>
            <td>${customer.name}</td>
            <td>${customer.surname}</td>
            <td>${customer.phone}</td>
            <td>
                <a href="${pageContext.servletContext.contextPath}/customer/update?id=${customer.id}">Update customer</a>
                <a href="${pageContext.servletContext.contextPath}/customer/delete?id=${customer.id}">Delete customer</a>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>