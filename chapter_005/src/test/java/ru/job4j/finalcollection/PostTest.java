package ru.job4j.finalcollection;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PostTest {

    private List<String> firstList = List.of("xxx@ya.ru",
            "foo@gmail.com",
            "lol@mail.ru");
    private List<String> secondList = List.of("foo@gmail.com",
            "ups@pisem.net");
    private List<String> thirdList = List.of("xyz@pisem.net",
            "vasya@pupkin.com");
    private List<String> fourList = List.of("ups@pisem.net",
            "aaa@bbb.ru");
    private List<String> fiveList = List.of("xyz@pisem.net");

    @Test
    public void mergeOfUsersTest() {
        Post.User first = new Post.User("Ivan", firstList);
        Post.User second = new Post.User("Petr", secondList);
        Post.User third = new Post.User("Alex", thirdList);
        Post.User four = new Post.User("Georg", fourList);
        Post.User five = new Post.User("Petr", fiveList);
        List<Post.User> users = List.of(first,
                second,
                third,
                four,
                five);
        List<Post.User> expected = List.of(first, third);
        List<Post.User> out = new Post().mergeOfUsers(users);
        assertThat(out, is(expected));
    }
}