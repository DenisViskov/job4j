package ru.job4j.streamapi;

/**
 * Class realizes model of data Students
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.01.2020
 */
public class Student {
    /**
     * Scores
     */
    int score;

    public Student(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.valueOf(this.score);
    }
}
