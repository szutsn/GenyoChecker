package com.company;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    private static ArrayList<Person> peopleInCity;

    public static ArrayList<Person> cityFilter(String city, List<Person> persons){
        peopleInCity = new ArrayList<>();
        for (Person person : persons) {
            if (person.getCity().equals(city)){
                peopleInCity.add(person);
            }
        }
        return peopleInCity;
    }
}
