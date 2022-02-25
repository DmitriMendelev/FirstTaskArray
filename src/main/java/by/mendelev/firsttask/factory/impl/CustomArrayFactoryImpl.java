package by.mendelev.firsttask.factory.impl;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.entity.CustomArrayStatistics;
import by.mendelev.firsttask.entity.Warehouse;
import by.mendelev.firsttask.exception.CustomArrayException;
import by.mendelev.firsttask.factory.CustomArrayFactory;
import by.mendelev.firsttask.observer.CustomArrayObserver;
import by.mendelev.firsttask.observer.impl.CustomArrayObserverImpl;
import by.mendelev.firsttask.repository.CustomArrayRepository;
import by.mendelev.firsttask.service.CustomMath;
import by.mendelev.firsttask.service.impl.CustomMathImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayFactoryImpl implements CustomArrayFactory {
    private static final Logger logger = LogManager.getLogger();
    private static final CustomArrayFactoryImpl instance = new CustomArrayFactoryImpl();

    private CustomArrayFactoryImpl() {
    }

    public static CustomArrayFactoryImpl getInstance() {
        return instance;
    }

    @Override
    public CustomArray createCustomArray(int[] intArray) throws CustomArrayException {
        if (intArray == null || intArray.length == 0) {
            logger.log(Level.ERROR, "IntArray = null, or intArray length = 0");
            throw new CustomArrayException("IntArray = null, or intArray length = 0");
        }

        CustomArray customArray;
        customArray = new CustomArray(intArray);
        logger.log(Level.INFO, "New CustomArray is created");
        addToRepository(customArray);
        addToWarehouse(customArray);
        addObserverToNewCustomArray(customArray);
        return customArray;
    }

    private void addObserverToNewCustomArray(CustomArray customArray) {
        CustomArrayObserver observer = new CustomArrayObserverImpl();
        customArray.attach(observer);
        logger.log(Level.INFO, "Observer is added to new CustomArray");
    }

    private void addToWarehouse(CustomArray customArray) {
        CustomMath customMath = CustomMathImpl.getInstance();
        int max = customMath.findMax(customArray);
        int min = customMath.findMin(customArray);
        double average = customMath.findAverage(customArray);
        CustomArrayStatistics customArrayStatistics = new CustomArrayStatistics(min, max, average);
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(customArray.getId(), customArrayStatistics);
        logger.log(Level.INFO, "New CustomArrayStatistics is added to warehouse");
    }

    private void addToRepository(CustomArray customArray) {
        CustomArrayRepository repository = CustomArrayRepository.getInstance();
        repository.addCustomArray(customArray);
        logger.log(Level.INFO, "New CustomArray is added to repository");
    }
}
