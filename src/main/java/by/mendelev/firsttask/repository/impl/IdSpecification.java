package by.mendelev.firsttask.repository.impl;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.repository.Specification;

public class IdSpecification implements Specification {
    private final String id;

    public IdSpecification(String id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray item) {
        return item.getId() == id;
    }
}
