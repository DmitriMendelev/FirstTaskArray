package by.Mendelev.FirstTask.reader;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomFileReaderTest {

    @Test
    public void testGetArrayDataFromResourceFile() {
        CustomFileReader customFileReader = new CustomFileReader();
        String actual = "2   3 8   9";
        String expected = customFileReader.getArrayDataFromResourceFile("data/num.txt");
        assertEquals(actual,expected);
    }
}