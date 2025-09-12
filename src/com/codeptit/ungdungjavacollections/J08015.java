package com.codeptit.ungdungjavacollections;
import java.util.*;


public class J08015 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		
		while(t--> 0) {
			int n = scanner.nextInt();
			long k = scanner.nextLong();
			long a[] = new long[n];
			long cnt = 0;
			
			for(int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();					
			}
			
			Map<Long, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				long need = k - a[i];
				if(map.containsKey(need)) {
					cnt += map.get(need);
				}
				map.put(a[i], map.getOrDefault(a[i], (int) 0L) + 1);
			}
			System.out.println(cnt);
		}
	}
}
