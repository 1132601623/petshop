package com.xcy.petshop.controller;


import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.SelectPetService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/pet")
public class selectPetController {
    @Autowired
    SelectPetService selectPetService;

    @RequestMapping("/getCatById")
    @ApiOperation("传递一个id=1，获取所有猫咪")
    public List<Pet> getCatById(int id){
        List<Pet> cats = selectPetService.selectAllCatById(id);
        return cats;
    }
    @RequestMapping("/getDogById")
    @ApiOperation("传递一个id=2，获取所有狗狗")
    public List<Pet> getDogById(int id){
        List<Pet> dogs = selectPetService.selectAllDogById(id);
        return dogs;
    }
}
