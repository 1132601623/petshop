package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.SelectPetMapper;
import com.xcy.petshop.pojo.Cat;
import com.xcy.petshop.pojo.Dog;
import com.xcy.petshop.service.SelectPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectPetServiceImpl implements SelectPetService {
    @Autowired
    SelectPetMapper selectPetMapper;
    @Override
    public List<Cat> selectAllCatById(int id) {
        List<Cat> cats = selectPetMapper.selectAllCatById(id);
        return cats;
    }

    @Override
    public List<Dog> selectAllDogById(int id) {
        List<Dog> dogs = selectPetMapper.selectAllDogById(id);
        return dogs;
    }
}
