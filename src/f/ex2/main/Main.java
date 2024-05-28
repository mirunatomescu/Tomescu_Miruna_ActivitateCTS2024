package f.ex2.main;

import f.ex2.clase.Autobuz;
import f.ex2.clase.Transport;

public class Main {
    public static void main(String[] args) {
        Transport soferitza = new Autobuz("Marta", 102);
        Transport soferoi = soferitza.cloneaza();
        soferoi.setNrLinie(116);
        soferoi.setNumeSofer("Ionel");
        soferitza.detalii();
        soferoi.detalii();
    }
}
