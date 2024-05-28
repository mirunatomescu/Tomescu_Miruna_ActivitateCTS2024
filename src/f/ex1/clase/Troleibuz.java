package f.ex1.clase;

public class Troleibuz extends Transport{
    Troleibuz(String numeSofer, int nrLinie) {
        super(numeSofer, nrLinie);
    }

    @Override
    public void detalii() {
        System.out.printf("Troleibuzul de pe linia %d are soferul %s%n", nrLinie, numeSofer);
    }
}
