package by.mendelev.firsttask.repository.impl;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.repository.Specification;

public class ArrayLengthSpecification implements Specification {
    private final int minLength;
    private final int maxLength;

    public ArrayLengthSpecification(int maxLength) {
        this.maxLength = maxLength;
        this.minLength = 0;
    }

    public ArrayLengthSpecification(int minLength, int maxLength) {
        this.maxLength = maxLength;
        this.minLength = minLength;
    }

    @Override
    public boolean specify(CustomArray item) {
        return (item.getIntArray().length >= minLength && item.getIntArray().length < maxLength);
    }
}
