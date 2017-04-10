package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Concumer implements Runnable {

    private int sum = 0;

    private int kube;
    private int kvadro;
    private int simple;

    public void met(int kube, int kvadro, int simple) {

        sum = kube + kvadro + simple;

        this.kube = kube;
        this.kvadro = kvadro;
        this.simple = simple;

        System.out.println(sum);

    }

    @Override
    public void run() {

    }
}