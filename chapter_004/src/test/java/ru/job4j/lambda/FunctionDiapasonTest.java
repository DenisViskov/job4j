package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FunctionDiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void quadraticFunctionTest() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> (2 * x * x) + (2 * 2) + 1);
        List<Double> expected = Arrays.asList(55D, 77D, 103D);
        assertThat(result, is(expected));
    }

    @Test
    public void logarifmicFunctionTest() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> Math.log(x));
        List<Double> expected = Arrays.asList(1.61D, 1.79D, 1.95D);
        assertThat(result, is(expected));
    }

}
