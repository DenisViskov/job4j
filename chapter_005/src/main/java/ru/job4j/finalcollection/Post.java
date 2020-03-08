package ru.job4j.finalcollection;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс реализует ...
 *
 * @author Денис Висков
 * @version 1.0
 * @since 05.03.2020
 */
public class Post {

    public List<User> mergeOfUsers(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            List<User> duplicates = hasDuplicate(users.get(i), users);
            if (duplicates.size() != 0) {
                for (User copyUser : duplicates) {
                    users.get(i).mails.addAll(copyUser.mails);
                    users.get(i).mails = users.get(i).mails.stream()
                            .distinct()
                            .collect(Collectors.toList());
                    users.remove(copyUser);
                }
            }
        }
        return users;
    }

    private List<User> hasDuplicate(User byUser, List<User> users) {
        Iterator<String> mails = byUser.mails.iterator();
        List<User> hasDuplicate = new ArrayList<>();
        while (mails.hasNext()) {
            String mail = mails.next();
            for (User user : users) {
                if (byUser != user && user.mails.contains(mail)) {
                    hasDuplicate.add(user);
                }
            }
        }
        return hasDuplicate;
    }

    public static class User {
        private String name;
        private List<String> mails;

        public User(String name, List<String> mails) {
            this.name = name;
            this.mails = mails;
        }
    }
}
