package com.leo.action;

import com.leo.entity.Cinema;
import com.leo.service.CinemaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/cinema")
public class CinemaController {
    @Resource
    private CinemaService cinemaService;

    @RequestMapping("/getCinemaList")
    @ResponseBody
    public ResponseEntity getCinemaList(Integer cityId){
        List<Cinema> cinemas = cinemaService.getCinemaList(cityId);
        return ResponseEntity.ok(cinemas);
    }
}
