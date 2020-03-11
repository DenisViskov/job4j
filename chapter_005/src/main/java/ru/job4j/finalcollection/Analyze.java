package ru.job4j.finalcollection;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
        int wasAdded = 0;
        int wasChanged = 0;
        int wasDeleted = 0;
        if (current.size() > previous.size()) {
            wasAdded = current.size() - previous.size();
        } else if (current.size() < previous.size()) {
            wasDeleted = previous.size() - current.size();
        } else {
            Iterator<User> prevIt = previous.iterator();
            Iterator<User> currIt = current.iterator();
            while (prevIt.hasNext() || currIt.hasNext()) {
                Optional<User> first = prevIt.hasNext()
                        ? Optional.of(prevIt.next()) : Optional.ofNullable(null);
                Optional<User> second = currIt.hasNext()
                        ? Optional.of(currIt.next()) : Optional.ofNullable(null);
                wasAdded += wasAdded(first, second);
                wasChanged += wasChanged(first, second);
                wasDeleted += wasDeleted(first, second);
            }
        }
        return new Info(wasAdded, wasChanged, wasDeleted);
    }

    /**
     * Method has realizes looking for changes of added elements between two lists
     *
     * @param first  - previous
     * @param second - current
     * @return - integer
     */
    private int wasAdded(Optional<User> first, Optional<User> second) {
        int result = 0;
        if (first.isPresent() && second.isPresent()) {
            result = first.get().id != second.get().id ? ++result : 0;
        } else {
            result++;
        }
        return result;
    }

    /**
     * Method has realizes looking for changes of deleted elements between two lists
     *
     * @param first  - previous
     * @param second - current
     * @return - integer
     */
    private int wasDeleted(Optional<User> first, Optional<User> second) {
        int result = 0;
        if (first.isPresent() && second.isPresent()) {
            result = first.get().id != second.get().id ? ++result : 0;
        } else {
            result++;
        }
        return result;
    }

    /**
     * Method has realizes looking for changes of names among elements
     *
     * @param first  - previous
     * @param second - current
     * @return - integer
     */
    private int wasChanged(Optional<User> first, Optional<User> second) {
        int result = 0;
        if (first.isPresent() && second.isPresent()) {
            result = first.get().id == second.get().id
                    && !first.get().name.equals(second.get().name) ? ++result : 0;
        }
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
