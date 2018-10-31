package com.jincai.model;
/*
 *一句话描述该类作用:【】
 *@Author:LB
 *
 */

import java.util.List;


public class Data {
    private List<Schedules> schedules;

    private String aheadtime;

    public List<Schedules> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedules> schedules) {
        this.schedules = schedules;
    }

    public String getAheadtime() {
        return aheadtime;
    }

    public void setAheadtime(String aheadtime) {
        this.aheadtime = aheadtime;
    }
}
