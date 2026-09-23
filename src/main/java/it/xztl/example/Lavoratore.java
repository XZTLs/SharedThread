package it.xztl.example;

public class Lavoratore implements Runnable {
    private Contatore counter;
    private String name;

    public Lavoratore(Contatore c, String name) {
        this.counter = c;
        this.name = name;
    }
    
    @Override
    public void run() {
        while (counter.increase(name)) {
            try {
                Thread.sleep((long)(Math.random() * 400 + 100));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
