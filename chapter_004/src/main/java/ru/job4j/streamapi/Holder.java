package ru.job4j.streamapi;

/**
 * Class realizes model of data Holder
 *
 * @author Денис Висков
 * @version 1.0
 * @since 26.01.2020
 */
public class Holder {

    /**
     * Key
     */
    String key;

    /**
     * Value
     */
    String value;

    Holder(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
