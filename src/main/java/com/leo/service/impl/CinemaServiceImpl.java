package com.leo.service.impl;

import com.leo.dao.CinemaDao;
import com.leo.entity.Cinema;
import com.leo.entity.Movie;
import com.leo.entity.Plan;
import com.leo.entity.dto.MovieHallDto;
import com.leo.entity.dto.PlanDto;
import com.leo.service.CinemaService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Resource
    private CinemaDao cinemaDao;

    @Override
    public List<Cinema> getCinemaList(Integer cityId) {
        return cinemaDao.getCinemaList(cityId);
    }

    @Override
    public Map<String, Object> getCinemaDetail(Integer cinemaId) throws ParseException {
        Map<String,Object> map = new HashMap<>();
        //查询影院详情
        Cinema cinema = cinemaDao.getCinemaDetail(cinemaId);
        map.put("cinema",cinema);
        //查询影院影片信息
        List<Movie> movies = cinemaDao.getMoviesByCinemaId(cinemaId);
        map.put("movies",movies);
        //查询排片详情
        List<PlanDto> plans = cinemaDao.getPlansByCinemaId(cinemaId);
        //过滤出已经过期的计划
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        Date date1 = df.parse(date);
        Iterator<PlanDto> iterator = plans.iterator();
        while (iterator.hasNext()){
            PlanDto plan = iterator.next();
            String playTime = plan.getPlayDate() + " " + plan.getStartTime();
            System.out.println("放映时间----" + playTime);
            Date date2 = df.parse(playTime);
            if (date1.after(date2)){
                iterator.remove();
            }
        }

        map.put("plans",plans);
        return map;
    }

    @Override
    public MovieHallDto getSeatInfo(Integer hallId, Integer planId) {
        //查询影厅座位情况
        MovieHallDto movieHallDto = cinemaDao.getSeatInfo(hallId);
        //查询影厅已选座位信息
        movieHallDto.setOrderSeatInfo(cinemaDao.getSelectedSeat(planId));
        return movieHallDto;
    }
}
