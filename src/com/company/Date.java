package com.company;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String date = String.valueOf(d.day) + "/" + String.valueOf(d.mon) + "/" + String.valueOf(d.year);
        boolean status = false;

        String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
        boolean flag = false;
        if (date.matches(pattern)) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(date);
                status = true;
            } catch (Exception e) {
                status = false;
            }
        }
        return status;
    }
}

