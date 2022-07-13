package com.company;

public class Main {

    static void proc(int a) {
        System.out.println("in " + a);
        a++;
        if (a < 10) {
            proc(a);
        }
        System.out.println("out " + a);
    }

    static int calcArifmSum(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + calcArifmSum(x - 1);
        }
    }

    public static void main(String[] args) {
        //proc(0);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println(calcArifmSum(5));
    }
}
