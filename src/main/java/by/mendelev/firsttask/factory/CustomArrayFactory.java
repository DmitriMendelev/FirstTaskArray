package by.mendelev.firsttask.factory;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.exception.CustomArrayException;


public interface CustomArrayFactory {

    CustomArray createCustomArray(int[] intArray) throws CustomArrayException;
}
