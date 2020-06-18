package com.leo.dao;

import com.leo.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface MovieDao {

    //根据城市Id获取正在上映影片
    public Set<Movie> getNowPlaying(Integer cityId);

    //获取即将上映影片
    public List<Movie> getComingSoon();

}
