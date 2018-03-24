package com.abshirahmed;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Main {

    public static void main(String[] args) {

        int limit = 10;
        System.out.println(Arrays.asList(getPrimeNumbersList(limit).toArray()));
    }


    private static ArrayList<Integer> getPrimeNumbersList(int limit) {
        ArrayList<Integer> primeNumbersList = new ArrayList<>();

        for (int i = 2; i < limit; i++) {

            for (int j = 1; j < i; j++) {

                if (((i / j == 1) || (i / j == i)) & (j % i != 0)) {
                    primeNumbersList.add(i);
                }

            }

        }

        return primeNumbersList;
    }
}
