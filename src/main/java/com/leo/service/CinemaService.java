package com.leo.service;

import com.leo.entity.Cinema;

import java.util.List;

public interface CinemaService {
    //根据城市Id查询影院
    public List<Cinema> getCinemaList(Integer cityId);
}
