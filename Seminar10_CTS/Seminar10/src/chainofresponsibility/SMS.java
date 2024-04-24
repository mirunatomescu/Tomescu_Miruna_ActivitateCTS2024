package chainofresponsibility;

public class SMS extends Platitor {
    private float credit;

    public SMS(float credit) {
        this.credit = credit;
    }

    @Override
    public void plateste(float suma) {
        if(this.credit>=suma)
        {
            this.credit-=suma;
            System.out.printf("S-a efectuat plata în valoare de %.2f prin SMS. Credit ramas: %.2f%n", suma, this.credit);
        }
        else {
            super.succesor.plateste(suma);
        }
    }
}
