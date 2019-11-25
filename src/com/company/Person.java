package com.company;

public class Person {

    private String fullName;
    private String city;
    private String email;

    public Person(String fullName, String city, String email) {
        this.fullName = fullName;
        this.city = city;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }
}
