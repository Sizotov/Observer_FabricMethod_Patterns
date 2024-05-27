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

        // Создание развлекательных компаний
        EntertainmentCompany netflix = new EntertainmentCompany(actorsAgency, "Netflix", 5000000);
        EntertainmentCompany columbiaPictures = new EntertainmentCompany(actorsAgency, "Columbia Pictures", 100000);

        // Создание актеров
        MovieStar depp = new MovieStar("Depp");
    	Actor schwimmer= new Actor("Schwimmer");
    	AspiringActor lee = new AspiringActor("Lee");

        // Регистрация актеров в актерском агентстве
        actorsAgency.registerObserver(depp);
        actorsAgency.registerObserver(schwimmer);
        actorsAgency.registerObserver(lee);

        // Запрос актеров
        for (double i = 0; i < 5; i++) {
            netflix.needActor();
            columbiaPictures.needActor();
        }
    }
}

