package com.codeptit.mang;

import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Set<Short> setA = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();

        for(byte i = 0; i < n; i++){
            setA.add(scanner.nextShort());
        }

        Set<Short> setB = new TreeSet<>();
        for(short i = 0; i < m; i++){
            setB.add(scanner.nextShort());
        }
        setA.addAll(setB);
        for (int i : setA) {
            System.out.print(i + " ");
        }
    }
}
