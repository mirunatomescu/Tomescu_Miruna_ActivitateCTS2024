package subiect;

public class Tramvai extends Subiect{

    private int nrTramvai;

    public Tramvai(int nrTramvai) {
        this.nrTramvai = nrTramvai;
    }

    @Override
    public void anuntaPlecare() {
        super.trimiteMesaje("Tramvaiul "+this.nrTramvai +" pleaca!");
    }
}
