package builderinnerclass.main;

import builderinnerclass.BuilderInner;
import builderinnerclass.Jucator;

public class Main {
    public static void main(String[] args) {
        Jucator builderInner = new BuilderInner().setBauturaRacoritoare().build();
        System.out.println(builderInner);
    }
}
