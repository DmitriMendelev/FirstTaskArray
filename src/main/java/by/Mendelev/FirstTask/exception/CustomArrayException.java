package by.Mendelev.FirstTask.exception;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayException extends Exception {
    private static final Logger log = LogManager.getLogger();

    public boolean showCustomArrayException(){
       log.log(Level.ERROR,"CustomArrayException Error");
        return false;
    }
}
