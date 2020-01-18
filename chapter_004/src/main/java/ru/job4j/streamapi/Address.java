package ru.job4j.streamapi;

import java.util.Objects;

/**
 * Class realizes model of data Adresses
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.01.2020
 */
public class Address implements Comparable<Address> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home
                && apartment == address.apartment
                && city.equals(address.city)
                && street.equals(address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public int compareTo(Address o) {
        return this.city.compareTo(o.city);
    }
}
