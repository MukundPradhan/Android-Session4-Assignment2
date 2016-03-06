package com.assignment.acadgild.android_session4_assignment2.model;

/**
 * Created by Mukund on 03-03-16.
 */
public class Person {
    private String name;
    private String mobNo;

    public Person(){

    }
    public Person(String name, String mobNo ) {
        this.mobNo = mobNo;
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
