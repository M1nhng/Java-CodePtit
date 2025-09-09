package com.codeptit.ungdungjavacollections;
import java.util.*;
public class J08015 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		
		while(t--> 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int a[] = new int[n];
			int cnt = 0;
			
			for(int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					if(Math.abs(a[i]) + Math.abs(a[j]) == k) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
