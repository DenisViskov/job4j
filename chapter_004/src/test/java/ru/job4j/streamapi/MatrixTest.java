package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MatrixTest {

    @Test
    public void matrixTest() {
        Integer[][] input = {{1, 2}, {3, 4}};
        List<Integer> expect = List.of(1, 2, 3, 4);
        List<Integer> out = new Matrix().matrixToList(input);
        Assert.assertEquals(expect, out);
    }
}
