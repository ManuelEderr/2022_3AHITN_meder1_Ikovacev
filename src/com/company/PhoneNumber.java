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
     * @param country  Country Kennungszahl nur schweizer oesterreichische oder deutsche Nummern (41,43,49)
     * @param areacode area Kennungszahl ist 3 lang
     * @param number   restliche Nummer ist 8 zeichen Lang
     *                 Nimmt diese 3 Werte und erstellte eine PhoneNumber Klasse
     */
    public PhoneNumber(int country, int areacode, int number) throws IllegalPhoneNumberException {


            if (!(country == 41 || country == 43 || country == 49)){
                throw new IllegalPhoneNumberException(IllegalPhoneNumberException.COUNTRY_ILLEGAL);
            } else {
                this.country = country;
            }

            if (areacode < 100 || areacode > 1000){
                throw new IllegalPhoneNumberException(IllegalPhoneNumberException.AREA_ILLEGAL);
            } else {
                this.areacode = areacode;
            }

            if (number < 1000000 || number > 10000000){
                throw new IllegalPhoneNumberException(IllegalPhoneNumberException.NUMBER_ILLEGAL);
            } else {
                this.number=number;
            }

    }

    /**
     * @param number String aus dem die Nummer herausgelesen wird
     *               Nimmt diesen 1 Wert und erstellte eine PhoneNumber Klasse
     */
    public PhoneNumber(String number) throws IllegalPhoneNumberException {
        this(Integer.parseInt(number.substring(0, 2)),Integer.parseInt(number.substring(2, 5)),Integer.parseInt(number.substring(6)));
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
     * @return Country Kennungszahl
     */
    public int getCountry() {
        return country;
    }

    /**
     * @return area Kennungszahl
     */
    public int getAreacode() {
        return areacode;
    }

    /**
     * @return restliche Nummer
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param phNmbr Telefonnummer die zum pruefen ist
     * @return gibt zurueck ob die gegebene Telefonnummer valid ist oder nicht
     */
    public boolean isValid(PhoneNumber phNmbr) {
        if (!(phNmbr.getCountry() == 41 || phNmbr.getCountry() == 43 || phNmbr.getCountry() == 49)){
            return false;
        }

        if (phNmbr.getAreacode() < 100 || phNmbr.getAreacode() > 1000){
           return false;
        }

        if (phNmbr.getNumber() < 1000000 || phNmbr.getNumber() > 10000000){
return false;
        }
        return true;
    }


}
