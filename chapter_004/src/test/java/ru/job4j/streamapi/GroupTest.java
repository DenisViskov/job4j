package ru.job4j.streamapi;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupTest {

    @Test
    public void groupTest() {
        Student first = new Student("Vasya",
                Set.of("Football",
                        "Basketball",
                        "Music"));
        Student second = new Student("Alex",
                Set.of("Jog",
                        "Baseball",
                        "Kung-Fu"));
        List<Student> input = List.of(first, second);
        Map<String, Set<String>> expect = Map.of("Vasya",
                Set.of("Football",
                        "Basketball",
                        "Music"),
                "Alex",
                Set.of("Jog",
                        "Baseball",
                        "Kung-Fu"));
        Map<String, Set<String>> out = Group.sections(input);
        Assert.assertEquals(expect.toString(), out.toString());
    }
}
