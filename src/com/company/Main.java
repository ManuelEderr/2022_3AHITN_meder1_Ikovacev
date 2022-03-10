package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File f = new File("Person.csv");
            Writer wr = new FileWriter("PersonsToWrite.csv");
            FileReader fileReader = new FileReader(f);
            BufferedReader reader = new BufferedReader(fileReader);
            reader.readLine();


            Person mani =StreamOperation.FROMSTREAM(reader);
            System.out.println(mani);
            Person julian = new Person("Julian","Huber","Jul",new Date("30.09.2004"),new PhoneNumber(41,660,1807537));
            System.out.println(julian);

            wr.flush();
            StreamOperation.TOSTREAM(wr, julian);
            StreamOperation.TOSTREAM(wr,mani);
            wr.close();




        } catch (FileNotFoundException | IllegalPhoneNumberException | IllegalDateException e) {
            e.printStackTrace();
        }
    }
}


