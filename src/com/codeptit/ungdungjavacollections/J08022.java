package com.codeptit.ungdungjavacollections;
import java.util.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            for(int i = 0; i < n; i++) {
                int res = -1;
                for(int j = i + 1; j < n; j++) {
                    if(a[j] > a[i]) {
                        res = a[j];
                        break;
                    }
                }
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
