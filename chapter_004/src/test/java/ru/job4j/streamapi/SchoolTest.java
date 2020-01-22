package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void whenGradeIsGreaterThan70() {
        List<Student> input = Arrays.asList(new Student(75),
                new Student(55),
                new Student(45));
        List<Student> expected = Arrays.asList(new Student(75));
        List<Student> out = new School().collect(input, x -> x.score > 70);
        assertThat(expected.toString(), is(out.toString()));
    }

    @Test
    public void whenGradeIsGreaterThan50() {
        List<Student> input = Arrays.asList(new Student(75),
                new Student(55),
                new Student(45));
        List<Student> expected = Arrays.asList(new Student(55));
        List<Student> out = new School().collect(input, x -> x.score > 50 && x.score < 70);
        assertThat(expected.toString(), is(out.toString()));
    }

    @Test
    public void whenGradeIsLessThan50() {
        List<Student> input = Arrays.asList(new Student(75),
                new Student(55),
                new Student(45));
        List<Student> expected = Arrays.asList(new Student(45));
        List<Student> out = new School().collect(input, x -> x.score < 50);
        assertThat(expected.toString(), is(out.toString()));
    }

    @Test
    public void listToMapTest() {
        Student first = new Student("Ivanov");
        Student second = new Student("Petrov");
        List<Student> input = Arrays.asList(first, second);
        Map<String, Student> expect = new HashMap<>();
        expect.put(first.lastName, first);
        expect.put(second.lastName, second);
        Map<String, Student> out = new School().listToMap(input);
        Assert.assertEquals(expect, out);
    }

    @Test
    public void levelOfTest() {
        Student first = new Student(55);
        Student second = new Student(67);
        Student four = new Student(45);
        List<Student> input = Arrays.asList(first, second, null, four);
        List<Student> expect = List.of(second, first);
        List<Student> out = new School().levelOf(input, 50);
        Assert.assertEquals(expect, out);
    }
}
