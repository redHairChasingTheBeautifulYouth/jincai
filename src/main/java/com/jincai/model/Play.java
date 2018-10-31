package com.jincai.model;
/*
 *一句话描述该类作用:【】
 *@Author:LB
 *
 */

public class Play {

    /**
     * 主方名字
     */
    private String an;

    /**
     * 客方名字
     */
    private String hn;

    /**
     * 日期加上编号20181028039，取后三位
     */
    private String id;

    /**
     * 比赛开始时间
     */
    private String saleCloseTime;

    private String[] spTypeGg;

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public String getHn() {
        return hn;
    }

    public void setHn(String hn) {
        this.hn = hn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaleCloseTime() {
        return saleCloseTime;
    }

    public void setSaleCloseTime(String saleCloseTime) {
        this.saleCloseTime = saleCloseTime;
    }

    public String[] getSpTypeGg() {
        return spTypeGg;
    }

    public void setSpTypeGg(String[] spTypeGg) {
        this.spTypeGg = spTypeGg;
    }
}
