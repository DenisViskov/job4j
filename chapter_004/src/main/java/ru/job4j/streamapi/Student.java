package ru.job4j.streamapi;

/**
 * Class realizes model of data Students
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.01.2020
 */
public class Student implements Comparable<Student> {
    /**
     * Scores
     */
    int score;

    /**
     * Last name
     */
    String lastName;

    public Student(int score) {
        this.score = score;
    }

    public Student(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.valueOf(this.score);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.score, this.score);
    }
}
