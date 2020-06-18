package com.leo.service.impl;

import com.leo.dao.CityDao;
import com.leo.entity.City;
import com.leo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> getCityList() {
        return cityDao.getCityList();
    }
}
