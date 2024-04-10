package decorator.clase;

import java.util.Date;

public class BiletSarbatori extends DecoratorAbstract{
    static float DISCOUNT = 10f;
    public BiletSarbatori(Printabil bilet) {
        super(bilet);
    }

    @Override
    public void reducere() {
        bilet.setPret((100-DISCOUNT)*bilet.getPret()/100);
    }

    @Override
    public void setPret(float pret) {
        super.bilet.setPret(pret);
    }

    @Override
    public float getPret() {
        return super.bilet.getPret();
    }

    @Override
    public void printare() {
        super.bilet.printare();
        System.out.printf("La mulți ani, %d!%n", new Date().getYear()+1900);
    }
}
