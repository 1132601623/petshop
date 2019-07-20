package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.PetService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/near")
public class PetController {
  @Autowired PetService petService;

  @RequestMapping("/list")
  @ApiOperation("根据地区、价格、来源来展示宠物")
  public List<Pet> showNearPets(Pet pet) {
    List<Pet> petList = petService.selectAllNearPets(pet);
    System.out.println(petList);
    return petList;
  }
}
