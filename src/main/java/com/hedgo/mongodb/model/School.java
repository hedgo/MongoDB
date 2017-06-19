package com.hedgo.mongodb.model;

public class School {

    private String schoolName;
    private String title;
    private Integer years ;

    public School(String schoolName, String title, Integer years) {
        this.schoolName = schoolName;
        this.title = title;
        this.years = years;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }
}
