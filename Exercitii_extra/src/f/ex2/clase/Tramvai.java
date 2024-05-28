package f.ex2.clase;

public class Tramvai extends Transport{
    public Tramvai(String numeSofer, int nrLinie) {
        super(numeSofer, nrLinie);
    }

    Tramvai()
    {

    }
    @Override
    public void detalii() {
        System.out.printf("Tramvaiul de pe linia %d are vatmanul %s%n", nrLinie, numeSofer);
    }

    @Override
    public Transport cloneaza() {
        Tramvai t = new Tramvai();
        t.nrLinie = this.nrLinie;
        t.numeSofer = this.numeSofer;
        return t;
    }
}