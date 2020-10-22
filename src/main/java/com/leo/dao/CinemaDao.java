package com.leo.dao;

import com.leo.entity.Cinema;
import com.leo.entity.Movie;
import com.leo.entity.dto.MovieHallDto;
import com.leo.entity.dto.PlanDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaDao {
    //根据城市Id查询影院
    public List<Cinema> getCinemaList(Integer cityId);
    //根据影院Id查询影院详细信息
    public Cinema getCinemaDetail(Integer cinemaId);
    //根据影院Id查询该影院正在上映和即将上映的影片信息
    public List<Movie> getMoviesByCinemaId(Integer cinemaId);
    //根据影院Id查询该影院的排片计划
    public List<PlanDto> getPlansByCinemaId(Integer cinemaId);
    //根据影厅Id查询该影厅的座位信息
    public MovieHallDto getSeatInfo(Integer hallId);
    //根据planId查询影厅已选座位
    public List<String> getSelectedSeat(Integer planId);

}
