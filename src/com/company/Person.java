package com.company;

/**
 * @author Manuel Eder
 *
 * Die Daten einer Person
 */

public class Person {
    String name, givenname, nickname;
    Date birthday;
    PhoneNumber phone;

    public Person(String name, String givenname, String nickname, Date birthday, PhoneNumber phone) {
        this.name = name;
        this.givenname = givenname;
        this.nickname = nickname;
        this.birthday = birthday;
        this.phone = phone;
    }

    public Person(String person) throws IllegalPhoneNumberException, IllegalDateException {
        String[] array = person.split(";");
        this.name = array[0];
        this.givenname = array[1];
        this.nickname = array[2];
        this.birthday = new Date(array[3]);
        this.phone = new PhoneNumber(array[4]);
    }

    @Override
    public String toString() {
        return name+";"+givenname+";"+nickname+";"+birthday+";"+phone;
    }
}
