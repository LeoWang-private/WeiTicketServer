package com.leo.service.impl;

import com.leo.dao.CinemaDao;
import com.leo.entity.Cinema;
import com.leo.service.CinemaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Resource
    private CinemaDao cinemaDao;

    @Override
    public List<Cinema> getCinemaList(Integer cityId) {
        return cinemaDao.getCinemaList(cityId);
    }
}
