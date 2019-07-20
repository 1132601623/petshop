package com.xcy.petshop.mapper;


import com.xcy.petshop.pojo.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FoodMapper {


    List<Food> selectAllCatFood();

    List<Food> selectAllDogFood();
}