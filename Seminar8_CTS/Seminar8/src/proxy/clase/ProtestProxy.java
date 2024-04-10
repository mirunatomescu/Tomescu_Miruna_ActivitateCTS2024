package proxy.clase;

import java.util.ArrayList;
import java.util.List;

public class ProtestProxy implements Opritor{
    List<String> statiiInterzise;
    private Opritor autobuz;

    public ProtestProxy(Opritor autobuz) {
        this.autobuz = autobuz;
        statiiInterzise = new ArrayList<>();
    }

    @Override
    public void opresteInStatie(String statie) {
        if(statiiInterzise.contains(statie)){
            System.out.printf("Autobuzul %d nu poate opri in %s din cauza protestului prezent%n", getNrAutobuz(), statie);}
        else
        {
            autobuz.opresteInStatie(statie);
        }
    }

    public void adaugaStatie(String statie)
    {
        statiiInterzise.add(statie);
    }
    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }
}
