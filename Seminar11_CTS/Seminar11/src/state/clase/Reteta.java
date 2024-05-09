package state.clase;

public class Reteta {
    private int nrMedicamente;
    private float pret;
    private int nrReteta;
    private Achizitionabil stare;

    public Reteta(int nrMedicamente, int nrReteta, float pret) {
        this.nrMedicamente = nrMedicamente;
        this.nrReteta = nrReteta;
        this.pret = pret;
        this.stare = new Emisa();
    }

    protected void setStare(Achizitionabil stare) {
        this.stare = stare;
    }

    public void cereMedicamente()
    {
        if(this.stare instanceof Emisa)
        {
            System.out.printf("Au fost solicitate %d medicamente, la prețul %.2f în baza rețetei %d.%n", this.nrMedicamente
            , this.pret, this.nrReteta);
            Achizitionabil stare = new Solicitata();
            stare.schimbaStare(this);
        }
        else
        {
            System.out.println("Nu puteți solicita medicamente în baza acestei rețete.");
        }
    }

    public void cumparaMedicamente()
    {
        if(this.stare instanceof Solicitata)
        {
            System.out.printf("Au fost achiziționate %d medicamente, la pretul %.2f în baza rețetei %d.%n", this.nrMedicamente, this.pret, this.nrReteta);
            Achizitionabil stare = new Achizitionata();
            stare.schimbaStare(this);
        }
        else {
            System.out.println("Nu puteți solicita medicamente în baza acestei rețete.");
        }
    }

    public void respingeReteta()
    {
        if(this.stare instanceof Solicitata)
        {
            System.out.println("Nu avem aceste medicamente. Ne pare rău!");
            Achizitionabil stare = new Emisa();
            stare.schimbaStare(this);
        }
        else {
            System.out.println("Reteta nu a fost solicitată!");
        }
    }


}
