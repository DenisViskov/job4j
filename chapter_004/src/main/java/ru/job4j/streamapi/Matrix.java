package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class realizes function of changing integer matrix to List
 *
 * @author Денис Висков
 * @version 1.0
 * @since 20.01.2020
 */
public class Matrix {

    /**
     * Method realizes changing integer matrix to List
     *
     * @param matrix - matrix
     * @return - List integer
     */
    public List matrixToList(Integer[][] matrix) {
        List<Integer> result = Stream.of(matrix).
                flatMap(e -> Stream.of(e)).
                collect(Collectors.toList());
        return result;
    }
}
