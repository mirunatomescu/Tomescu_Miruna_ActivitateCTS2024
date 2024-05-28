package f.ex2.clase;

public class Autobuz extends Transport{
    public Autobuz(String numeSofer, int nrLinie) {
        super(numeSofer, nrLinie);
    }

    Autobuz(){
        super();
    }
    @Override
    public void detalii() {
        System.out.printf("Autobuzul de pe linia %d are soferul %s%n", nrLinie, numeSofer);
    }

    @Override
    public Transport cloneaza() {
        Autobuz a = new Autobuz();
        a.nrLinie = this.nrLinie;
        a.numeSofer = this.numeSofer;
        return a;
    }
}
