package com.universal.servlets.customers;

import com.universal.dao.CustomerDAO;
import com.universal.dao.CustomerStatementDAO;
import com.universal.entity.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCustomer extends HttpServlet {
    CustomerDAO customerDAO = new CustomerStatementDAO();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        customerDAO.deleteCustomer(Long.valueOf(request.getParameter("id")));

        response.sendRedirect(String.format("%s%s", request.getContextPath(), "/output"));
    }
}
