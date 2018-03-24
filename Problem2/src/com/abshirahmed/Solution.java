package com.abshirahmed;

public class Solution {

    public static void main(String[] args) {

        solutionOne();
        solutionTwo();

    }

    private static void solutionOne() {
        int limit = 10;
        int sum = 0;
        int a = 1;
        int b = 1;

        while (b < limit) {//t,t,t,t,t,
            if (b % 2 == 0) {//f,t,f,f,t,
                sum = sum + b;//0,2,2,2,10,
            }
            int h = a + b;//2,3,5,8,13,
            a = b; //1,2,3,5,8,
            b = h; //2,3,5,8,13

            System.out.format("a = %d, b = %d",a,b);
            System.out.println();

        }
        System.out.println(sum);
    }

    private static void solutionTwo() {
    }

}
