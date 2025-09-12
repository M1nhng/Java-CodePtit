package com.codeptit.ungdungjavacollections;
import java.util.*;

public class J08020 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());		
		
		while(t-->0) {
			Stack<Character> st = new Stack<>();
			String s = scanner.nextLine();
			boolean ok = true;
			
			for(int i = 0; i < s.length(); i++) {
				char x = s.charAt(i);
				if(x == '[' || x == '{' || x == '(') {
					st.push(x);
				}
				else {
					if(st.isEmpty()) {
						ok = false;
						break;
					}
				char top = st.pop();
	                if ((x == ')' && top != '(') ||
	                	(x == ']' && top != '[') ||
	                    (x == '}' && top != '{')) {
	                    	ok = false;
	                        break;
					}			
				}				
			}
			if(!st.isEmpty()) ok = false;
			
			if(ok) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
