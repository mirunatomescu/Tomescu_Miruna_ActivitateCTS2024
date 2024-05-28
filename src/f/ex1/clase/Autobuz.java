package f.ex1.clase;

public class Autobuz extends Transport{
    Autobuz(String numeSofer, int nrLinie) {
        super(numeSofer, nrLinie);
    }

    @Override
    public void detalii() {
        System.out.printf("Autobuzul de pe linia %d are soferul %s%n", nrLinie, numeSofer);
    }
}
