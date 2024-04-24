package chainofresponsibility;

public class Controlor extends Platitor{

    @Override
    public void plateste(float suma) {
        System.out.printf("Ai primit o amendă pentru că nu ai plătit.%n");
    }
}
