package f.ex1.main;

import f.ex1.clase.FabricaTransport;
import f.ex1.clase.TipTransport;
import f.ex1.clase.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transport autobuz = FabricaTransport.getTransport(TipTransport.AUTOBUZ, "Gigi Frone", 102);
        Transport troleibuz = FabricaTransport.getTransport(TipTransport.TROLEIBUZ, "Miruna Micșunea", 116);
        Transport tramvai = FabricaTransport.getTransport(TipTransport.TRAMVAI, "Andrei Popa", 1);
        List<Transport> transporturi = new ArrayList<>(List.of(autobuz, tramvai, troleibuz));
        transporturi.forEach(Transport::detalii);
    }
}
