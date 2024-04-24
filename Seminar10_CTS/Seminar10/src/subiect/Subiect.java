package subiect;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> observers;

    public abstract void anuntaPlecare();

    public Subiect() {
        this.observers = new ArrayList<>();
    }

    public void abonareObservable(Observer observer)
    {
        this.observers.add(observer);
    }

    public void dezabonareObservable(Observer observer)
    {
        this.observers.remove(observer);
    }

    public void trimiteMesaje(String mesaj)
    {
        observers.forEach(observer -> observer.primesteMesaj(mesaj));
    }
}
