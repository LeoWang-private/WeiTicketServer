package com.leo.action;

import com.leo.entity.City;
import com.leo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/getCityList")
    @ResponseBody
    public ResponseEntity getCityList(){
        System.out.println("进入···");
        List<City> cityList = cityService.getCityList();
        return ResponseEntity.ok(cityList);
    }
}
