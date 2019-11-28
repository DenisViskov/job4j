package ru.job4j.condition;

/**
 * Класс реализует функционал сравнения нескольких чисел
 *
 * @author Денис Висков
 * @version 1.1
 * @since 28.11.2019
 */
public class Max {

    /**
     * Метод реализует сравнение двух чисел
     *
     * @param first  - Первый аргумент
     * @param second - Второй аргумент
     * @return - максимум
     */
    public static int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }

    /**
     * Метод реализует сравнение трёх чисел
     *
     * @param first  - Первый аргумент
     * @param second - Второй аргумент
     * @param third  - Третий аргумент
     * @return - максимум
     */
    public static int max(int first, int second, int third) {
        int result = first >= second ? first : second;
        int max = result >= third ? result : third;
        return max;
    }

    /**
     * Метод реализует сравнени четырёх чисел
     *
     * @param first  - Первый аргумент
     * @param second - Второй аргумент
     * @param third  - Третий аргумент
     * @param four   - Четвёртый аргумент
     * @return - максимум
     */
    public static int max(int first, int second, int third, int four) {
        int one = first >= second ? first : second;
        int two = third >= four ? third : four;
        int max = one >= two ? one : two;
        return max;
    }
}
