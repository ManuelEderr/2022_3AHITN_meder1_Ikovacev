package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person person;
        Date d;
        PhoneNumber phoneNumber = null;

        File f = new File("Person.csv");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                arrayList.add(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <= arrayList.size(); i++){
            String [] currentStrings = arrayList.get(i).split(";");
            d = new Date(currentStrings[3]);
            person = new Person(currentStrings[0], currentStrings[1], currentStrings[2], d, phoneNumber);
        }

    }
}


