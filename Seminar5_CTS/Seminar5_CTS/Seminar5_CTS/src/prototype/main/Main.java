package prototype.main;

import prototype.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> accesorii = new ArrayList<>();
        accesorii.add("bratara");
        accesorii.add("ceas");
        Client client = new Client("Gigel", 20, accesorii);
        Client client2 = (Client) client.copiaza();
        System.out.println(client);
        client2.setVarsta(17);
        System.out.println(client2);
    }
}
