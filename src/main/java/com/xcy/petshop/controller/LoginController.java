package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.User;
import com.xcy.petshop.service.UserService;
import com.xcy.petshop.utils.MailUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class LoginController {

  @Autowired UserService userService;

  @RequestMapping("/validateEmail")
  @ApiOperation("注册用户的时候，先去数据库查询邮箱是否存在，如果存在，则无法进行注册")
  public String validateEmail(String email, HttpServletResponse response) {
    response.setHeader("Access-Control-Allow-Origin", "*");

    boolean count = userService.selectByEmail(email);
    if (count) {
      return "0";
    } else {
      return "1";
    }
  }

  @RequestMapping("/registerEmail")
      @ApiOperation("用户注册")
      public String registerEmail(User user, HttpServletResponse response) {
          response.setHeader("Access-Control-Allow-Origin", "*");
          userService.registerEmail(user);
          return "1";

  }

  @RequestMapping("/login")
  @ApiOperation("用户登录")
  public String login(User user, HttpServletResponse response) {
    response.setHeader("Access-Control-Allow-Origin", "*");
    boolean result = userService.isLogin(user);
    if (result) {
      return "1";
    } else {
      return "0";
    }
  }

  @RequestMapping("/setCode")
  @ApiOperation("忘记密码，设置code")
   public String setCode(String email){
    String validateCode = MailUtils.getValidateCode(6);
    MailUtils.sendMail(email,"您好:<br/>您本次的验证码是"+validateCode+",请于两小时内输入，否则失效。","宠物商店重置密码验证码");

    User user = new User();
    user.setEmail(email);
    user.setCode(validateCode);
    userService.updateUserValidateCodeByEmail(user);

    return "1";
  }

  @RequestMapping("/changePassword")
  @ApiOperation("/通过判断传入的email和code来修改密码")
  public String changePassword(String email, String code,String password){

    User user = new User();
    user.setEmail(email);
    user.setCode(code);
    user.setPassword(password);

    boolean count = userService.validateEmailCode(user);

    if(count){
      userService.resetPassword(user);
      return "1";
    }else{
      return "0";
    }
  }


}
