package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.Comparator;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class NewUserTest {
    @Test
    public void nameSorterTest() {
        Comparator<NewUser> comparator = new NameSorter().order();
        int result = comparator.compare(new NewUser("A", 0), new NewUser("B", 0));
        assertThat(result, lessThan(0));
    }

    @Test
    public void nameReverseSorterTest() {
        Comparator<NewUser> comparator = new NameSorter().reverse();
        int result = comparator.compare(new NewUser("A", 0), new NewUser("B", 0));
        assertThat(result, greaterThan(0));
    }

    @Test
    public void prioritySorterTest() {
        Comparator<NewUser> comparator = new PrioritySorter().order();
        int result = comparator.compare(new NewUser("A", 0), new NewUser("B", 1));
        assertThat(result, lessThan(0));
    }

    @Test
    public void priorityReverseSorterTest() {
        Comparator<NewUser> comparator = new PrioritySorter().reverse();
        int result = comparator.compare(new NewUser("A", 0), new NewUser("B", 1));
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<NewUser> cmpNamePriority = new NameSorter().order().thenComparing(new PrioritySorter().order());
        int rsl = cmpNamePriority.compare(
                new NewUser("A", 0),
                new NewUser("B", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityReverse() {
        Comparator<NewUser> cmpNamePriority = new NameSorter().reverse().thenComparing(new PrioritySorter().reverse());
        int rsl = cmpNamePriority.compare(
                new NewUser("A", 0),
                new NewUser("B", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}
