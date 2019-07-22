package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.FoodMapper;
import com.xcy.petshop.pojo.Food;
import com.xcy.petshop.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
  @Autowired FoodMapper foodMapper;

  @Override
  public List<Food> selectAllCatFood(String brand) {
    List<Food> catFoodList = foodMapper.selectAllCatFood(brand);
    return catFoodList;
  }

  @Override
  public List<Food> selectAllDogFood(String brand) {
    List<Food> dogFoodList = foodMapper.selectAllDogFood(brand);
    return dogFoodList;
  }

  @Override
  public List<Food> selectAllDogFoodBrand() {
    List<Food> dogFoodBrandList = foodMapper.selectAllDogFoodBrandList();
    return dogFoodBrandList;
  }

  @Override
  public List<Food> selectAllCatFoodBrand() {
    List<Food> catFoodBrandList = foodMapper.selectAllCatFoodBrandList();
    return catFoodBrandList;
  }
}
