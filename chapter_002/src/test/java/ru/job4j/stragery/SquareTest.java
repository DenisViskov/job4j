package ru.job4j.stragery;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("**********" + '\n')
                                .append("**********" + '\n')
                                .append("**********" + '\n')
                                .append("**********" + '\n')
                                .toString()
                )
        );
    }
}
