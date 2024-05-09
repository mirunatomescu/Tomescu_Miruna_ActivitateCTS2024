package state.clase;

public class Solicitata implements Achizitionabil{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Solicitata(){}
}
