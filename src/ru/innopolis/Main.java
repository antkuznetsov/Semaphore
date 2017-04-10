package ru.innopolis;

public class Main {

    public static void main(String[] args) {

        int[] a = {2, 4, 6};
        int[] b = {3, 6, 9};
        int[] c = {1, 5, 7};

        Concumer concumer = new Concumer();

        Kubator x = new Kubator(a);
        Kvadrator y = new Kvadrator(b);
        Simpler z = new Simpler(c);

    }
}