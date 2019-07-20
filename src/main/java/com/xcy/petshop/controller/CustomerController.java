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
    return allDesc;
  }

  @RequestMapping("/dogDesc")
  @ApiOperation("用来展示狗狗的评论")
  public List<Customer> showDogDesc() {
    List<Customer> dogDesc = customerService.selectAllDogDesc();
    return dogDesc;
  }

  @RequestMapping("/catDesc")
  @ApiOperation("用来展示猫咪的评论")
  public List<Customer> showCatDesc() {
    List<Customer> catDesc = customerService.selectAllCatDesc();
    return catDesc;
  }
}
