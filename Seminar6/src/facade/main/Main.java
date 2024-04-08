package facade.main;

import facade.autobuz.Autobuz;
import facade.autobuz.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        System.out.println("Fara Facade");
        autobuz.punePeLiberUsaDinFata();
        autobuz.punePeLiberUsaDinMijloc();
        autobuz.punePeLiberUsaDinSpate();
        autobuz.deschideUsaDinFata();
        autobuz.deschideUsaDinMijloc();
        autobuz.deschideUsaDinSpate();
        System.out.printf("%nCu Facade%n%n");
        FacadeAutobuz facadeAutobuz = new FacadeAutobuz(autobuz);
        facadeAutobuz.elibereazaToateUsile();
        facadeAutobuz.deschideToateUsile();
    }
}
