package chainofresponsibility;

public class CardCalatorii extends Platitor {
    private int nrCalatorii;

    public CardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(float suma) {
        if(this.nrCalatorii > 0)
        {
            this.nrCalatorii--;
            System.out.printf("S-a efectuat plata prin cardul de călătorii. Numărul de călătorii rămase: %d%n", this.nrCalatorii);
        }
        else
        {
            super.succesor.plateste(suma);
        }
    }
}
