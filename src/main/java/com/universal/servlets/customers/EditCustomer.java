package com.universal.servlets.customers;

import com.universal.dao.CustomerDAO;
import com.universal.dao.CustomerStatementDAO;
import com.universal.entity.Customer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditCustomer extends HttpServlet {
    CustomerDAO customerDAO = new CustomerStatementDAO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer customer = new Customer();
        customer.setName(request.getParameter("name"));
        customer.setSurname(request.getParameter("surname"));
        customer.setPhone(request.getParameter("phone"));
        customer.setId(Long.valueOf(request.getParameter("id")));

        customerDAO.updateCustomer(customer);
        response.sendRedirect(String.format("%s%s", request.getContextPath(), "/output"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
