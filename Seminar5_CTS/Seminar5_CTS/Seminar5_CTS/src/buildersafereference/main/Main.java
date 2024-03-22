package buildersafereference.main;


import buildersafereference.AbstractBuilder;
import buildersafereference.Jucator;
import buildersafereference.JucatorBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder jucatorBuilder = new JucatorBuilder().setMancareInclusa().setBauturaRacoritoare();
        Jucator jucator = jucatorBuilder.build();
        System.out.println(jucator);
    }
}
