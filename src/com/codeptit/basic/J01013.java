package com.codeptit.basic;

import java.util.Scanner;

public class J01013 {
    static final int MAX = 2000000;
    static int[] spf = new int[MAX + 1]; 


    static void sieve() {
        for (int i = 2; i <= MAX; i++)
            spf[i] = i;
        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) { 
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }
    }

    static int checknum(int n) {
        int sum = 0;
        while (n > 1) {
            sum += spf[n];
            n /= spf[n];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sieve(); 

        int N = scanner.nextInt();
        long sum = 0;
        while (N-- > 0) {
            int n = scanner.nextInt();
            sum += checknum(n);
        }
        System.out.println(sum);
    }
}
