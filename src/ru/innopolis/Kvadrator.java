package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Kvadrator implements Runnable {

    private Consumer consumer;
    private int val;

    Thread t = new Thread(this, "Kvadrator");

    public Kvadrator(int num, Consumer consumer) {

        this.consumer = consumer;
        this.val = num * num;

        t.start(); // Стартуем поток

    }

    @Override
    public void run() {

        consumer.met(0, this.val, 0);

    }
}