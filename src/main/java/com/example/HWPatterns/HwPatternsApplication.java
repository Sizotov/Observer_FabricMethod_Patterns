package com.example.HWPatterns;


import com.example.HWPatterns.clients.EntertainmentCompany;
import com.example.HWPatterns.interfaces.iPublisher;
import com.example.HWPatterns.manager.ActorsAgency;
import com.example.HWPatterns.observer.Actor;
import com.example.HWPatterns.observer.AspiringActor;
import com.example.HWPatterns.observer.MovieStar;

public class HwPatternsApplication {

    public static void main(String[] args) throws Exception {

        iPublisher actorsAgency = new ActorsAgency();

        EntertainmentCompany netflix = new EntertainmentCompany(actorsAgency, "Netflix", 5000000);
        EntertainmentCompany columbiaPictures = new EntertainmentCompany(actorsAgency, "Columbia Pictures", 100000);

        MovieStar depp = new MovieStar("Depp");
    	Actor schwimmer= new Actor("Schwimmer");
    	AspiringActor lee = new AspiringActor("Lee");

        actorsAgency.registerObserver(depp);
        actorsAgency.registerObserver(schwimmer);
        actorsAgency.registerObserver(lee);

    for (double i = 0; i < 5; i++) {
        netflix.needActor();
        columbiaPictures.needActor();
    }
}

}

