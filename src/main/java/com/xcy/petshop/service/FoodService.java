package com.xcy.petshop.service;

import com.xcy.petshop.pojo.Food;

import java.util.List;

public interface FoodService {
  List<Food> selectAllCatFood(String brand);

  List<Food> selectAllDogFood(String brand);
}
