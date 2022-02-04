package by.Mendelev.FirstTask.parser;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayParser {
    private static final Logger log = LogManager.getLogger();

    public int[] stringToIntArrayParser(String parsedString) {
        String[] numbersStr = parsedString.split("\\s+");
        int[] integers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            integers[i] = Integer.parseInt(numbersStr[i]);
        }
        log.log(Level.INFO,"String data is parsed to integer array");
        return integers;
    }
}
