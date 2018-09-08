package com.kodilla.patterns2.observer.homework;

public interface ObservableStudent {

    void registerObserver(ObserverMentor observerMentor);
    void notifyObservers();
    void removeObserver(ObserverMentor observerMentor);
}
