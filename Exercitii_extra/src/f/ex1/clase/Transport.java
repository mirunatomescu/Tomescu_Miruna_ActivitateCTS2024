package f.ex1.clase;

public abstract class Transport {
    protected int nrLinie;
    protected String numeSofer;
    Transport(String numeSofer, int nrLinie)
    {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
    }
    public abstract void detalii();
}
