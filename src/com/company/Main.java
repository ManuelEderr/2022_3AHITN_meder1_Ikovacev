package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File f = new File("Person.csv");
            FileReader fileReader = new FileReader(f);
            BufferedReader reader = new BufferedReader(fileReader);
            String l = reader.readLine();
            System.out.println(l);
            Person mani =StreamOperation.FromStream(reader);
            System.out.println(mani);
            Person siegfried = new Person("Captain","America","Cap",new Date("04.07.1918"),new PhoneNumber(43,660,4134567));
            System.out.println(siegfried);
           // Writer wr = new FileWriter(f);
        } catch (FileNotFoundException | IllegalPhoneNumberException | IllegalDateException e) {
            e.printStackTrace();
            /**
             * ArrayList<String> arrayList = new ArrayList<>();
             *
             *             Scanner sc = new Scanner(f);
             *             while (sc.hasNextLine()) {
             *                 arrayList.add(sc.next());
             *             }
             *
             *
             *             for (int i = 1; i < arrayList.size(); i++) {
             *                 String[] currentStrings = arrayList.get(i).split(";");
             *                 d = new Date(currentStrings[3]);
             *                 phoneNumber = new PhoneNumber(currentStrings[4]);
             *                 person = new Person(currentStrings[0], currentStrings[1], currentStrings[2], d, phoneNumber);
             *             }
             */
        }
    }
}


