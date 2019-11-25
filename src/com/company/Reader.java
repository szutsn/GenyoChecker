package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    private ArrayList<Person> peopleList = new ArrayList<>();

    public static ArrayList<Person> read(ArrayList<Person> peopleList) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/us-500.csv"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] fields = line.split(",");
            String fullName = fields[0] +" "+ fields[1];
            String city = fields[2];
            String email = fields[3];
            Person person = new Person(fullName,city,email);
            peopleList.add(person);
        }
        return peopleList;
    }
}
