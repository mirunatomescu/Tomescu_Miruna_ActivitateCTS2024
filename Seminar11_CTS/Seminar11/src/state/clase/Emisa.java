package state.clase;

public class Emisa implements Achizitionabil{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Emisa(){}
}
