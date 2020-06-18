package com.leo.dao;

import com.leo.entity.City;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityDao {
    //获取所有城市信息
    public List<City> getCityList();

}
