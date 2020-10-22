package com.leo.action;

import com.leo.entity.Cinema;
import com.leo.entity.dto.MovieHallDto;
import com.leo.service.CinemaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/getCinemaDetail")
    @ResponseBody
    public ResponseEntity getCinemaDetail(Integer cinemaId) throws ParseException {
        Map<String, Object> map = cinemaService.getCinemaDetail(cinemaId);
        return ResponseEntity.ok(map);
    }

    @RequestMapping("/getSeatInfo")
    @ResponseBody
    public ResponseEntity getSeatInfo(Integer hallId,Integer planId){
        System.out.println("hallId---" + hallId + "---planId----" + planId);
        MovieHallDto movieHallDto = cinemaService.getSeatInfo(hallId,planId);
        return ResponseEntity.ok(movieHallDto);
    }
}
