package state.main;

import state.clase.Reteta;

import java.util.Random;

public class Main {
    static int NR_MAX_MEDICAMENTE = 20;
    static int NR_MAX_COD = 5000;
    static float MAX_FLOAT = 500f;
    static Random rng = new Random();
    public static void main(String[] args) {
        Reteta reteta = new Reteta(rng.nextInt(NR_MAX_MEDICAMENTE), rng.nextInt(NR_MAX_COD), rng.nextFloat(MAX_FLOAT));
        reteta.cumparaMedicamente();
        reteta.cereMedicamente();
        reteta.cumparaMedicamente();
        reteta.respingeReteta();

        reteta.cereMedicamente();
        reteta.cumparaMedicamente();
    }
}
