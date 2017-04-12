package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Kubator implements Runnable {

    private Consumer consumer;
    private int val;

    Thread t = new Thread(this, "Kubator");

    public Kubator(int num, Consumer consumer) {

        this.consumer = consumer;
        this.val = num * num * num;

        t.start(); // Стартуем поток

    }

    @Override
    public void run() {

        consumer.met(this.val, 0, 0);

    }
}