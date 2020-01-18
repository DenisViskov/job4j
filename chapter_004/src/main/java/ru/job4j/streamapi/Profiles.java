package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class realizes collection of adresses clients
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.01.2020
 */
public class Profiles {

    /**
     * Method of searching and collecting of adresses
     *
     * @param profiles - profiles
     * @return - collection of adresses
     */
    public List<Address> collect(List<Profile> profiles) {
        List<Address> result = profiles.stream().
                map(x -> x.getAddress()).
                distinct().
                collect(Collectors.toList());
        return result;
    }

    /**
     * Method of sorting adresses
     *
     * @param addresses - list of adresses
     * @return - sorted list
     */
    public List<Address> sortesAdresses(List<Address> addresses) {
        List<Address> result = addresses.stream().
                sorted().
                collect(Collectors.toList());
        return result;
    }
}
