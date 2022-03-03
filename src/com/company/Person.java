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

    public Person(String name, String givenname, Date birthday, PhoneNumber phone) {
        this.name = name;
        this.givenname = givenname;
        this.birthday = birthday;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                '}';
    }
}
