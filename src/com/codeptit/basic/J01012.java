package com.codeptit.basic;

import java.util.Scanner;
class Check{
    static void checknum(int n){
        int cnt = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
            int j = n / i;
            if (i % 2 == 0) cnt++;
            if (j != i && j % 2 == 0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
public class J01012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        Check check = new Check();
        while(t > 0){
            t--;
            int n = scanner.nextInt();
            Check.checknum(n);
        }
       
    }
}
