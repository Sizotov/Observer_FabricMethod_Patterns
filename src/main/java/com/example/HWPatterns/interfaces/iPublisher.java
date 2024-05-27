package com.example.HWPatterns.interfaces;

public interface iPublisher {
    void registerObserver(iObserver observer);
    void removeObserver(iObserver observer);
    void sendOffer(String nameCompany, double fee);
}
