package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Simpler {

    private Concumer concumer = new Concumer();

    public Simpler(int[] arrNum) {

        for (int num: arrNum) {

            concumer.met(0, 0, arrNum[0]);

        }

    }

}