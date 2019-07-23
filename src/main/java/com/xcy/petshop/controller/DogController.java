package com.xcy.petshop.controller;

import com.xcy.petshop.pojo.Pet;
import com.xcy.petshop.service.DogService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/dog")
public class DogController {
  @Autowired DogService dogService;

  @RequestMapping("/list")
  @ResponseBody
  @ApiOperation("拿到所有的狗狗,如果传递参数，那么就是模糊查询")
  public List<Pet> showDogList(String name, HttpServletResponse response) {
    response.setHeader("Access-Control-Allow-Origin", "*");
    List<Pet> dogList = dogService.selectAllDogs(name);
    return dogList;
  }

  @RequestMapping("/getDogById")
  @ResponseBody
  @ApiOperation("根据一个id，拿到一个狗狗的详情")
  @CrossOrigin
  public Pet showDog(int id) {
    Pet dog = dogService.getDogById(id);
    return dog;
  }

  @RequestMapping("/getPetById")
  @ResponseBody
  @ApiOperation("根据特定Id,拿到特定宠物")
  @CrossOrigin
  public Pet getPetById(int id){
    Pet pet = dogService.getPetById(id);
    return pet;
  }
}
