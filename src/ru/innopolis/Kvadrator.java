package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Kvadrator implements Runnable {

    private Consumer consumer = new Consumer();
    private int val;

    Thread t = new Thread(this, "Kvadrator");

    public Kvadrator(int num) {

        this.val = num * num;

        t.start(); // Стартуем поток

    }

    @Override
    public synchronized void run() {

        try {
            consumer.met(0, this.val, 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}