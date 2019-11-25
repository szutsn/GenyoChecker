package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        ArrayList<Person> list = Reader.read();

        Collections.sort(list, Person.PersonNameComparator);

    }
}
