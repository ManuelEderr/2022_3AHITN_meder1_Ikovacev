package com.company;

/**
 * @author Manuel Eder
 * <p>
 * Wenn das Datum nicht valid ist, kann wird der Fehlercode mit einer Exception zurückgegeben.
 */

public class IllegalDateException extends Exception{
    int type;
    public static final int DAY_ILLEGAL = 0;
    public static final int MON_ILLEGAL = DAY_ILLEGAL + 1;

    public IllegalDateException(int type) {
        this.type = type;
    }
}

