package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.Customer;
import com.xcy.petshop.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
  @Autowired CustomerService customerService;

  @RequestMapping("/desc")
  @ApiOperation("用来展示所有的评论")
  public List<Customer> showDesc() {
    List<Customer> allDesc = customerService.selectAllDesc();
    System.out.println(allDesc);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    return allDesc;
  }

  @RequestMapping("/dogDesc")
  @ApiOperation("用来展示狗狗的评论")
  public List<Customer> showDogDesc() {
    List<Customer> dogDesc = customerService.selectAllDogDesc();
    System.out.println(dogDesc);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    return dogDesc;
  }

  @RequestMapping("/catDesc")
  @ApiOperation("用来展示猫咪的评论")
  public List<Customer> showCatDesc() {
    List<Customer> catDesc = customerService.selectAllCatDesc();
    System.out.println(catDesc);
    return catDesc;
  }

  @RequestMapping("/showCustomerMessage")
  @ApiOperation("用来展示买家的信息")
  public Customer showCustomerMessage() {
    Customer customer = customerService.selectCustomerMessage();
    System.out.println(customer);
    return customer;
  }
}
