package by.Mendelev.FirstTask.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class CustomFileReader {
    private static final Logger log = LogManager.getLogger();
    private static final String SOURCE_PATH = "src/main/resources/";

  public String getArrayDataFromResourceFile(String fileName) {
      BufferedReader reader = null;
      try {
          reader = new BufferedReader(new FileReader(SOURCE_PATH + fileName));
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }
      String arrayData = null;

      try {
          arrayData = reader.readLine();
      } catch (IOException e) {
          e.printStackTrace();
      }
      log.log(Level.INFO,"String data is read from file");
      return arrayData;
    }

}
