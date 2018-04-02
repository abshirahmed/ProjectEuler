package com.abshirahmed;


/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {

    public static void main(String[] args) {
        int tempAns = 0;
        int max = 999;
        for (int i = 100; i <= max; i++) {
            for (int j = max; j >= i; j--) {
                if (findPalindrome(i * j) && (i * j) > tempAns) {
                    System.out.println("Palindrome: " + j + " * " + i + " = " + j * i);
                    tempAns = i * j;
                }
            }
        }
    }

    private static boolean findPalindrome(int n) {
        String nString = String.valueOf(n);
        int j = 0;
        int stringLength = nString.length() - 1;
        for (int i = stringLength; i >= 0; i--) {

            if (nString.charAt(j) == nString.charAt(i)) {

                if (i == 0) {
                    return true;
                }
                j++;

            } else if (nString.charAt(j) != nString.charAt(i)) {
                return false;
            }

        }

        return false;
    }

}



