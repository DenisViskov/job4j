package ru.job4j.lambda;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        for (int i = start; i < end; i++) {
            double res = func.apply(new Double(i));
            BigDecimal round = new BigDecimal(Double.toString(res));
            round = round.setScale(2, RoundingMode.HALF_EVEN);
            result.add(round.doubleValue());
        }
        return result;
    }
}
