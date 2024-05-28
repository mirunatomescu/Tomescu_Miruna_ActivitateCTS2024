package f.ex1.clase;

public abstract class FabricaTransport{
    public static Transport getTransport(TipTransport tipTransport, String numeSofer, int nrLinie)
    {
        switch (tipTransport) {
            case AUTOBUZ -> { return new Autobuz(numeSofer, nrLinie);
            }
            case TRAMVAI -> { return new Tramvai(numeSofer, nrLinie);
            }
            case TROLEIBUZ -> { return new Troleibuz(numeSofer, nrLinie);
            }
            case null, default -> throw new IllegalArgumentException("Tip invalid!");
        }
    }
}
