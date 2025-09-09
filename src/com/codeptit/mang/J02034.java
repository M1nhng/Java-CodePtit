package com.codeptit.mang;

import java.util.*;

public class J02034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> set = new TreeSet<>();
        int a[] = new int[t];
        for(int i = 0; i < t; i++) {
            a[i] = scanner.nextInt();
            set.add(a[i]);
        }
        int max = a[t - 1];
        boolean found = false;
        for(int i = 1; i <= max; i++) {
        	if(!set.contains(i)) {
        		System.out.println(i);
        		found = true;
        	}
        }
        if(!found) System.out.println("Excellent!");
    }
}
