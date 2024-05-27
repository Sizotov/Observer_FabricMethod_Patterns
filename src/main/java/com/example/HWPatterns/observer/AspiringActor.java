package com.example.HWPatterns.observer;

import com.example.HWPatterns.interfaces.iObserver;


public class AspiringActor implements iObserver {
    String name;
    double fee;

    public AspiringActor(String name){
        this.name = name;
        fee = 0;
    }

    // Студент постоянно ищет где лучше
    @Override
    public void receiveOffer(String nameCompany, double fee) {
        if (this.fee < fee) {
            System.out.println(String.format("AspiringActor %s: I need this work! I don’t have any money to pay rent!!! (company, fee) = %s, %f%n", name, nameCompany, fee));
            this.fee = fee;
        }
        else{
            System.out.println(String.format("AspiringActor %s: I got better job! (company, fee) = %s, %f%n", name, nameCompany, fee));
        }
    }
}
