package by.Mendelev.FirstTask.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class CustomArrayValidator {
    private static final Logger log = LogManager.getLogger();
    private static final String ARRAY_PATTERN = "(\\s?-?\\d+\\s?)+";

    public static boolean validateArrayDataString(String checkedString) {
        if (checkedString == null){
            log.error("String data is null");
            return false;
        }
        boolean flag = Pattern.matches(ARRAY_PATTERN, checkedString);
        if (flag) {
            log.log(Level.INFO, "String data is validated");
        } else {
            log.log(Level.INFO, "String data is not validated");
        }
        return flag;
    }
}
