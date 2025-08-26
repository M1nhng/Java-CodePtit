package com.codeptit.basic;

import java.util.*;
import java.util.Scanner;

public class J02004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t > 0){
			t--;
			int n = scanner.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++){
				int nhap = scanner.nextInt();
				a[i] = nhap;
			}
			int[] temp = Arrays.copyOf(a, n);
			boolean isPalindrome = true;
			for (int i = 0; i < n; i++) {
				if (a[i] != temp[n - 1 - i]) {
					isPalindrome = false;
					break;
				}
			}
			System.out.println(isPalindrome ? "YES" : "NO");
		}
        scanner.close();
	}
}
