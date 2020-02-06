package ru.job4j.generic;

/**
 * Class has realize interface of Store
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.02.2020
 */
public class UserStore extends AbstractStore{
    public UserStore(SimpleArray<Base> container) {
        super(container);
    }
}
