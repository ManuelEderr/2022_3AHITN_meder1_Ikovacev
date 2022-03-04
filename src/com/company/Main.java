package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            Person person = null;
            Date d;
            PhoneNumber phoneNumber = null;

            File f = new File("Person.csv");
            ArrayList<String> arrayList = new ArrayList<>();

            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                arrayList.add(sc.next());
            }


            for (int i = 1; i < arrayList.size(); i++) {
                String[] currentStrings = arrayList.get(i).split(";");
                d = new Date(currentStrings[3]);
                phoneNumber = new PhoneNumber(currentStrings[4]);
                person = new Person(currentStrings[0], currentStrings[1], currentStrings[2], d, phoneNumber);
            }
            StreamOperation.ToStream(new FileWriter("Person.csv"), person);

        } catch (FileNotFoundException | IllegalPhoneNumberException e) {
            e.printStackTrace();
        }
    }
}


