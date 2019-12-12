package ru.job4j.tracker;

/**
 * Класс реализует функционал валдиации значений введённых от пользователя
 * наследуется от ConsoleInput
 *
 * @author Денис Висков
 * @version 1.0
 * @since 12.12.2019
 */
public class ValidateInput extends ConsoleInput {

    /**
     * Метод реализует вопрос пользователю и возвращает ответ от него
     * В случае не валидного ответа выбрасывает NumberFormatException
     *
     * @param question - вопрос
     * @return - ответ
     */
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again ");
            }
        } while (invalid);
        return value;
    }

    /**
     * Метод реализует вопрос пользователю и возвращает ответ от него
     * В случае не валидного ответа выбрасывает IllegalStateException и NumberFormatException
     *
     * @param question - вопрос
     * @return - ответ
     */
    @Override
    public int askInt(String question, int max) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question, max);
                invalid = false;
            } catch (IllegalStateException moe) {
                System.out.println("Please select key from menu ");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again ");
            }
        } while (invalid);
        return value;
    }
}
