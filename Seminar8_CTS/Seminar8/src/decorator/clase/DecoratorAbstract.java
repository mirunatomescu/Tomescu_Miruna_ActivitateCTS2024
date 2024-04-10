package decorator.clase;

public abstract class DecoratorAbstract implements Printabil{
    protected Printabil bilet;

    public DecoratorAbstract(Printabil bilet) {
        this.bilet = bilet;
    }

}
