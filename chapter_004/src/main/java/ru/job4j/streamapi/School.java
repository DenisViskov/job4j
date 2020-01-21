package ru.job4j.streamapi;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class realizes function working of school
 *
 * @author Денис Висков
 * @version 1.0
 * @since 18.01.2020
 */
public class School {

    /**
     * Method of spliting school class on his grades
     *
     * @param students - students
     * @param predict  - conditions
     * @return - collection of students
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> result = students.stream().
                filter(predict).
                collect(Collectors.toList());
        return result;
    }

    /**
     * Method of convert list to Map
     *
     * @param students - students
     * @return - Map students
     */
    public Map<String, Student> listToMap(List<Student> students) {
        Map<String, Student> result = students.stream().
                distinct().
                collect(Collectors.toMap(x -> x.lastName,
                        x -> x));
        return result;
    }
}
