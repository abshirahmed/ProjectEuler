package com.abshirahmed;


import java.util.ArrayList;
import java.util.List;

import static com.abshirahmed.PrimeFactorsEffective.primeFactors;

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

        long limit = 600_851_475_143L;
        System.out.println("Primefactors of " + limit);
        for (Long value : primeFactors(limit)) {
            System.out.println(value);
        }

    }

}

class PrimeFactorsEffective {
    static List<Long> primeFactors(long numbers) {
        long n = numbers;
        List<Long> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {

            while (n % i == 0) {
                factors.add((long) i);
                n /= i;
            }

        }
        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }
}


