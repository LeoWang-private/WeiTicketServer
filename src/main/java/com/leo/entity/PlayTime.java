package com.leo.entity;

import java.io.Serializable;

public class PlayTime implements Serializable {
    private static final long serialVersionUID = -7706250825742347166L;

    private Integer playTimeId;
    private String playTimeName;
    private String startTime;
    private String endTime;

    public Integer getPlayTimeId() {
        return playTimeId;
    }

    public void setPlayTimeId(Integer playTimeId) {
        this.playTimeId = playTimeId;
    }

    public String getPlayTimeName() {
        return playTimeName;
    }

    public void setPlayTimeName(String playTimeName) {
        this.playTimeName = playTimeName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
