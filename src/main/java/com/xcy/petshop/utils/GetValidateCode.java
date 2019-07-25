package com.xcy.petshop.utils;

import java.util.Random;

/** 获取6位数验证码 */
public final class GetValidateCode {

  public static String getValidateCode(int num) {

    Random random = new Random();
    String validateCode = "";
    for (int i = 0; i < num; i++) {

      int result = random.nextInt(10);
      validateCode += result;
    }
    return validateCode;
  }
}
