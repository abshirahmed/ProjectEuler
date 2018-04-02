package com.abshirahmed;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 {

    public static void main(String[] args) {
        int value = 20;
        boolean complete = false;
        while (!complete) {

            for (int i = 20; i >= 1; i--) {
                int temp = value;
                if (temp % i == 0) {
                    if (i == 1) {
                        System.out.println("Finished");
                        System.out.println(value);
                        complete = true;
                    }
                    temp %=i;
                } else break;
            }
            value++;
        }

    }
}
