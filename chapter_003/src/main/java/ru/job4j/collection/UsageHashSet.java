package ru.job4j.collection;

import java.util.Set;

/**
 * Класс демонстрирующий работу HashSet
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class UsageHashSet {
    public static void main(String[] args) {
        Set<String> autos = Set.of("Lada",
                "BMV",
                "Volvo",
                "Toyouta");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
