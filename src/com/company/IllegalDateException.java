package com.company;

/**
 * @author Manuel Eder
 * <p>
 * Überprüft ob das Datum valid ist.
 */

public class IllegalDateException extends Exception{
    int type;
    public static final int DAY_ILLEGAL = 0;
    public static final int MON_ILLEGAL = DAY_ILLEGAL + 1;

    public IllegalDateException(int type) {
        this.type = type;
    }
}

