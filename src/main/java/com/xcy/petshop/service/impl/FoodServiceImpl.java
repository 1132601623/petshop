package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.FoodMapper;
import com.xcy.petshop.pojo.Food;
import com.xcy.petshop.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodMapper foodMapper;

    @Override
    public List<Food> selectAllCatFood(int id) {
        List<Food> catFoodList = foodMapper.selectAllCatFood(id);
        return catFoodList;
    }

    @Override
    public List<Food> selectAllDogFood(int id) {
        List<Food> dogFoodList = foodMapper.selectAllDogFood(id);
        return dogFoodList;
    }
}
