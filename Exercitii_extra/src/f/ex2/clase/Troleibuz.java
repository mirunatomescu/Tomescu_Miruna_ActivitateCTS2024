package f.ex2.clase;

public class Troleibuz extends Transport{
    public Troleibuz(String numeSofer, int nrLinie) {
        super(numeSofer, nrLinie);
    }

    Troleibuz()
    {

    }
    @Override
    public void detalii() {
        System.out.printf("Troleibuzul de pe linia %d are soferul %s%n", nrLinie, numeSofer);
    }

    @Override
    public Transport cloneaza() {
        Troleibuz t = new Troleibuz();
        t.nrLinie = this.nrLinie;
        t.numeSofer = this.numeSofer;
        return t;
    }
}
