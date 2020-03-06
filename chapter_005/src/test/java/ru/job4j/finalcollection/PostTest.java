package ru.job4j.finalcollection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PostTest {

    private List<String> firstList = new ArrayList<>();
    private List<String> secondList = new ArrayList<>();
    private List<String> thirdList = new ArrayList<>();
    private List<String> fourList = new ArrayList<>();
    private List<String> fiveList = new ArrayList<>();

    @Before
    public void setUp() {
        firstList.add("xxx@ya.ru");
        firstList.add("foo@gmail.com");
        firstList.add("lol@mail.ru");
        secondList.add("foo@gmail.com");
        secondList.add("ups@pisem.net");
        thirdList.add("xyz@pisem.net");
        thirdList.add("vasya@pupkin.com");
        fourList.add("ups@pisem.net");
        fourList.add("aaa@bbb.ru");
        fiveList.add("xyz@pisem.net");
    }

    @Test
    public void mergeOfUsersTest() {
        Post.User first = new Post.User("Ivan", firstList);
        Post.User second = new Post.User("Petr", secondList);
        Post.User third = new Post.User("Alex", thirdList);
        Post.User four = new Post.User("Georg", fourList);
        Post.User five = new Post.User("Petr", fiveList);
        List<Post.User> users = new ArrayList<>();
        users.add(first);
        users.add(second);
        users.add(third);
        users.add(four);
        users.add(five);
        List<Post.User> expected = List.of(first, third);
        List<Post.User> out = new Post().mergeOfUsers(users);
        assertThat(out, is(expected));
    }
}