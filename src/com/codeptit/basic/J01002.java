package com.codeptit.basic;

import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++){
            long n = scanner.nextInt();
            System.out.println((n*(n + 1))/2);
        }

        scanner.close();
    }
}
