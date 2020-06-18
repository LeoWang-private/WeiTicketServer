package com.leo.action;

import com.leo.entity.Movie;
import com.leo.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/movie")
public class MovieController {
    @Resource
    private MovieService movieService;

    @RequestMapping("/getNowPlaying")
    @ResponseBody
    public ResponseEntity getNowPlaying(Integer cityId){
        Set<Movie> movies = movieService.getNowPlaying(cityId);
        return ResponseEntity.ok(movies);
    }

    @RequestMapping("/getComingSoon")
    @ResponseBody
    public ResponseEntity getComingSoon(){
        List<Movie> movies = movieService.getComingSoon();
        return ResponseEntity.ok(movies);
    }

}
