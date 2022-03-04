package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File f = new File("Person.csv");
            Writer wr = new FileWriter(f);
            FileReader fileReader = new FileReader(f);
            BufferedReader reader = new BufferedReader(fileReader);
            reader.readLine();

            Person mani =StreamOperation.FromStream(reader);
            System.out.println(mani);

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


