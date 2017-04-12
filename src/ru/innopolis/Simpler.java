package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Simpler implements Runnable {

    private Consumer consumer;
    private int val;

    Thread t = new Thread(this, "Simpler");

    public Simpler(int num, Consumer consumer) {

        this.consumer = consumer;
        this.val = num;

        t.start(); // Стартуем поток

    }

    @Override
    public void run() {

        consumer.met(0, 0, this.val);

    }
}