package com.securitynull.sn_guard.functions.call;

import java.util.Date;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class Call {

    private String number;
    private Date date;
    private String duration;
    private Boolean inComing;

    public Call() {
        super();
    }

    public Call(String number, Date date, String duration, Boolean inComing) {
        super();

        this.number = number;
        this.date = date;
        this.duration = duration;
        this.inComing = inComing;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean getInComing() {
        return inComing;
    }

    public void setInComing(Boolean inComing) {
        this.inComing = inComing;
    }
}
