package com.leo.entity;

import java.io.Serializable;

public class MovieHall implements Serializable {
    private static final long serialVersionUID = -2098228746753135686L;

    private Integer hallId;
    private Integer cinemaId;
    private String hallName;
    private Integer seatNum;
    private Integer row;
    private Integer col;
    private String remark;
    private Integer hallTypeId;
    private String hallTypename;
    private Integer state;

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getHallTypeId() {
        return hallTypeId;
    }

    public void setHallTypeId(Integer hallTypeId) {
        this.hallTypeId = hallTypeId;
    }

    public String getHallTypename() {
        return hallTypename;
    }

    public void setHallTypename(String hallTypename) {
        this.hallTypename = hallTypename;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
