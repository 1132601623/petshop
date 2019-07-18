package com.xcy.petshop.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dog {
  private int id;

  private String price;

  private String kind;

  private String sex;

  private String image;

  private String age;

  private String desc;

  private String source;

  @Getter private String name;
}
