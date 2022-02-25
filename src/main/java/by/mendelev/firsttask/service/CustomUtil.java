package by.mendelev.firsttask.service;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.exception.CustomArrayException;

public interface CustomUtil {
    boolean replace(CustomArray customArray, int index, int value) throws CustomArrayException;

    boolean replaceStream(CustomArray customArray, int index, int value) throws CustomArrayException;

    boolean replaceAll(CustomArray customArray, int find, int valueToReplace) throws CustomArrayException;

    boolean replaceAllStream(CustomArray customArray, int find, int valueToReplace) throws CustomArrayException;
}
