package com.codeptit.basic;
import java.util.*;

class InsertionSort {
    static void check(ArrayList<Integer> list) {
        System.out.println("Buoc 0: " + list.get(0));

        for (int i = 1; i < list.size(); i++) {
            int x = list.get(i); 
            int pos = i - 1; 
            while (pos >= 0 && x < list.get(pos)) {
                list.set(pos + 1, list.get(pos));
                --pos;
            }
            list.set(pos + 1, x);


            System.out.printf("Buoc %d: ", i);
            for (int k = 0; k <= i; k++) {
                System.out.print(list.get(k) + " ");
            }
            System.out.println();
        }
    }
}

public class J02012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            ArrayList<Integer> insertionSort = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                insertionSort.add(scanner.nextInt());
            }
            InsertionSort.check(insertionSort);
 
    }
}
