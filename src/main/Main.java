package main;

import companie.Manager;

public class Main {

    public static void main(String[] args){

        Manager manager2 = Manager.getInstance("asd", 23.43, 2);
        Manager manager1 = Manager.getInstance();

        System.out.println(manager1);
        System.out.println(manager2);

    }


}
