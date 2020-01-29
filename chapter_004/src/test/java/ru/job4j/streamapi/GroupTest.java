package ru.job4j.streamapi;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupTest {

    @Test
    public void groupTest() {
        Student first = new Student("Vasya",
                Set.of("Football"));
        Student second = new Student("Alex",
                Set.of("Jog"));
        List<Student> input = List.of(first, second);
        Map<String, Set<String>> expect = Map.of("Jog",
                Set.of("Alex"),
                "Football",
                Set.of("Vasya"));
        Map<String, Set<String>> out = Group.sections(input);
        Assert.assertThat(expect, Is.is(out));
    }
}
