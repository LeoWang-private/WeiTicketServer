package com.leo.service;

import com.leo.entity.Movie;

import java.util.List;
import java.util.Set;

public interface MovieService {
    //根据城市Id查询正在热映影片
    public Set<Movie> getNowPlaying(Integer cityId);

    //查询即将上映影片
    public List<Movie> getComingSoon();
}
