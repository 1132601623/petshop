package com.xcy.petshop.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pet {
  private int id;

  private String price;

  private String sex;

  private String image;

  private String age;

  private String desc;

  private String source;

  private String name;

  private int pId;

  private int kId;

  private int cId;
}
