package com.practice.sp3_1.dto;

public class UserRequest {
    private long id;
    private String name;
    private String dob;
    private String address;

    public UserRequest() {
    }

    public UserRequest(long id, String name, String dob, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


