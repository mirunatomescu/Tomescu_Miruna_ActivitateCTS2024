package prototype;

import java.util.ArrayList;
import java.util.List;

public class Client implements AbstractPrototype{
    private String nume;
    private int varsta;
    private List<String> listaAccesorii;

    private Client() {

    }

    @Override
    public AbstractPrototype copiaza() {
        Client client = new Client();
        client.nume = this.nume;
        client.varsta = this.varsta;
        client.listaAccesorii = new ArrayList<>();
        client.listaAccesorii.addAll(this.listaAccesorii);
        return client;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", listaAccesorii=").append(listaAccesorii);
        sb.append('}');
        return sb.toString();
    }

    public void setVarsta(int varsta) {
        if (varsta < 14)
            throw new IllegalArgumentException("Minor");
        this.varsta = varsta;
    }

    public Client(String nume, int varsta, List<String> listaAccesorii) {
        this.nume = nume;
        if(varsta < 14)
            throw new IllegalArgumentException("Minor");
        this.varsta = varsta;
        if(listaAccesorii.size() > 5)
            throw new IllegalArgumentException("Prea multe accesorii");
        this.listaAccesorii = listaAccesorii;
    }
}
