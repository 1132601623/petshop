package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.CustomerMapper;
import com.xcy.petshop.pojo.Customer;
import com.xcy.petshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
  @Autowired CustomerMapper customerMapper;

  @Override
  public List<Customer> selectAllDogDesc() {
    return customerMapper.selectAllDogDesc();
  }

  @Override
  public List<Customer> selectAllCatDesc() {
    return customerMapper.selectAllCatDesc();
  }

  @Override
  public List<Customer> selectAllDesc() {
    return customerMapper.selectAllDesc();
  }

  @Override
  public Customer selectCustomerMessage() {
    Customer customer = customerMapper.selectCustomerMessage();
    return customer;
  }
}
