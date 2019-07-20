package com.xcy.petshop.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
  private int id;

  private String name;

  private String address;

  private String petImages;

  private String remark;

  private String customerImage;

  private String pName;

  private String kName;
}
