package by.Mendelev.FirstTask.creator;

import by.Mendelev.FirstTask.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayCreator extends CustomArray {
    private static final Logger log = LogManager.getLogger();

    public int[] createdCustomArray(int[] array){
        CustomArray customArray = new CustomArrayCreator();
        customArray.setArray(array);
        log.log(Level.INFO,"Created CustomArray object");
        return customArray.getArray();
    }
}
