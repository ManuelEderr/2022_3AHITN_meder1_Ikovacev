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
        }
    }
}


