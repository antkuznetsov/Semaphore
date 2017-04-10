package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Kvadrator {

    private Concumer concumer = new Concumer();

    public Kvadrator(int[] arrNum) {

        for (int num: arrNum) {

            concumer.met(0, arrNum[0],0);

        }

    }

}