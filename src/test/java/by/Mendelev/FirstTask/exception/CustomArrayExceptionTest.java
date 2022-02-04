package by.Mendelev.FirstTask.exception;

import by.Mendelev.FirstTask.creator.CustomArrayCreator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayExceptionTest {

    @Test
    public void testShowCustomArrayException() {
        CustomArrayException customArrayException = new CustomArrayException();
        assertFalse(customArrayException.showCustomArrayException());
    }
}