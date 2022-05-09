package a02.observer_pattern.subject;


import a02.observer_pattern.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
