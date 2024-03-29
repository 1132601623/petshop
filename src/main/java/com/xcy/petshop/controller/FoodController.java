package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.Food;
import com.xcy.petshop.service.FoodService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/food")
public class FoodController {
  @Autowired FoodService foodService;

  @RequestMapping("/catFood")
  @ApiOperation("用来展示猫猫的零食")
  public List<Food> catFood(String brand) {
    List<Food> catFoodList = foodService.selectAllCatFood(brand);
    return catFoodList;
  }

  @RequestMapping("/dogFood")
  @ApiOperation("用来展示狗狗的零食")
  public List<Food> dogFood(String brand) {
    List<Food> dogFoodList = foodService.selectAllDogFood(brand);
    return dogFoodList;
  }

  @RequestMapping("/dogFoodBrand")
  @ApiOperation("用来展示狗狗零食的品牌")
  public List<Food> dogFoodBrand() {
    List<Food> dogFoodBrandList = foodService.selectAllDogFoodBrand();
    return dogFoodBrandList;
  }

  @RequestMapping("/catFoodBrand")
  @ApiOperation("用来展示猫猫零食的品牌")
  public List<Food> catFoodBrand() {
    List<Food> catFoodBrandList = foodService.selectAllCatFoodBrand();
    return catFoodBrandList;
  }
}
