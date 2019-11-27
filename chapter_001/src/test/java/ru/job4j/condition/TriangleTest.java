package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void period() {
        Point first = new Point(2,2);
        Point second = new Point(2,2);
        Point third = new Point(1,1);
        Triangle triangle = new Triangle(first,second,third);
        double result = triangle.period(first.distance(second),first.distance(third),second.distance(third));
        assertThat(result, is(true));
    }

}