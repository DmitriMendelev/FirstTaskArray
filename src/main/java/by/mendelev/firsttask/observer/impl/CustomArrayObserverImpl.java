package by.mendelev.firsttask.observer.impl;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.entity.CustomArrayStatistics;
import by.mendelev.firsttask.entity.Warehouse;
import by.mendelev.firsttask.observer.CustomArrayEvent;
import by.mendelev.firsttask.observer.CustomArrayObserver;
import by.mendelev.firsttask.service.CustomMath;
import by.mendelev.firsttask.service.impl.CustomMathImpl;

public class CustomArrayObserverImpl implements CustomArrayObserver {


    @Override
    public void changeElement(CustomArrayEvent event) {
        CustomArray customArray = event.getSource();
        CustomMath customMath = CustomMathImpl.getInstance();
        int max = customMath.findMax(customArray);
        int min = customMath.findMin(customArray);
        double average = customMath.findAverage(customArray);
        CustomArrayStatistics customArrayStatistics = new CustomArrayStatistics(min, max, average);
        String arrayId = customArray.getId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.replace(arrayId, customArrayStatistics);
    }
}
