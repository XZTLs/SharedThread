package it.xztl.example;

public class Main {
    public static void main(String[] args) {
        Contatore counter = new Contatore();

        Lavoratore l1 = new Lavoratore(counter, "Thread 1");
        Lavoratore l2 = new Lavoratore(counter, "Thread 2");

        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Raggiunto il valore massimo del contatore!");
    }
}