package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Класс реализует подсчёт функции в диапазоне
 *
 * @author Денис Висков
 * @version 1.0
 * @since 15.01.2020
 */
public class FunctionDiapason {

    /**
     * Метод реализует подсчёт функции в диапазоне
     *
     * @param start - начало диапазона
     * @param end   - конец диапазона
     * @param func  - функция
     * @return - диапазон
     */
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++){
            result.add(func.apply(new Double(i)));
        }
        return result;
    }
}
