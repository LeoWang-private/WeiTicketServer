package com.leo.entity;

import javax.swing.text.html.HTML;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Cinema implements Serializable {
    private static final long serialVersionUID = -1048875380771058671L;

    private Integer cinemaId;
    private String cinemaName;
    private String pic;
    private String address;
    private Float sellPrice;
    private Double distance;
    private List<CinemaTag> tags;
    private List promotions;
    private Integer cityId;
    private String Contact;
    private String phone;
    private Date createTime;
    private Date updateTime;

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<CinemaTag> getTags() {
        return tags;
    }

    public void setTags(List<CinemaTag> tags) {
        this.tags = tags;
    }

    public List getPromotions() {
        return promotions;
    }

    public void setPromotions(List promotions) {
        this.promotions = promotions;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
