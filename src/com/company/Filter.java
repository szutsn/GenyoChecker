package com.company;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static ArrayList<Person> cityFilter(String city, List<Person> persons){
        ArrayList<Person> peopleInCity = new ArrayList<>();
        for (Person person : persons) {
            if (person.getCity().equals(city)){
                peopleInCity.add(person);
            }
        }
        return peopleInCity;
    }
}
