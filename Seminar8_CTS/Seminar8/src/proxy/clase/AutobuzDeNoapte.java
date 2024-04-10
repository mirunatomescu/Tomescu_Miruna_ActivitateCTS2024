package proxy.clase;

public class AutobuzDeNoapte implements Opritor{
    private Opritor autobuz;

    public AutobuzDeNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(String statie) {
        if(autobuz.getNrCalatori() > 0) {
            autobuz.opresteInStatie(statie);
        }
        else System.out.printf("Autobuzul %d nu opreste in statis %s%n", autobuz.getNrAutobuz(), statie);
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }


}
