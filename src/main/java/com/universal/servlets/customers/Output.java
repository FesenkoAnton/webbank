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
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

public class Output extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CustomerDAO customerDAO = new CustomerStatementDAO();
        List<Customer> customers = customerDAO.getAllCustomers();

        request.setAttribute("customers",customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/out/customers/Customer.jsp");
        dispatcher.forward(request,response);
    }
}
