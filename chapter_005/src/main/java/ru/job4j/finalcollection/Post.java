package ru.job4j.finalcollection;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Class has realize merge of Users by email
 *
 * @author Денис Висков
 * @version 1.0
 * @since 05.03.2020
 */
public class Post {

    /**
     * Method has realize merge of users by their duplicates emails
     *
     * @param users - list of users
     * @return - new list without duplicates
     */
    public List<User> mergeOfUsers(List<User> users) {
        Map<User, Set<String>> first = users.stream()
                .collect(Collectors.toMap(i -> i, k -> k.mails));
        Map<String, User> second = new HashMap<>();
        for (User user : users) {
            second.putAll(collectToMap(user));
        }
        return null;
    }

    private Map<String, User> collectToMap(User user) {
        Map<String, User> result = user.mails.stream()
                .collect(Collectors.toMap(i -> i, k -> user));
        return result;
    }

    /**
     * Class has realizes model of data User
     */
    public static class User {
        /**
         * Name
         */
        private String name;

        /**
         * Emails
         */
        private Set<String> mails;

        public User(String name, Set<String> mails) {
            this.name = name;
            this.mails = mails;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return name.equals(user.name)
                    && mails.equals(user.mails);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, mails);
        }
    }
}
