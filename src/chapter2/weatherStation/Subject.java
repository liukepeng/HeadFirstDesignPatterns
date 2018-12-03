package chapter2.weatherStation;


public interface Subject {
    void regesterObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
