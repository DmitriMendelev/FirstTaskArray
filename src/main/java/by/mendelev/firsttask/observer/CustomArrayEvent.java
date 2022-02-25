package by.mendelev.firsttask.observer;

import by.mendelev.firsttask.entity.CustomArray;
import by.mendelev.firsttask.entity.CustomArrayAbstract;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {
    private static String message;


    public CustomArrayEvent(CustomArrayAbstract source) {
        super(source);
    }

    public CustomArrayEvent(CustomArrayAbstract source, String message) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }
}
