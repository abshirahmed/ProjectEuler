package com.abshirahmed;

public class Problem6 {

    public static void main(String[] args) {

        int squareOfSums = 0, sumOfSquares = 0, difference;

        for (int i = 1; i <= 100; i++) {
            squareOfSums += i;
            sumOfSquares += (i * i);
        }

        squareOfSums *= squareOfSums;
        difference = (squareOfSums > sumOfSquares) ? (squareOfSums - sumOfSquares) : (sumOfSquares - squareOfSums);

        System.out.println("***************************************");
        System.out.println("square of sums = " + squareOfSums);
        System.out.println("sum of squares = " + sumOfSquares);
        System.out.println("***************************************");
        System.out.println("squareOfSums - sumOfSquares = " + difference);
        System.out.println("***************************************");

    }
}
