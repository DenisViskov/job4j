package ru.job4j.stragery;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                                .append("    *    " + '\n')
                                .append("   * *   " + '\n')
                                .append("  *   *  " + '\n')
                                .append(" * * * * " + '\n')
                                .toString()
                )
        );
    }
}
