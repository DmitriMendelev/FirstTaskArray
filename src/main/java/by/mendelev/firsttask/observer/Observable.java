package by.mendelev.firsttask.observer;


public interface Observable {
    void attach(CustomArrayObserver observer);

    void detach(CustomArrayObserver observer);

    void notifyObservers();
}
