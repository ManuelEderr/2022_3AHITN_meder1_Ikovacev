package com.company;

/**
 * @author ikovacev
 * @lastChange 10.03.2022
 * Zustaendig fuer Fehler die gemacht werden koennen bei dem erstellen der PhoneNumber Klasse
 */

public class IllegalPhoneNumberException extends Exception {
    protected int type;
    public final static int COUNTRY_ILLEGAL = 0;
    public final static int AREA_ILLEGAL = COUNTRY_ILLEGAL + 1;
    public final static int NUMBER_ILLEGAL = AREA_ILLEGAL + 1;
    public final static int STRING_FORMAT_ILLEGAL = NUMBER_ILLEGAL +1;

    /**
     *
     * @param type der aufgretretene Fehler beim erstellen der PhoneNumber
     *             Setzt die Type der Exception auf dem aufgetretenen Fehler <br/>
     *             Moegliche Typen: COUNTRY_ILLEGAL <br/> AREA_ILLEGAL <br/> NUMBER_ILLEGAL
     */
    IllegalPhoneNumberException(int type) {
        this.type = type;
    }
}
