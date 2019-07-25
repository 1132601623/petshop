package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.User;
import com.xcy.petshop.service.UserService;
import com.xcy.petshop.utils.GetValidateCode;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class LoginController {

  @Autowired UserService userService;
  @Autowired JavaMailSender javaMailSender;

  @Value("${spring.mail.username}")
  private String from;

  @RequestMapping("/validateEmail")
  @ApiOperation("用户注册的时候，先去数据库查询邮箱是否存在，如果存在，则无法进行注册")
  public String validateEmail(String email) {

    boolean count = userService.selectByEmail(email);
    if (count) {
      return "0";
    } else {
      return "1";
    }
  }

  @RequestMapping("/registerEmail")
  @ApiOperation("用户注册")
  public String registerEmail(User user) {
    userService.registerEmail(user);
    return "1";
  }

  @RequestMapping("/login")
  @ApiOperation("用户登录")
  public String login(User user) {
    boolean result = userService.isLogin(user);
    if (result) {
      return "1";
    } else {
      return "0";
    }
  }

  @RequestMapping("/setCode")
  @ApiOperation("忘记密码，设置code")
  public String setCode(String email) throws MessagingException {
    String validateCode = GetValidateCode.getValidateCode(6);

    /*SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setTo(email);
    String title = "宠物商店重置密码验证码";
    String detail = "您本次的验证码是" + validateCode + "，请于两小时内输入，否则失效。";

    simpleMailMessage.setSubject(title);
    simpleMailMessage.setText(detail);
    simpleMailMessage.setFrom(from);
    javaMailSender.send(simpleMailMessage);*/

    String title = "宠物商店重置密码验证码";
    String detail =
        "您好：<br/>您本次的验证码是"
            + "<span style='font-size:28px'>"
            + validateCode
            + "</span>"
            + "，请于两小时内输入，否则失效。";
    MimeMessage mimeMessage = javaMailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

    helper.setFrom(from);
    helper.setTo(email);
    helper.setSubject(title);
    helper.setText(detail, true);
    javaMailSender.send(mimeMessage);

    User user = new User();
    user.setEmail(email);
    user.setCode(validateCode);
    userService.updateUserValidateCodeByEmail(user);

    return "1";
  }

  @RequestMapping("/changePassword")
  @ApiOperation("/通过判断传入的email和code来修改密码")
  public String changePassword(String email, String password, String code) {
    User user = new User();
    user.setEmail(email);
    user.setPassword(password);
    user.setCode(code);
    boolean result = userService.validateCode(user);
    System.out.println(result);
    if (result) {
      userService.resetPassword(user);
      return "1";
    } else {
      return "0";
    }
  }
}
