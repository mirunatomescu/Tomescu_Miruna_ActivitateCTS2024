package strategy;

public class SMS implements Platitor{
    @Override
    public void plateste(float suma) {
        System.out.printf("S-a efectuat plata în valoare de %.2f prin SMS.%n", suma);
    }
}
