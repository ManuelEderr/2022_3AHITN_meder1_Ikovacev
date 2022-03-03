package com.company;

/**
 * @author ikovacev
 * @lastChange 03.03.2022
 * Phonenumber Klasse, speichert die Telefonnummer in 3 verschiedenen Teilen,
 * areacode...fuer Ortskennung
 * country...fuer landkennung
 * number...fuer restliche nummer
 */
public class PhoneNumber {
    protected int country;
    protected int areacode;
    protected int number;

    /**
     *
     * @param country Country Kennungszahl
     * @param areacode area Kennungszahl
     * @param number restliche Nummer
     * Nimmt diese 3 Werte und erstellte eine PhoneNumber Klasse
     */
    public PhoneNumber(int country, int areacode, int number) {
        this.country = country;
        this.areacode = areacode;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "country=" + country +
                ", areacode=" + areacode +
                ", number=" + number +
                '}';
    }

    /**
     *
     * @return Country Kennungszahl
     */
    public int getCountry() {
        return country;
    }

    /**
     *
     * @return area Kennungszahl
     */
    public int getAreacode() {
        return areacode;
    }

    /**
     *
     * @return restliche Nummer
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number String aus dem die Nummer herausgelesen wird
     *               Nimmt diesen 1 Wert und erstellte eine PhoneNumber Klasse
     */
    public PhoneNumber(String number){
        country= Integer.parseInt(number.substring(0,1));
        areacode= Integer.parseInt(number.substring(2,4));
        this.number = Integer.parseInt(number.substring(5));
    }
}
