package com.abshirahmed;


import java.util.ArrayList;

public class Main {
    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     * <p>
     * <p>1. get a value</p>
     * <p>2. check if that value is divisible by a prime number</p>
     * <p>3. store that prime factor in an ArrayList</p>
     * <p>4. use answer as reference</p>
     * <p>5. repeat steps 2 to 4</p>
     * <p>6. repeat until answer equals 1</p>
     */
    public static void main(String[] args) {
        int value = 24325;
        findPrimeFactorsOf(value);
    }

    private static int findPrimeFactorsOf(int value) {

        ArrayList<Integer> primeFactors = new ArrayList<>();
        ArrayList<Integer> newValue = new ArrayList<>();

        for (int i = 1; i <= value; i++) {

            if ((value % i == 0) & (i != 1)) {
                primeFactors.add(i);
                newValue.add(value / i);
                System.out.println(i+" is a prime factor");
                return findPrimeFactorsOf(value / i);
            }

        }
        return 0;

    }


}


