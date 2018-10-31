package com.jincai.model;
/*
 *一句话描述该类作用:【】
 *@Author:LB
 *
 */

public class ExcelModel implements Cloneable{

    private String name;

    private String win;

    private String lose;

    private String letWin;

    private String letLose;

    private String gameStart;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getLose() {
        return lose;
    }

    public void setLose(String lose) {
        this.lose = lose;
    }

    public String getLetWin() {
        return letWin;
    }

    public void setLetWin(String letWin) {
        this.letWin = letWin;
    }

    public String getLetLose() {
        return letLose;
    }

    public void setLetLose(String letLose) {
        this.letLose = letLose;
    }

    public String getGameStart() {
        return gameStart;
    }

    public void setGameStart(String gameStart) {
        this.gameStart = gameStart;
    }
}
