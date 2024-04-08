package adapter.autobuz;

import adapter.metrou.Calatorie;

public class AdapterMetrou extends CardStb{
    private Calatorie calatorie;

    private AdapterMetrou(){
    }

    public AdapterMetrou(Calatorie calatorie)
    {
        super(calatorie.getNumeClient(), null);
        this.calatorie = calatorie;
    }

    @Override
    public void validareCard() {
        if(calatorie.estePermisAccesul())
        {
            System.out.println("Călătorie plăcută!");
        }
        else
        {
            System.out.println("Fonduri insuficiente!");
        }
    }
}
