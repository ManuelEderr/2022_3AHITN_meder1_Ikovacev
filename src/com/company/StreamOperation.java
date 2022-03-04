package com.company;

/**
 * @author ikovacev
 * @lastChange 03.03.2022
 *
 */


import java.io.*;

public class StreamOperation {
    /**
     *
     * @param writer Writer der definiert in welche File geschrieben wird
     * @param personToWriteTo Die Person die geschrieben werden soll
     * @throws IOException
     */
    public static void ToStream(FileWriter writer, Person personToWriteTo) throws IOException {
       writer.write(personToWriteTo.toString()+"\n");

    }

    /**
     *
     * @param reader Reader
     * @return Person gibt ein Objekt der Klasse Person zurueck
     * @throws IllegalPhoneNumberException
     */
    public static Person FromStream(Reader reader) throws IllegalPhoneNumberException, IOException, IllegalDateException {
        BufferedReader br = new BufferedReader(reader);
        return new Person(br.readLine());
    }
}
