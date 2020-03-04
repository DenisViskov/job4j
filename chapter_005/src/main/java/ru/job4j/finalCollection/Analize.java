package ru.job4j.finalCollection;

import java.util.List;

/**
 * @author Денис Висков
 * @version 1.0
 * @since 04.03.2020
 */
public class Analize {

    public Info diff(List<User> previous, List<User> current) {
        return null;
    }

    public static class User {
        private final int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Info {
        private int added;
        private int changed;
        private int deleted;

        public Info(int added, int changed, int deleted) {
            this.added = added;
            this.changed = changed;
            this.deleted = deleted;
        }
    }
}
