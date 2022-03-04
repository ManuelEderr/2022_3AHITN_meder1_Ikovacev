package com.company;

/**
 * @author Manuel Eder
 *
 * Die Daten einer Person
 * name...Vorname
 * givenname... Nachname
 * nickname...nickname
 * birthday...geburstdatum
 * phone...Telefonnummer
 */

public class Person {
    String name, givenname, nickname;
    Date birthday;
    PhoneNumber phone;

    /**
     *
     * @param name zu vergebender Name
     * @param givenname zu vergebender nachname
     * @param nickname zu vergebender nickname
     * @param birthday zu vergebender geburtsdatum
     * @param phone zu vergebende Telefonnummer
     *              Nimmt die Parameter von oben und setzt die Werte der Person Klasse auf diese
     */
    public Person(String name, String givenname, String nickname, Date birthday, PhoneNumber phone) {
        this.name = name;
        this.givenname = givenname;
        this.nickname = nickname;
        this.birthday = birthday;
        this.phone = phone;
    }

    /**
     *
     * @param person nimmt alle Person relevanten Daten asu einem String und erstellt dioe Person Klasse
     * @throws IllegalPhoneNumberException
     * @throws IllegalDateException
     */
    public Person(String person) throws IllegalPhoneNumberException, IllegalDateException {
        String[] array = person.split(";");
        this.name = array[0];
        this.givenname = array[1];
        this.nickname = array[2];
        this.birthday = new Date(array[3]);
        this.phone = new PhoneNumber(array[4]);
    }

    /**
     *
     * @return eine Ausgabe gerecht für das in die Person csv Schreiben
     */
    @Override
    public String toString() {
        return name+";"+givenname+";"+nickname+";"+birthday+";"+phone;
    }
}
