package com.gloriane.dao;

import com.gloriane.model.Customer;
import com.gloriane.model.CustomerType;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao{
    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public List<Customer> findByType(CustomerType type) {
        return List.of();
    }

    @Override
    public List<Customer> searchByName(String pattern) {
        return List.of();
    }

    @Override
    public boolean existsByEmail(String email) {
        return false;
    }
}
