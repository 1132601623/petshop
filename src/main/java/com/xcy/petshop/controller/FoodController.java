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
  public List<Food> catFood() {
    List<Food> catFoodList = foodService.selectAllCatFood();
    return catFoodList;
  }

  @RequestMapping("/dogFood")
  @ApiOperation("用来展示狗狗的零食")
  public List<Food> dogFood() {
    List<Food> dogFoodList = foodService.selectAllDogFood();
    return dogFoodList;
  }
}
