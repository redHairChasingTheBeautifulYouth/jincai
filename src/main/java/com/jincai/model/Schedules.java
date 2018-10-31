package com.jincai.model;
/*
 *一句话描述该类作用:【】
 *@Author:LB
 *
 */

import java.util.List;

public class Schedules {
    private String date;

    private List<List<Game>> list;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<List<Game>> getList() {
        return list;
    }

    public void setList(List<List<Game>> list) {
        this.list = list;
    }
}
