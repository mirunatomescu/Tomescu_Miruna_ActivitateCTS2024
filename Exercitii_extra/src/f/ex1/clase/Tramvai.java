package f.ex1.clase;

public class Tramvai extends Transport{
    Tramvai(String numeSofer, int nrLinie) {
        super(numeSofer, nrLinie);
    }

    @Override
    public void detalii() {
        System.out.printf("Tramvaiul de pe linia %d are vatmanul %s%n", nrLinie, numeSofer);
    }
}
