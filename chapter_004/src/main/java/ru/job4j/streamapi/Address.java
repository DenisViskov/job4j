package ru.job4j.streamapi;

/**
 * Class realizes model of data Adresses
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.01.2020
 */
public class Address {
    /**
     * City of lives client
     */
    private String city;

    /**
     * Street of lives client
     */
    private String street;

    /**
     * Number of home
     */
    private int home;

    /**
     * Number of apartment
     */
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }


}
