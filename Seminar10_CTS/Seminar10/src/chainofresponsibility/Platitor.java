package chainofresponsibility;

public abstract class Platitor {
    protected Platitor succesor;
    public abstract void plateste(float suma);
    public void setSuccesor(Platitor p)
    {
        this.succesor = p;
    }
}
