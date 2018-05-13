package com.example.shenkar.androidstudiocourseapp;

public class MainActivityListItem {

    private String btnName;
    private int btnId;
    public MainActivityListItem(String btnName , int btnId) {
        this.btnName = btnName;
        this.btnId = btnId;
    }

    public String getBtnName() {
        return btnName;
    }

    public void setBtnName(String btnName) {
        this.btnName = btnName;
    }

    public int getBtnId() {
        return btnId;
    }

    public void setBtnId(int btnId) {
        this.btnId = btnId;
    }
}
