package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here

        ArrayList<Person> list = Reader.read();
        Filter filter = new Filter();

        Collections.sort(list, Person.PersonNameComparator);

        /*for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getFullName());
        }*/
        ArrayList<Person> chicagoPeople = Filter.cityFilter("Chicago", list);
        for (Person chicagoPerson : chicagoPeople) {
            System.out.println(chicagoPerson.getEmail());
        }



    }
}
