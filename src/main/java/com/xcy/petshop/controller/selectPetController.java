package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.Cat;
import com.xcy.petshop.pojo.Dog;
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
    public List<Cat> getCatById(int id){
        List<Cat> cats = selectPetService.selectAllCatById(id);
        return cats;
    }
    @RequestMapping("/getDogById")
    @ApiOperation("传递一个id=2，获取所有狗狗")
    public List<Dog> getDogById(int id){
        List<Dog> dogs = selectPetService.selectAllDogById(id);
        return dogs;
    }
}
