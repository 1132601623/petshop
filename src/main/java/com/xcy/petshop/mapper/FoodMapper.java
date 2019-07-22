package com.xcy.petshop.mapper;

import com.xcy.petshop.pojo.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {

  List<Food> selectAllCatFood(String brand);

  List<Food> selectAllDogFood(String brand);
}
