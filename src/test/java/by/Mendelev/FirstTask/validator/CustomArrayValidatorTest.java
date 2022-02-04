package by.Mendelev.FirstTask.validator;

import by.Mendelev.FirstTask.reader.CustomFileReader;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayValidatorTest {

    @Test
    public void testValidateArrayDataString() {
        String checkedString = "-2 3 -8 9";
        CustomArrayValidator customArrayValidator = new CustomArrayValidator();
        assertTrue(customArrayValidator.validateArrayDataString(checkedString));
    }
}