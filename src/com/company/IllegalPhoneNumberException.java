package com.company;

/**
 * @author ikovacev
 * @lastChange 03.03.2022
 *
 */
public class IllegalPhoneNumberException extends Exception {
    protected int type;
    protected int COUNTRY_ILLEGAL;
    protected int AREA_ILLEGAL;
    protected int NUMBER_ILLEGAL;
    protected int STRING_FORMAT_ILLEGAL;

    IllegalPhoneNumberException(int type){

    }
}
