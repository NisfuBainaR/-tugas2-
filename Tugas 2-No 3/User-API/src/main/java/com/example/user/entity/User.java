package com.example.user.entity;

public class User {
    private Long id;
    private String name;
    private String major;

    public User() {
    }

    public User(Long id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student Information:\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Major: " + major;
    }
}
