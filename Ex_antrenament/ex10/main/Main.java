package b.ex10.main;

import b.ex10.clase.Client;
import b.ex10.clase.Flyweight;
import b.ex10.clase.Restaurant;
import b.ex10.clase.Rezervare;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class Main {
    static int NR_MAX_MASA = 100;
    static int NR_MAX_PERSOANE = 10;
    static int NR_MAX_CARACTERE_ADRESA = 100;
    static int NR_MAX_NR_DE_TELEFON = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Restaurant restaurant = new Restaurant();

        Flyweight client1 = new Client(generateRandomString(NR_MAX_CARACTERE_ADRESA), generateRandomPhoneNumber(NR_MAX_NR_DE_TELEFON), "Oana");
        Flyweight client2 = new Client(generateRandomString(NR_MAX_CARACTERE_ADRESA), generateRandomPhoneNumber(NR_MAX_NR_DE_TELEFON), "Onea");
        Flyweight client3 = new Client(generateRandomString(NR_MAX_CARACTERE_ADRESA), generateRandomPhoneNumber(NR_MAX_NR_DE_TELEFON), "Vlad");

        restaurant.addClient(client1);
        restaurant.addClient(client1);
        restaurant.addClient(client1);
        restaurant.addClient(client2);
        restaurant.addClient(client3);

        Rezervare rezervare1 = new Rezervare(random.nextInt(NR_MAX_MASA), random.nextInt(NR_MAX_PERSOANE), LocalDateTime.now());
        Rezervare rezervare2 = new Rezervare(random.nextInt(NR_MAX_MASA), random.nextInt(NR_MAX_PERSOANE), LocalDateTime.now());
        Rezervare rezervare3 = new Rezervare(random.nextInt(NR_MAX_MASA), random.nextInt(NR_MAX_PERSOANE), LocalDateTime.now());

        restaurant.getClient("Oana").afiseazaRezervare(rezervare1);
        restaurant.getClient("Onea").afiseazaRezervare(rezervare2);
        restaurant.getClient("Vlad").afiseazaRezervare(rezervare3);
        restaurant.getClient("Oana").afiseazaRezervare(rezervare3);
        restaurant.getClient("Vlad").afiseazaRezervare(rezervare1);
        restaurant.getClient("Vlad").afiseazaRezervare(rezervare2);
    }

    private static String generateRandomString(int length) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid.length() > length ? uuid.substring(0, length) : uuid;
    }

    private static String generateRandomPhoneNumber(int length) {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("+");
        for (int i = 0; i < length; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }
}
