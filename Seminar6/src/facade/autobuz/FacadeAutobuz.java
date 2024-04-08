package facade.autobuz;

public class FacadeAutobuz {
    private Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void deschideToateUsile()
    {
        this.autobuz.deschideUsaDinFata();
        this.autobuz.deschideUsaDinMijloc();
        this.autobuz.deschideUsaDinSpate();
    }
    public void elibereazaToateUsile()
    {
        this.autobuz.punePeLiberUsaDinFata();
        this.autobuz.punePeLiberUsaDinMijloc();
        this.autobuz.punePeLiberUsaDinSpate();
    }
}
