package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Simpler implements Runnable {

    private Consumer consumer = new Consumer();
    private int val;

    Thread t = new Thread(this, "Simpler");

    public Simpler(int num) {

        this.val = num;

        t.start(); // Стартуем поток

    }

    @Override
    public synchronized void run() {

        try {
            consumer.met(0, 0, this.val);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}