package chainofresponsibility;

public class Validator {
    private Platitor platitor;

    public Validator() {
        Platitor cardBancar = new CardBancar(1f);
        Platitor cardCalatorii = new CardCalatorii(1);
        Platitor telefon = new SMS(1f);
        Platitor controlor = new Controlor();

        this.platitor = cardBancar;
        cardBancar.setSuccesor(telefon);
        telefon.setSuccesor(cardCalatorii);
        cardCalatorii.setSuccesor(controlor);
    }

    public void valideazaCalatoria(float suma)
    {
        this.platitor.plateste(suma);
    }
}
