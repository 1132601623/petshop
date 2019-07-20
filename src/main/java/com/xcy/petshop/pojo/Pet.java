package com.xcy.petshop.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pet {
  private int id;

  @ApiModelProperty("价格")
  private double price;

  @ApiModelProperty("性别")
  private String sex;

  @ApiModelProperty("图片")
  private String image;

  @ApiModelProperty("年龄")
  private String age;

  @ApiModelProperty("描述")
  private String desc;

  @ApiModelProperty("地址")
  private String address;

  @ApiModelProperty("来源:个人还是商家")
  private String source;

  @ApiModelProperty("姓名")
  private String name;

  @ApiModelProperty("种类:猫咪和狗狗")
  private String pName;

  @ApiModelProperty("种类")
  private String kName;
}
