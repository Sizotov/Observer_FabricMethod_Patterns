package com.example.HWPatterns.manager;

import com.example.HWPatterns.interfaces.iObserver;
import com.example.HWPatterns.interfaces.iPublisher;

import java.util.ArrayList;
import java.util.List;

public class ActorsAgency implements iPublisher {
    // Создание списка наблюдателей
    List<iObserver> observers = new ArrayList<>();
    // Метод для регистрации наблюдателя
    @Override
    public void registerObserver(iObserver observer) {
        observers.add(observer);
    }
    // Метод для удаления наблюдателя
    @Override
    public void removeObserver(iObserver observer) {
        observers.remove(observer);
    }
    // Метод для отправки предложения всем зарегистрированным наблюдателям
    @Override
    public void sendOffer(String nameCompany, double fee) {
        for (iObserver observer : observers){
            // Отправка предложения каждому наблюдателю
            observer.receiveOffer(nameCompany, fee);
        }
    }
}
