package ru.job4j.finalcollection;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Class has realizes analyze about changes in Lists
 *
 * @author Денис Висков
 * @version 1.0
 * @since 04.03.2020
 */
public class Analyze {

    /**
     * Method has realizes analyze of changes by two lists
     *
     * @param previous - previous
     * @param current  - current
     * @return - Info information
     */
    public Info diff(List<User> previous, List<User> current) {
        Info info = new Info(0, 0, 0);
        Map<Integer, String> first = previous.stream()
                .collect(Collectors.toMap(i -> i.id, k -> k.name));
        Map<Integer, String> second = current.stream()
                .collect(Collectors.toMap(i -> i.id, k -> k.name));
        if (second.size() > first.size()) {
            info = ifCurrentGreaterPrevious(first, second);
        } else if (first.size() > second.size() || first.size() == second.size()) {
            info = ifPreviousGreaterCurrent(first, second);
        }
        return info;
    }

    /**
     * Method has realizes counting for added and then changed and deleted elements
     *
     * @param first  - first map
     * @param second - second map
     * @return - Info
     */
    private Info ifCurrentGreaterPrevious(Map<Integer, String> first, Map<Integer, String> second) {
        Info result = new Info(0, 0, 0);
        second.forEach((id, name) -> {
            if (!first.containsKey(id)) {
                result.added++;
            } else {
                result.changed = !first.get(id).equals(name) ? ++result.changed : result.changed;
            }
        });
        first.forEach((id, name) -> {
            if (!second.containsKey(id)) {
                result.deleted++;
            }
        });
        return result;
    }

    /**
     * Method has realizes counting for added and then changed and deleted elements
     *
     * @param first  - first map
     * @param second - second map
     * @return - Info
     */
    private Info ifPreviousGreaterCurrent(Map<Integer, String> first, Map<Integer, String> second) {
        Info result = new Info(0, 0, 0);
        first.forEach((id, name) -> {
            if (!second.containsKey(id)) {
                result.deleted++;
            } else {
                result.changed = !second.get(id).equals(name) ? ++result.changed : result.changed;
            }
        });
        second.forEach((id, name) -> {
            if (!first.containsKey(id)) {
                result.added++;
            }
        });
        return result;
    }

    /**
     * Class has realizes model of data User
     */
    public static class User {
        /**
         * ID of User
         */
        private final int id;

        /**
         * Name of User
         */
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id &&
                    name.equals(user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    /**
     * Class has realizes model of data Info
     */
    public static class Info {
        /**
         * Added element
         */
        private int added;

        /**
         * Changed element
         */
        private int changed;

        /**
         * Was deleted
         */
        private int deleted;

        public Info(int added, int changed, int deleted) {
            this.added = added;
            this.changed = changed;
            this.deleted = deleted;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return added == info.added
                    && changed == info.changed
                    && deleted == info.deleted;
        }

        @Override
        public int hashCode() {
            return Objects.hash(added, changed, deleted);
        }
    }
}
