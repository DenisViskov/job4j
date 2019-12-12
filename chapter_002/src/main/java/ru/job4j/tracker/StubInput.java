package ru.job4j.tracker;

/**
 * Класс реализует функционал пользовательского ввода данных
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.12.2019
 */
public class StubInput implements Input {
    /**
     * Ответы
     */
    private String[] answers;

    /**
     * Позиция
     */
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Метод возвращает ответы пользователя по порядку
     *
     * @param question - вопрос
     * @return - ответ
     */
    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    /**
     * Метод возвращает ответы пользователя по порядку
     *
     * @param question - вопрос
     * @return - ответ
     */
    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }

    /**
     * Метод вызывает внутри себя  askInt(String question)
     *
     * @param question - вопрос
     * @param max      - максимальное значение
     * @return - ответ
     */
    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }
}
