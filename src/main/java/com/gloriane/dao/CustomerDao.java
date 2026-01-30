package com.gloriane.dao;

import com.gloriane.model.Customer;
import com.gloriane.model.CustomerType;

import java.util.List;

public interface CustomerDao {
    Customer save(Customer customer);
    Customer update(Customer customer);
    boolean delete(int id);
    Customer findById(int id);
    List<Customer> findAll();
    List<Customer> findByType(CustomerType type);
    List<Customer> searchByName(String pattern);
    boolean existsByEmail(String email);
}
