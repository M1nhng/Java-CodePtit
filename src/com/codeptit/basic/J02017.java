package com.codeptit.basic;

import java.util.*;

class ThuGonDaySo {
    static int thuGon(ArrayList<Integer> list) {
        Stack<Integer> st = new Stack<>();
        for (int x : list) {
            if (!st.isEmpty() && (st.peek() + x) % 2 == 0) {
                st.pop(); 
            } else {
                st.push(x);
            }
        }
        return st.size(); 
    }
}

public class J02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(ThuGonDaySo.thuGon(list));
    }
}
