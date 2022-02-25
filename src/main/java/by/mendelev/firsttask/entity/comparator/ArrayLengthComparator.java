package by.mendelev.firsttask.entity.comparator;

import by.mendelev.firsttask.entity.CustomArray;

import java.util.Comparator;

public class ArrayLengthComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray customArray1, CustomArray customArray2) {
        return customArray1.getIntArray().length - customArray2.getIntArray().length;
    }
}
