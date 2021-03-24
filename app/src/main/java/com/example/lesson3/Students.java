package com.example.lesson3;

import java.io.Serializable;

public class Students implements Serializable {
    private String firstName, secondName;
    private String age;
    private int phone;

    public Students() {

    }

    public Students(String firstName, String secondName, String age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAge() {
        return age;
    }
}
