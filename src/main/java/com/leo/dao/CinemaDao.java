package com.leo.dao;

import com.leo.entity.Cinema;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaDao {
    //根据城市Id查询影院
    public List<Cinema> getCinemaList(Integer cityId);

}
