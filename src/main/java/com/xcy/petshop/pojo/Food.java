package com.xcy.petshop.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Food {
    private int id;

    private String name;

    private String foodImage;

    private String brand;

    private int pId;

    private String nation;

}