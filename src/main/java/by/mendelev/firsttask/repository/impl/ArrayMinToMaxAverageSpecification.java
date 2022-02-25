package by.mendelev.firsttask.repository.impl;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.repository.Specification;
import by.mendelev.firsttask.service.CustomMath;
import by.mendelev.firsttask.service.impl.CustomMathImpl;

public class ArrayMinToMaxAverageSpecification implements Specification {
    private final double minValue;
    private final double maxValue;

    public ArrayMinToMaxAverageSpecification(double minValue, double maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public boolean specify(CustomArray item) {
        CustomMath service = CustomMathImpl.getInstance();
        return (minValue <= service.findAverage(item) && maxValue > service.findAverage(item));
    }
}
