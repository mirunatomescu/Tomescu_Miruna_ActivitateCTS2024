package f.ex2.clase;

public abstract class Transport implements Copiabil {
    protected int nrLinie;
    protected String numeSofer;
    Transport()
    {

    }
    Transport(String numeSofer, int nrLinie)
    {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public abstract void detalii();
}
