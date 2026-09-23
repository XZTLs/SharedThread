package it.xztl.example;

public class Contatore {
    private int value;
    private int maxValue;

    public Contatore() {
        this.value = 0;
        this.maxValue = 10;
    }

    public synchronized boolean increase(String threadName) {
        if (value >= maxValue) return false;

        value++;
        System.out.println(threadName + " has increased the counter to: " + value);

        return true;
    }
}
