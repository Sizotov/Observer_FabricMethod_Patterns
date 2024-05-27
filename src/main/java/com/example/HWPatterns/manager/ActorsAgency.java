package com.example.HWPatterns.manager;

import com.example.HWPatterns.interfaces.iObserver;
import com.example.HWPatterns.interfaces.iPublisher;

import java.util.ArrayList;
import java.util.List;

public class ActorsAgency implements iPublisher {

    List<iObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(iObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(iObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String nameCompany, double fee) {
        for (iObserver observer : observers){
            observer.receiveOffer(nameCompany, fee);
        }
    }
}
