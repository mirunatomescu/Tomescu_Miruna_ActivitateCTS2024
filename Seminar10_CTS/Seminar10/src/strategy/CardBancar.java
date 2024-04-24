package strategy;

public class CardBancar implements Platitor{
    @Override
    public void plateste(float suma) {
        System.out.printf("S-a efectuat plata în valoare de %.2f cu cardul bancar.%n", suma);
    }
}
