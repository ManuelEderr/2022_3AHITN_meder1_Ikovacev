package com.company;

/**
 * @author ikovacev
 * @lastChange 10.03.2022
 *
 */


import java.io.*;

public class StreamOperation {
    /**
     *
     * @param writer Writer der definiert in welche File geschrieben wird<br />
     * @param personToWriteTo Die Person die geschrieben werden soll <br /><br />
     * Schreibt in die Datei ausgewaehlte Personen vom main <br/>
     * Schreibt in den Format indem auch FROMSTREAM() einliest
     * @throws IOException
     */
    public static void TOSTREAM(Writer writer, Person personToWriteTo) throws IOException {
       writer.write(personToWriteTo.toString()+"\n");
    }

    /**
     *
     * @param reader Reader
     * @return Person gibt ein Objekt der Klasse Person zurueck <br /><br />
     * Nimmt einen Line von der geweahlten Datei und macht aus dieser ein Objekt der Person Klasse <br/>
     * Format: [NAME];[GIVENNAME];[NICKNAME];[BIRTHDAY.BIRTHMONTH.BIRTHYEAR];[PHONENUMBER]
     * @throws IllegalPhoneNumberException
     * @throws IllegalDateException
     */
    public static Person FROMSTREAM(Reader reader) throws IllegalPhoneNumberException, IOException, IllegalDateException {
        BufferedReader br = new BufferedReader(reader);
        return new Person(br.readLine());
    }
}
