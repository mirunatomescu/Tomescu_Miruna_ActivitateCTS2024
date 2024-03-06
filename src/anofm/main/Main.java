package anofm.main;

import anofm.Manager;
import anofm.ManagerRegistry;

public class Main {
    public static void main(String[] args){
        ManagerRegistry registru = ManagerRegistry.getInstanta();
        registru.inregistreazaManager("CTS.SRL", "Popescu", 100000f);
        registru.inregistreazaManager("CTS.SRL", "Ionescu", 100000f);
        System.out.println(registru.getManager("CTS SRL"));
//        Manager m1 = new Manager("CTS SRL", "Andrei", 2000f);




    }
}
