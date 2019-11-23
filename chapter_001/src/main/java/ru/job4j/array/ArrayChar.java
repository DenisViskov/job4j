package ru.job4j.array;

/**
 * Класс осуществляет проверку на совпадение переданных символов с символами в начале слова
 *
 * @author Денис Висков
 * @version 1.0
 * @since 23.11.2019
 */
public class ArrayChar {

    /**
     * Метод сравнивает начальные символы слова с заданными символами второго параметра
     *
     * @param word - Слово для сравнения
     * @param pref - Символы с которыми будет осуществляться сравнение
     * @return - Возвращает флаг "True" или "False"
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

