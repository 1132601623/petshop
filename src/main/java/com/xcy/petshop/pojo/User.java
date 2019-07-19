package com.xcy.petshop.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {
    private int id;

    private String email;

    private String password;

    private String code;

    private String name;

    private String address;

    private String desc;

    private int coupon;
}