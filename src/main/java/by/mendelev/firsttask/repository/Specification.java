package by.mendelev.firsttask.repository;

import by.mendelev.firsttask.entity.CustomArray;

@FunctionalInterface
public interface Specification {
    boolean specify(CustomArray item);
}
