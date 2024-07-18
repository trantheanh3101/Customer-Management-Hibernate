package com.codegym.customermanagementhibernate.service;

import com.codegym.customermanagementhibernate.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);
}
