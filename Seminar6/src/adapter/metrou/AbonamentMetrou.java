package adapter.metrou;

import java.util.GregorianCalendar;

public class AbonamentMetrou extends Calatorie{
    private GregorianCalendar dataExpirareAbonament;
    public AbonamentMetrou(String numeClient) {
        super(numeClient);
        this.dataExpirareAbonament = new GregorianCalendar();
    }

    private AbonamentMetrou(){}

    @Override
    public boolean estePermisAccesul() {
        return dataExpirareAbonament.before(new GregorianCalendar());
    }
}
