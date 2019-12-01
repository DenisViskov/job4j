package ru.job4j.oop;

/**
 * Класс реализует функционал дантиста и наследуется от класса Doctor
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Dentist extends Doctor {
    /**
     * Пациент закреплённый за доктором
     */
    private String pacient;

    /**
     * Инструмент которым работает доктор
     */
    private String instrument;

    public Dentist(int experience, String department, String pacient, String instrument) {
        super(experience, department);
        this.pacient = pacient;
        this.instrument = instrument;
    }

    /**
     * Метод вызывает пациента прикреплённому к доктору
     *
     * @return - пациент
     */
    public String getPacient() {
        return pacient;
    }

    /**
     * Метод вызывает инструмент которым работает доктор
     *
     * @return - инструмент
     */
    public String getInstrument() {
        return instrument;
    }

    /**
     * Метод реализует лечение пациента
     *
     * @param pacient    - пациент
     * @param instrument - инструмент которым работает доктор
     */
    private void healPacient(String pacient, String instrument) {

    }
}
