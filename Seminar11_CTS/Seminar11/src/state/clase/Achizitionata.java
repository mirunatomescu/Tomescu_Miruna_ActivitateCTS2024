package state.clase;

public class Achizitionata implements Achizitionabil{

    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Achizitionata(){}
}
