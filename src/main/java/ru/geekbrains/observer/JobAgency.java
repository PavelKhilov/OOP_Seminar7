package ru.geekbrains.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Агентство по поиску сотрудников
 */

public class JobAgency implements Publisher{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     * @param nameCompany
     * @param salary
     */
    @Override
    public void sendOffer(String nameCompany, double salary, String typeVacancy) {
        for (Observer observer : observers) {
            observer.receiveOffer(nameCompany, salary, typeVacancy);
        }
    }
}
