package adapter.metrou;

public abstract class Calatorie {
    protected String numeClient;

    public Calatorie(String numeClient) {
        this.numeClient = numeClient;
    }

    protected Calatorie(){}

    public String getNumeClient() {
        return numeClient;
    }

    public abstract boolean estePermisAccesul();
}
