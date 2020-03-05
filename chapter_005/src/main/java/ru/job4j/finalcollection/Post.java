package ru.job4j.finalcollection;

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
        for (int i = 0; i < users.size(); i++) {
            Iterator<String> mails = users.get(i).mails.iterator();
            Iterator<User> userIt = users.iterator();
            while (mails.hasNext() && userIt.hasNext()) {
                String mail = mails.next();
                User user = userIt.next();
                if (users.get(i) != user && user.mails.contains(mail)) {
                    user.mails.addAll(users.get(i).mails);
                    users.remove(i);
                    user.mails = user.mails.stream()
                            .distinct()
                            .collect(Collectors.toList());
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
