package com.leo.service.impl;

import com.leo.dao.MovieDao;
import com.leo.entity.Movie;
import com.leo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;

    @Override
    public Set<Movie> getNowPlaying(Integer cityId) {
        return movieDao.getNowPlaying(cityId);
    }

    @Override
    public List<Movie> getComingSoon() {
        return movieDao.getComingSoon();
    }
}
