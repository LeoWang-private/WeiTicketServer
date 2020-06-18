package com.leo.entity;

import java.io.Serializable;

public class CinemaTag implements Serializable {
    private static final long serialVersionUID = 5808677924681137840L;

    //private Integer tagId;
    private Integer allowRefund;
    private Integer endorse;
    private Integer discount;
    private Integer snack;


    /*public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }*/

    public Integer getAllowRefund() {
        return allowRefund;
    }

    public void setAllowRefund(Integer allowRefund) {
        this.allowRefund = allowRefund;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getSnack() {
        return snack;
    }

    public void setSnack(Integer snack) {
        this.snack = snack;
    }

    public Integer getEndorse() {
        return endorse;
    }

    public void setEndorse(Integer endorse) {
        this.endorse = endorse;
    }
}
