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
        for (int i = 0; i < list.size()-1; i++) {

            System.out.println(Filter.cityFilter("Chicago", list).get(i).getEmail());
        }

    }
}
