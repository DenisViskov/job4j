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
                collect(Collectors.toList());
        return result;
    }
}
