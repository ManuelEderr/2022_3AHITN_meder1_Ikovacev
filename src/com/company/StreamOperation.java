package com.company;

/**
 * @author ikovacev
 * @lastChange 03.03.2022
 *
 */


import java.io.*;

public class StreamOperation {

    public static void ToStream(FileWriter writer, Person personToWriteTo) throws IOException {
       writer.write(personToWriteTo.toString()+"\n");

    }
//    public Person FromStream(Reader reader){
//        return new Person(reader.toString());
//    }
}
