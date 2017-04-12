package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Consumer {

    private int kube;
    private int kvadro;
    private int simple;

    private volatile boolean stopKube = false;
    private volatile boolean stopKvadro = false;
    private volatile boolean stopSimple = false;

    public void met(int kube, int kvadro, int simple) {

        if ((kube > 0) && (kvadro == 0) && (simple == 0)) {

            synchronized (this){
                while (!stopKube) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " пришёл в Concumer и принес значение " + kube);
                    this.kube = kube;
                    this.stopKube = true;
                }
            }

        } else if ((kube == 0) && (kvadro > 0) && (simple == 0)) {

            synchronized (this) {
                while (!stopKvadro) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " пришёл в Concumer и принес значение " + kvadro);
                    this.kvadro = kvadro;
                    this.stopKvadro = true;
                }
            }

        } else if ((kube == 0) && (kvadro == 0) && (simple > 0)) {

            synchronized (this) {
                while (!stopSimple) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " пришёл в Concumer и принес значение " + simple);
                    this.simple = simple;
                    this.stopSimple = true;
                }
            }

        }

        //System.out.println(this.kube + this.kvadro + this.simple);
        /*
        this.stopKube = false;
        this.stopKvadro = false;
        this.stopSimple = false;
        */
    }

}