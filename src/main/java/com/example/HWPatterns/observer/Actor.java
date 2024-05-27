package com.example.HWPatterns.observer;

import com.example.HWPatterns.interfaces.iObserver;

import java.util.Random;

public class Actor implements iObserver {

    private final String name;

    public Actor(String name){

        this.name = name;
    }
    @Override
    public void receiveOffer(String nameCompany, double fee) {
        if (new Random().nextBoolean()){
            System.out.println(String.format("Actor %s: I accept the offer! (company, fee) = %s, %f%n", name, nameCompany, fee));
        }
        else{
            System.out.println(String.format("Actor %s: Shit! I don't accept the offer! (company, fee) = %s, %f%n", name, nameCompany, fee));
        }
    }
}
