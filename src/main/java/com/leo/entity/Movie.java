package com.leo.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

public class Movie implements Serializable {
    private static final long serialVersionUID = -6407199064658688060L;

    private String picDomain = "http://localhost:8081/WeiTicketServer/w.h/";

    private Integer movieId;
    private String movieName;
    private String englishName;
    private String director;
    private String scriptWriter;
    private String mainActor;
    private String releaseDate;
    private Integer status;
    private String type;
    private String img;
    private String pics;
    private String briefIntro;
    private String version;
    private Integer globalReleased;
    private Float score;
    private Integer wish;
    private String showInfo;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScriptWriter() {
        return scriptWriter;
    }

    public void setScriptWriter(String scriptWriter) {
        this.scriptWriter = scriptWriter;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        this.releaseDate = sdf.format(releaseDate);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = this.picDomain + img;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getBriefIntro() {
        return briefIntro;
    }

    public void setBriefIntro(String briefIntro) {
        this.briefIntro = briefIntro;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getGlobalReleased() {
        return globalReleased;
    }

    public void setGlobalReleased(Integer globalReleased) {
        this.globalReleased = globalReleased;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getWish() {
        return wish;
    }

    public void setWish(Integer wish) {
        this.wish = wish;
    }

    public String getShowInfo() {
        return showInfo;
    }

    public void setShowInfo(String showInfo) {
        this.showInfo = showInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(movieId, movie.movieId) &&
                Objects.equals(movieName, movie.movieName) &&
                Objects.equals(englishName, movie.englishName) &&
                Objects.equals(director, movie.director) &&
                Objects.equals(scriptWriter, movie.scriptWriter) &&
                Objects.equals(mainActor, movie.mainActor) &&
                Objects.equals(releaseDate, movie.releaseDate) &&
                Objects.equals(status, movie.status) &&
                Objects.equals(type, movie.type) &&
                Objects.equals(img, movie.img) &&
                Objects.equals(pics, movie.pics) &&
                Objects.equals(briefIntro, movie.briefIntro) &&
                Objects.equals(version, movie.version) &&
                Objects.equals(globalReleased, movie.globalReleased) &&
                Objects.equals(score, movie.score) &&
                Objects.equals(wish, movie.wish) &&
                Objects.equals(showInfo, movie.showInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, movieName, englishName, director, scriptWriter, mainActor, releaseDate, status, type, img, pics, briefIntro, version, globalReleased, score, wish, showInfo);
    }
}
