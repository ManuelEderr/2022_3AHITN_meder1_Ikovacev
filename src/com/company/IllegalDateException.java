package com.company;

/**
 * @author Manuel Eder
 *
 * Überprüft ob das Datum valid ist.
 */

public class IllegalDateException{
    int type, DAY_ILLEGAL, MON_ILLEGAL;

    public IllegalDateException(int type) {
        this.type = type;
    }
}

