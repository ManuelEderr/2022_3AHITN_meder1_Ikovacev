package com.company;


/**
 * @author Manuel Eder
 *
 * Speichert das Datum
 */
public class Date {
    int day, mon, year;

    public Date(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public Date(String date){

    }

    public int getDay() {
        return day;
    }

    public int getMon() {
        return mon;
    }

    public int getYear() {
        return year;
    }

    boolean isLeapYear(){

        return false;
    }

    boolean isValid(Date d){

        return false;
    }
}

