package main;

import observer.Client;
import strategy.CardBancar;
import strategy.SMS;
import strategy.Validator;
import subiect.Autobuz;
import subiect.Subiect;
import subiect.Tramvai;

public class Main {
    public static void main(String[] args) {
        // STRATEGY
        Validator validator = new Validator();
        validator.setModPlata(new CardBancar());
        validator.valideazaCalatorie(20f);
        validator.setModPlata(new SMS());
        validator.valideazaCalatorie(13f);

        // CHAIN OF RESPONSIBILITY

        chainofresponsibility.Validator validator1 = new chainofresponsibility.Validator();
        validator1.valideazaCalatoria(1);
        validator1.valideazaCalatoria(1);
        validator1.valideazaCalatoria(1);
        validator1.valideazaCalatoria(10);

        // OBSERVER

        Client client = new Client("Gabi");
        Client client1 = new Client("Andrei");
        Subiect tramvai = new Tramvai(41);
        tramvai.abonareObservable(client);
        tramvai.abonareObservable(client1);
        tramvai.anuntaPlecare();
        tramvai.dezabonareObservable(client);
        Client client3 = new Client("Liviu");
        tramvai.abonareObservable(client3);
        tramvai.anuntaPlecare();
        tramvai.trimiteMesaje("Plecam!");

        Subiect autobuz = new Autobuz();
        autobuz.abonareObservable(client);
        autobuz.abonareObservable(client3);
        autobuz.anuntaPlecare();
    }
}
