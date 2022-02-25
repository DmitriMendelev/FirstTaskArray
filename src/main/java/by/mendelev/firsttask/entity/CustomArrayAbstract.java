package by.mendelev.firsttask.entity;

import by.mendelev.firsttask.observer.CustomArrayEvent;
import by.mendelev.firsttask.observer.CustomArrayObserver;
import by.mendelev.firsttask.observer.Observable;
import by.mendelev.firsttask.util.GeneratorId;

import java.util.ArrayList;
import java.util.List;

public abstract class CustomArrayAbstract implements Observable {
    protected final String id;
    private List<CustomArrayObserver> listObservers = new ArrayList<>();

    {
        id = GeneratorId.getInstance().getId();
    }

    @Override
    public void attach(CustomArrayObserver observer) {
        listObservers.add(observer);
    }

    @Override
    public void detach(CustomArrayObserver observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (!listObservers.isEmpty()) {
            for (CustomArrayObserver observer : listObservers) {
                observer.changeElement(new CustomArrayEvent(this));
            }
        }
    }

}
