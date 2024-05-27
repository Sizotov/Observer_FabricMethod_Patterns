package com.example.HWPatterns.observer;

import com.example.HWPatterns.interfaces.iObserver;

public class MovieStar implements iObserver {

    String name;

    public MovieStar (String name){
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, double fee) {
        if (fee < 1000000){
            System.out.println(String.format("MovieStar %s: Fuck off! I am waiting for the better job! (company, fee) = %s, %f%n", name, nameCompany, fee));
        }
        else{
            System.out.println(String.format("MovieStar %s: Yuhuu! I am ready for this job! (company, fee) = %s, %f%n", name, nameCompany, fee));
        }
    }
}
