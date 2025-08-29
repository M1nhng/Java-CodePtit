package com.codeptit.basic;

import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long sum = 0;
        long tich = 1;
        for(int i = 1; i <= t; i++){
            tich *= i;
            sum += tich;
        }
        System.out.println(sum);
    }
}
