package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double expected = 2;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point first = new Point(1, 0,0);
        Point second = new Point(2, 0,0);
        double expected = 1;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

}