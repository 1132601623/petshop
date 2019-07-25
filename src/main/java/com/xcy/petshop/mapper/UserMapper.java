package com.xcy.petshop.mapper;

import com.xcy.petshop.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

  int selectByEmail(String email);

  void registerEmail(User user);

  int isLogin(User user);

  void updateUserValidateCodeByEmail(User user);

  void resetPassword(User user);

  int validateCode(User user);
}
