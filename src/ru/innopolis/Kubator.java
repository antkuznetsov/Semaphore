package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Kubator implements Runnable {

    private Consumer consumer = new Consumer();
    private int val;

    Thread t = new Thread(this, "Kubator");

    public Kubator(int num) {

        this.val = num * num * num;

        t.start(); // Стартуем поток

    }

    @Override
    public synchronized void run() {

        try {
            consumer.met(this.val, 0, 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}