package com.codeptit.basic;

import java.util.*;

public class J01026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t--> 0) {
            int n = scanner.nextInt();
            double k = Math.sqrt(n);
            long l = Math.round(k);
            if(l * l == n){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
