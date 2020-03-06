package ru.job4j.finalcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
        List<User> result = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            Iterator<String> mails = users.get(i).mails.iterator();
            while (mails.hasNext()) {
                String mail = mails.next();
                for (int k = 0; k < users.size(); k++) {
                    if (users.get(k) != users.get(i) && users.get(k).mails.contains(mail)) {
                        User newUser = new User(users.get(i).name, users.get(i).mails);
                        newUser.mails.addAll(users.get(k).mails);
                        newUser.mails = newUser.mails.stream()
                                .distinct()
                                .collect(Collectors.toList());
                        result.add(newUser);
                        users.remove(users.get(k));
                    }
                }
            }
        }
        return users;
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
