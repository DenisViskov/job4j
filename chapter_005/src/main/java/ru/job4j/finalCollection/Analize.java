package ru.job4j.finalCollection;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author Денис Висков
 * @version 1.0
 * @since 04.03.2020
 */
public class Analize {

    public Info diff(List<User> previous, List<User> current) {
        return new Info(wasAdded(previous, current), wasChanged(previous, current), wasDeleted(previous, current));
    }

    private int wasAdded(List<User> previous, List<User> current) {
        int result = current.size() - previous.size();
        return result >= 0 ? result : 0;
    }

    private int wasDeleted(List<User> previous, List<User> current) {
        int result = previous.size() - current.size();
        return result >= 0 ? result : 0;
    }

    private int wasChanged(List<User> previous, List<User> current) {
        int result = 0;
        Iterator<User> prev = previous.iterator();
        Iterator<User> curr = current.iterator();
        while (prev.hasNext() && curr.hasNext()) {
            User first = prev.next();
            User second = curr.next();
            if (first.id == second.id) {
                result = first.name.equals(second.name) ? 0 : ++result;
            }
        }
        return result;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Info info = (Info) o;
            return added == info.added &&
                    changed == info.changed &&
                    deleted == info.deleted;
        }

        @Override
        public int hashCode() {
            return Objects.hash(added, changed, deleted);
        }
    }
}
