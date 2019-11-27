package ru.job4j.array;

/**
 * Класс осуществляет проверку на совпадение переданных символов с символами в конце слова
 *
 * @author Денис Висков
 * @version 1.0
 * @since 23.11.2019
 */
public class EndsWith {

    /**
     * Метод сравнивает конечные символы слова с заданными символами второго параметра
     *
     * @param word - Слово для сравнения
     * @param post - Символы с которыми будет осуществляться сравнение
     * @return - Возвращает флаг "True" или "False"
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int index = word.length - 1;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[index] != post[i]) {
                result = false;
                break;
            }
            index--;
        }
        return result;
    }
}