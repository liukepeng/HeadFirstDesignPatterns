package chapter12.combining.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
