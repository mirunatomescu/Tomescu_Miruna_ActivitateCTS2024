package decorator.clase;

import java.util.Date;

public class BiletAniversar extends DecoratorAbstract{
    public BiletAniversar(Printabil bilet) {
        super(bilet);
        bilet.reducere();
    }

    @Override
    public void reducere() {
        bilet.setPret(0);
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
        System.out.printf("La mulți ani, STB %d!%n", new Date().getYear()+1900);
    }
}
