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
  @Autowired SelectPetService selectPetService;

  @RequestMapping("/getAllPetById")
  @ApiOperation("传递一个id，获取猫咪和狗狗")
  public List<Pet> selectAllPetById(int id) {
    List<Pet> petList = selectPetService.selectAllPetById(id);
    return petList;
  }
}
