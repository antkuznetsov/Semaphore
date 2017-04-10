package ru.innopolis;

/**
 * Created by Kuznetsov on 07/04/2017.
 */

public class Kubator {

    private Concumer concumer = new Concumer();

    public Kubator(int[] arrNum) {

        for (int num: arrNum) {

            concumer.met(arrNum[0], 0,0);

        }

    }

}