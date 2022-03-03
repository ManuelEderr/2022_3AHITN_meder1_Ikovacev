package com.company;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Manuel Eder
 *
 * Speichert das Datum
 */
public class Date {
    private int day, mon, year;

    public Date(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public Date(String date){

        String[] tempVals = date.split("\\.");
        day = Integer.parseInt(tempVals[0]);
        mon = Integer.parseInt(tempVals[1]);
        year = Integer.parseInt(tempVals[2]);
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
        boolean returner = false;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            returner = true;
        }
        return returner;
    }

    boolean isValid(Date d){
        boolean r;

        String date = String.valueOf(d.day) + "/" + String.valueOf(d.mon) + "/" + String.valueOf(d.year);

        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            r = false;
        }
        r = true;

        return r;
    }
}

