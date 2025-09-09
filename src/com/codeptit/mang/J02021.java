package com.codeptit.mang;

import java.util.*;

public class J02021 {
    static int n, k, a[], ok, cnt;

    static void khoitao() {
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
    }

    static void sinh() {
        int i = k;
        while (i >= 1 && a[i] == n - k + i) {
            --i;
        }
        if (i == 0) {
            ok = 0;
        } else {
            a[i]++;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();

        a = new int[k + 1];
        ok = 1;
        cnt = 0;

        khoitao();
        while (ok == 1) {
            for (int i = 1; i <= k; i++) {
                System.out.print(a[i]);
            }
            System.out.print(" ");
            cnt++;
            sinh();
        }
        System.out.println();
        System.out.printf("Tong cong co %d to hop", cnt);
    }
}
