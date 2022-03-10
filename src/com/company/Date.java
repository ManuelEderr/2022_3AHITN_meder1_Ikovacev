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

    /**
     *
     * @param date String aus dem das Datum gemacht wird
     * @throws IllegalDateException
     *  Nimmt einen String und macht aus diesem ein Objekt der Klasse Date
     */
    public Date(String date) throws IllegalDateException {

        String[] tempVals = date.split("\\.");
        day = Integer.parseInt(tempVals[0]);
        mon = Integer.parseInt(tempVals[1]);
        year = Integer.parseInt(tempVals[2]);
        Date d = new Date(day,mon,year);
        if (!isValid(d)){
            day = Integer.parseInt(null);
            mon = Integer.parseInt(null);
            year = Integer.parseInt(null);
        }

    }

    /**
     *
     * @return der Tag wird zurückgegeben
     */
    public int getDay() {
        return day;
    }

    /**
     *
     * @return der Monat wird zurückgegeben
     */
    public int getMon() {
        return mon;
    }

    /**
     *
     * @return das Jahr wird zurückgegeben
     */
    public int getYear() {
        return year;
    }

    /**
     * Überprüft ob das Jahr ein Schaltjahr ist
     * @return true = Schaltjahr; false = kein Schaltjahr
     */
    boolean isLeapYear(){
        boolean returner = false;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            returner = true;
        }
        return returner;
    }

    /**
     *
     * @return Gibt das Datum zurück
     */
    @Override
    public String toString() {
        return day+"."+mon+"."+year;
    }

    /**
     * Überprüft ob das übergebene Datum richtig ist
     * @param d Das zu überprüfende Datum
     * @return true = es ist valid; false = nicht valid
     * @throws IllegalDateException Exception falls das Datum falsch ist
     */
    boolean isValid(Date d) throws IllegalDateException {

        String date = String.valueOf(d.day) + "/" + String.valueOf(d.mon) + "/" + String.valueOf(d.year);
        boolean status = true;

        if (!String.valueOf(d.getDay()).matches("(0?[1-9]|[12][0-9]|3[01])")){
            throw new IllegalDateException(IllegalDateException.DAY_ILLEGAL);
        }
        if (!String.valueOf(d.getMon()).matches("(0?[1-9]|1[0-2])")){
            throw new IllegalDateException(IllegalDateException.MON_ILLEGAL);
        }
        if (!String.valueOf(d.getYear()).matches("([0-9]{4})")){
            status = false;
        }

        return status;
    }



}

