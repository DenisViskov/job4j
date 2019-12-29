package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Класс реализующий конвертацию заказов в карту
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class OrderConvert {
    /**
     * Метод реализует функционал конвертации из заказов в карту
     *
     * @param orders - заказы
     * @return - карта
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
