package ru.job4j.generic;

import java.util.NoSuchElementException;

/**
 * Class has realize interface store
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.02.2020
 */
public class AbstractStore implements Store {
    /**
     * Base
     */
    SimpleArray<Base> container;

    public AbstractStore(SimpleArray<Base> container) {
        this.container = container;
    }

    /**
     * Method has realize add in base new model
     *
     * @param model - model
     */
    @Override
    public void add(Base model) {
        this.container.add(model);
    }

    /**
     * Method has realize replace of element in base on the gave ID
     *
     * @param id    - id of element
     * @param model - model
     * @return - true or throw NoSuchElementExeption
     */
    @Override
    public boolean replace(String id, Base model) {
        Base element = findById(id);
        int index = this.container.findIndexOnObject(element);
        this.container.set(index, model);
        return true;
    }

    /**
     * Method has realize delete of element in base on the gave ID
     *
     * @param id - id
     * @return - true or or throw NoSuchElementExeption
     */
    @Override
    public boolean delete(String id) {
        Base element = findById(id);
        int index = this.container.findIndexOnObject(element);
        this.container.remove(index);
        return true;
    }

    /**
     * Method has realize looking for element in base on the gave ID
     *
     * @param id - id
     * @return - found element
     */
    @Override
    public Base findById(String id) {
        for (Base element : this.container) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        throw new NoSuchElementException("Element is not found");
    }
}
