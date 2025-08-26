package com.codeptit.basic;

import java.util.Scanner;

public class J01004 {
    static void Prime(int n){
        if (n < 2){
            System.out.println("NO");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0){
            t--;
            int n = scanner.nextInt();
            Prime(n);
        }
        scanner.close();
    }
}
