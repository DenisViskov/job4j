package ru.job4j.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Class has realize grouping by interest of students
 *
 * @author Денис Висков
 * @version 1.0
 * @since 26.01.2020
 */
public class Group {

    /**
     * Method realizes grouping by interest of students
     *
     * @param students - students
     * @return - Map of interest units
     */
    public static Map<String, Set<String>> sections(List<Student> students) {
        Map<String, Set<String>> result = students.stream()
                .flatMap(e -> e.getUnits().stream().map(u -> new Holder(u,e.getName())))
                .collect(Collectors.groupingBy(t -> t.key,
                        Collector.of(HashSet::new,
                                (set, el) -> set.add(el.value),
                                (left, right) -> {
                                    left.addAll(right);
                                    return left;
                                })));
        return result;
    }
}
