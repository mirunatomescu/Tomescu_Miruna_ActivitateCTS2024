package adapter.autobuz;

import java.util.GregorianCalendar;

public class AbonamentCardCalatorii extends CardStb{
    private GregorianCalendar dataExpirareAbonament;
    public AbonamentCardCalatorii(String numeClient, String cnpClient) {
        super(numeClient, cnpClient);
        this.dataExpirareAbonament = new GregorianCalendar();
    }

    private AbonamentCardCalatorii(){}

    @Override
    public void validareCard() {
        if(this.dataExpirareAbonament.before(new GregorianCalendar()))
            System.out.println("Călătorie plăcută!");
        else
            System.out.println("Abonamentul a expirat!");
    }
}
