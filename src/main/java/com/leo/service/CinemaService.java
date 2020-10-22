package com.leo.service;

import com.leo.entity.Cinema;
import com.leo.entity.dto.MovieHallDto;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface CinemaService {
    //根据城市Id查询影院
    public List<Cinema> getCinemaList(Integer cityId);
    //根据影院Id查询影院详情包括排片计划
    public Map<String,Object> getCinemaDetail(Integer cinemaId) throws ParseException;
    //根据影厅Id和排片计划Id查询影厅座位信息
    public MovieHallDto getSeatInfo(Integer hallId,Integer planId);
}
