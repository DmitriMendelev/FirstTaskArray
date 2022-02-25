package by.mendelev.firsttask.repository.impl;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.repository.Specification;
import by.mendelev.firsttask.service.impl.CustomMathImpl;

public class ArrayExactAverageValueSpecification implements Specification {
    private final double averageValue;

    public ArrayExactAverageValueSpecification(double averageValue) {
        this.averageValue = averageValue;
    }

    @Override
    public boolean specify(CustomArray item) {
        return averageValue == CustomMathImpl.getInstance().findAverage(item);
    }
}

