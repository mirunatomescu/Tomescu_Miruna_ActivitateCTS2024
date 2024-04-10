package decorator.clase;

public class Bilet implements Printabil {
    private float pret;
    private String cod;

    public Bilet(float pret, String cod) {
        this.pret = pret;
        this.cod = cod;
    }

    @Override
    public void printare() {
        System.out.printf("Biletul %s are pretul %.2f lei%n", cod, pret);
    }

    @Override
    public void reducere() {
        System.out.printf("Biletul %s nu are reducere", cod);
    }

    @Override
    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public float getPret() {
        return pret;
    }
}
