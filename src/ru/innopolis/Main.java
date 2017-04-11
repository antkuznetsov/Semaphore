package ru.innopolis;

public class Main {

    public static void main(String[] args) {

        int[] a = {2, 4, 6};
        int[] b = {3, 6, 9};
        int[] c = {1, 5, 7};

        Consumer consumer = new Consumer();

        for (int i = 0; i < a.length; i++) {
            new Kubator(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            new Kvadrator(b[i]);
        }

        for (int i = 0; i < c.length; i++) {
            new Simpler(c[i]);
        }

    }
}