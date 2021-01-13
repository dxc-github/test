package com.example.jwttest.entity;

public class Label {
    private Integer id;
    private String labelName;

    public Label() {
    }

    public Label(Integer id, String labelName) {
        this.id = id;
        this.labelName = labelName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
