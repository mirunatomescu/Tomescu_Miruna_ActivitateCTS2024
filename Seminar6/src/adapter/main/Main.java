package adapter.main;

import adapter.autobuz.AdapterMetrou;
import adapter.autobuz.CardStb;
import adapter.metrou.BiletMetrou;
import adapter.metrou.Calatorie;

public class Main {
    public static void validareIntrareMetrou(Calatorie calatorie)
    {
        if(calatorie.estePermisAccesul())
        {
            System.out.println("Călătorie plăcută!");
        }
        else {
            System.out.println("Sold călătorii insuficient!");
        }
    }
    public static void validareUrcareStb(CardStb card)
    {
        card.validareCard();
    }
    public static void main(String[] args) {
        Calatorie biletMetrou = new BiletMetrou("Manole", 3);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);
        CardStb biletAutobuz = new AdapterMetrou(biletMetrou);
        validareUrcareStb(biletAutobuz);
    }
}
