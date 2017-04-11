package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Consumer {

    private int sum = 0;

    private int kube;
    private int kvadro;
    private int simple;

    private boolean isKube = false;
    private boolean isKvadro = false;
    private boolean isSimple = false;

    private static boolean go = false;

    public void met(int kube, int kvadro, int simple) throws InterruptedException {

        sum = kube + kvadro + simple;

        this.kube = kube;
        this.kvadro = kvadro;
        this.simple = simple;

        //System.out.println(sum);

        if ((kube > 0) && (kvadro == 0) && (simple == 0)) {
            isKube = true;
            System.out.println("Поток " + Thread.currentThread().getName() + " пришёл в Concumer и принес значение " + kube);
        } else if ((kube == 0) && (kvadro > 0) && (simple == 0)) {
            isKvadro = true;
            System.out.println("Поток " + Thread.currentThread().getName() + " пришёл в Concumer и принес значение " + kvadro);
        } else if ((kube == 0) && (kvadro == 0) && (simple > 0)) {
            isSimple = true;
            System.out.println("Поток " + Thread.currentThread().getName() + " пришёл в Concumer и принес значение " + simple);
        }

    }

}