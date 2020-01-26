package ru.job4j.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                .flatMap(e -> Stream.of(new Holder(e.getName(), e.getUnits().iterator().next())))
                .collect(Collectors.groupingBy(t -> t.key,
                        Collector.of(HashSet::new, (set, el) -> set.add(el.value), (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        })));

        return result;
    }
}
