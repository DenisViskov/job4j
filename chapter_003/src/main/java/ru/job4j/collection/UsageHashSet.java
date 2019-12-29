package ru.job4j.collection;

import java.util.HashSet;

/**
 * Класс демонстрирующий работу HashSet
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMV");
        autos.add("Volvo");
        autos.add("Toyouta");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
