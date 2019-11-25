package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {


    public static ArrayList<Person> read() throws FileNotFoundException {
        ArrayList<Person> peopleList = new ArrayList<>();
        Scanner sc = new Scanner(new File("src/us-500.csv"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] fields = line.split(",");
            String fullName = fields[0] + fields[1];
            String city = fields[2];
            String email = fields[3];
            Person person = new Person(fullName,city,email);
            peopleList.add(person);
        }
        return peopleList;
    }
}
