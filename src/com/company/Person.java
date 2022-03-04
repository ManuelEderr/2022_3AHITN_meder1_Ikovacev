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

    @Override
    public String toString() {
        return name+";"+givenname+";"+nickname+";"+birthday+";"+phone;
    }
}
