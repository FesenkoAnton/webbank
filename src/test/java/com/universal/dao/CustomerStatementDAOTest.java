package com.universal.dao;

import com.universal.entity.Customer;
import org.junit.Test;

import java.util.List;

public class CustomerStatementDAOTest {

    @Test
    public void testCustomerStatementDAO(){

        Customer customer = new Customer();
        customer.setName("Gorge");
        customer.setSurname("Michel");
        customer.setPhone("380505557788");

        CustomerDAO customerDAO = new CustomerStatementDAO();
//        customerDAO.insertCustomer(customer);
//
//        customerDAO.updateCustomer("ALL", "DL", "380508795458",(long)4);
//
        customerDAO.deleteCustomer((long)41);
//
//        List<Customer>customers = customerDAO.getAllCustomers();
//
//        for (Customer customer:customers) {
//            System.out.println(customer.getId()+" "+customer.getName()+" "
//                    +customer.getSurname()+" "+customer.getPhone());
//        }

//        Customer customer = customerDAO.getCustomer((long)4);
//        System.out.println(customer.getId()+" "+customer.getName()+" "
//                +customer.getSurname()+" "+customer.getPhone());

//        List<Customer> customers = customerDAO.getCustomerAccountCard((long)12);
//        for(Customer customer:customers) {
//            System.out.println(customer.getId() + " " + customer.getName() + " " + customer.getSurname() + " " + customer.getPhone() + " " +
//                    customer.getBankAccount().getIdBank() + " " + customer.getBankAccount().getAccount() + " " + customer.getBankAccount().getDeposit() + " " +
//                    customer.getBankAccount().getCredit() + " " + customer.getBankAccount().getState() + " " +
//                    customer.getBankAccount().getBankAccountsCustomers() + " " + customer.getCard().getIdCard() + " " + customer.getCard().getNumber() + " " +
//                    customer.getCard().getCardsBankAccounts());
//        }
    }

}
