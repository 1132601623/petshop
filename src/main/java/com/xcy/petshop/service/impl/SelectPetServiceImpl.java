package com.xcy.petshop.service.impl;

import com.xcy.petshop.mapper.SelectPetMapper;

import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.SelectPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectPetServiceImpl implements SelectPetService {
    @Autowired
    SelectPetMapper selectPetMapper;
    @Override
    public List<Pet> selectAllCatById(int id) {
        List<Pet> cats = selectPetMapper.selectAllCatById(id);
        return cats;
    }

    @Override
    public List<Pet> selectAllDogById(int id) {
        List<Pet> dogs = selectPetMapper.selectAllDogById(id);
        return dogs;
    }
}
