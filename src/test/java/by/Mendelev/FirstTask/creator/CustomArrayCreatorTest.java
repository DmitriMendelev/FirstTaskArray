package by.Mendelev.FirstTask.creator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayCreatorTest {

    @Test
    public void testCreatedCustomArray() {
        CustomArrayCreator customArrayCreator = new CustomArrayCreator();
        int[] actual = {1,2,3};
        int[] expected = customArrayCreator.createdCustomArray(actual);
        assertEquals(actual,expected);
    }
}