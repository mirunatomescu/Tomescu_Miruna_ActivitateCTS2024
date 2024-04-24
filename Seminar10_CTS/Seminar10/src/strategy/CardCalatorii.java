package strategy;

public class CardCalatorii implements Platitor{
    @Override
    public void plateste(float suma) {
        System.out.printf("S-a efectuat plata pentru călătoria în valoare de %.2f cu cardul de călătorii%n", suma);
    }
}
