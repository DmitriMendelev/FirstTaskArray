package by.Mendelev.FirstTask.parser;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayParserTest {

    @Test
    public void testStringToIntArrayParser() {
        CustomArrayParser customArrayParser = new CustomArrayParser();
        int[] actual = {1,-2,3};
        int[] expected = customArrayParser.stringToIntArrayParser("1   -2  3");
        assertEquals(actual,expected);
    }
}