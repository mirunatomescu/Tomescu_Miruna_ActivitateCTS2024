package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzDeNoapte;
import proxy.clase.Opritor;
import proxy.clase.ProtestProxy;

public class Main {
    public static void main(String[] args) {
        Opritor autobuzDeNoapte = new AutobuzDeNoapte(new Autobuz(10, 102, "Gabriel"));
        autobuzDeNoapte.opresteInStatie("Piata Romana");

        ProtestProxy protest = new ProtestProxy(autobuzDeNoapte);
        protest.adaugaStatie("Piata Romana");
        protest.opresteInStatie("Piata Romana");
    }
}
