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

public class UpdateCustomer extends HttpServlet {

    CustomerDAO customerDAO = new CustomerStatementDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Customer customer = customerDAO.getCustomer(Long.valueOf(request.getParameter("id")));
        System.out.println(customer.getId());
        System.out.println(customer.getName());
        request.setAttribute("customer", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/out/customers/UpdateCustomer.jsp");
        dispatcher.forward(request, response);
    }
}
