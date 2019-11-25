package com.company;

import java.util.Comparator;

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

    public static Comparator<Person> PersonNameComparator = new Comparator<Person>() {

        public int compare(Person p1, Person p2) {
            String Name1 = p1.getFullName().toUpperCase();
            String Name2 = p2.getFullName().toUpperCase();

            //ascending order
            return Name1.compareTo(Name2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};
}
