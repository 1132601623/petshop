package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Customer;

import java.util.List;

public interface CustomerService {

  List<Customer> selectAllDogDesc();

  List<Customer> selectAllCatDesc();

  List<Customer> selectAllDesc();

  Customer selectCustomerMessage();
}
