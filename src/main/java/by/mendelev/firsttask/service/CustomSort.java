package by.mendelev.firsttask.service;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.exception.CustomArrayException;

public interface CustomSort {
    boolean bubbleSort(CustomArray customArray) throws CustomArrayException;

    boolean selectionSort(CustomArray customArray) throws CustomArrayException;

    boolean insertSort(CustomArray customArray) throws CustomArrayException;

    boolean streamSort(CustomArray customArray) throws CustomArrayException;

}
