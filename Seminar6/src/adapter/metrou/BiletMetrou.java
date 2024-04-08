package adapter.metrou;

public class BiletMetrou extends Calatorie{

    private int nrCalatorii;
    public BiletMetrou(String numeClient, int nrCalatorii) {
        super(numeClient);
        this.nrCalatorii = nrCalatorii;
    }

    private BiletMetrou(){}

    @Override
    public boolean estePermisAccesul() {
        return --this.nrCalatorii >= 0;
    }
}
