package com.universal.dao;

import com.universal.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    void insertCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long id);

    List<Customer>getAllCustomers();

    Customer getCustomer(Long id);

    List<Customer> getCustomerAccountCard(Long id);

    Customer getCustomerJoinBankAcc(Long id);



}
