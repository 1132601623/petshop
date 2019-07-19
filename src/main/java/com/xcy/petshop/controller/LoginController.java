package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.User;
import com.xcy.petshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class LoginController {

  @Autowired UserService userService;

  @RequestMapping("/validateEmail")
  public String validateEmail(String email, HttpServletResponse response) {
    response.setHeader("Access-Control-Allow-Origin", "*");

    boolean count = userService.selectByEmail(email);
    if (count) {
      return "1";
    } else {
      return "0";
    }
  }

  @RequestMapping("/registerEmail")
  public String registerEmail(User user, HttpServletResponse response) {
    response.setHeader("Access-Control-Allow-Origin", "*");
    userService.registerEmail(user);
    return "1";
  }

  @RequestMapping("/login")
  public String login(User user, HttpServletResponse response) {
    response.setHeader("Access-Control-Allow-Origin", "*");
    boolean result = userService.isLogin(user);
    if (result) {
      return "1";
    } else {
      return "0";
    }
  }
}
