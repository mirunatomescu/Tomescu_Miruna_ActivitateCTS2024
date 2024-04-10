package decorator.main;

import decorator.clase.*;

public class Main {
    public static void printeaza(Printabil p)
    {
        p.printare();
    }
    public static void main(String[] args) {
        Printabil bilet = new Bilet(10.5f, "B8732264");
        printeaza(bilet);
        DecoratorAbstract biletSarbatori = new BiletSarbatori(bilet);
        printeaza(biletSarbatori);
        DecoratorAbstract biletAniversar = new BiletAniversar(bilet);
        printeaza(biletAniversar);
        DecoratorAbstract biletAniversarDePaste = new BiletAniversar(biletSarbatori);
        biletAniversarDePaste.reducere();
    }
}
