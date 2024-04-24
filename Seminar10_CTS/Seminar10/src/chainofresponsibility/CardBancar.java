package chainofresponsibility;

public class CardBancar extends Platitor {
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float suma) {
        if(this.sold>=suma)
        {
            this.sold-=suma;
            System.out.printf("S-a efectuat plata cu cardul bancar în valoare de %.2f%nSold rămas: %.2f", suma, sold);
        }
        else {super.succesor.plateste(suma);}
    }
}
