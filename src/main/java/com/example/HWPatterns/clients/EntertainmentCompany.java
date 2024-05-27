package com.example.HWPatterns.clients;

import com.example.HWPatterns.interfaces.iPublisher;

import java.util.Random;

public class EntertainmentCompany {
    iPublisher actorsAgency;
    String nameCompany;
    Random rnd;
    double maxFee; //максимальный гонорар

    public EntertainmentCompany(iPublisher actorsAgency, String nameCompany, double maxFee){
        this.actorsAgency = actorsAgency;
        this.nameCompany = nameCompany;
        rnd = new Random();
        this.maxFee = maxFee;
    }

    public void needActor(){
        double fee = rnd.nextDouble(maxFee);
        actorsAgency.sendOffer(nameCompany, fee);
    }
}
