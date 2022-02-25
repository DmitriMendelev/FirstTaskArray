package by.mendelev.firsttask.reader;

import by.mendelev.firsttask.exception.CustomArrayException;

import java.util.List;

public interface CustomFileReader {
    List<String> readLinesFromFile(String fileName) throws CustomArrayException;
}
