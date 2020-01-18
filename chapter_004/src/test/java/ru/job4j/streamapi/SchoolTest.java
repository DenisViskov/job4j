package ru.job4j.streamapi;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
}
