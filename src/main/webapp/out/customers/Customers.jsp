<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Customers.jsp</title>
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/out/customers/CreateCustomer.jsp">Create customer</a>

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
                <a href="${pageContext.servletContext.contextPath}/out/customers/UpdateCustomer.jsp">Update customer</a>
                <a href="${pageContext.servletContext.contextPath}/out/customers/DeleteCustomer.jsp">Delete customer</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>