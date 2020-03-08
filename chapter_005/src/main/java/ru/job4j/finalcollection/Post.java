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

    /**
     * Method has realizes looking for duplicates of emails mid users
     *
     * @param byUser - destination user
     * @param users  - list of users
     * @return - List of duplicates
     */
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
        private List<String> mails;

        public User(String name, List<String> mails) {
            this.name = name;
            this.mails = mails;
        }
    }
}
