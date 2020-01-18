package ru.job4j.streamapi;

/**
 * Class realizes model of data Profile
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.01.2020
 */
public class Profile {
    /**
     * Adress of client
     */
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
