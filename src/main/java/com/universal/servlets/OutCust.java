package com.universal.servlets;

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
import java.util.List;

public class OutCust extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CustomerDAO customerDAO = new CustomerStatementDAO();
        Customer customer = customerDAO.getCustomer((long)5);

        PrintWriter out = response.getWriter();
        out.print("<h1>"+customer.getName()+"</h1>");
        out.print("<h1>"+customer.getSurname()+"</h1>");
        out.print("<h1>"+customer.getPhone()+"</h1>");

        request.setAttribute("customer",customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Customer.jsp");
        dispatcher.forward(request,response);


//        PrintWriter out = response.getWriter();
//        out.println("<h1>"+message+"</h1>");



    }
}

