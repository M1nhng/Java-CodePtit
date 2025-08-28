package com.codeptit.oop.mangdoituong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class Time implements Comparable<Time>{
    private int h, m, s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }


    public int getM() {
        return m;
    }


    public int getS() {
        return s;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }

    @Override
    public int compareTo(Time o) {
        int s1 = h * 3600 + m * 60 + s;
        int s2 = o.getH() * 3600 + o.getM() * 60 + o.getS();
        return s1 - s2;
    }

    
    
}
public class J05033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<Time> list = new ArrayList<>(t);
        while(t-- > 0){
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            Time time = new Time(h, m, s);
            list.add(time);
        }
        Collections.sort(list);
        for (Time time : list) {
            System.out.println(time);
        }
    }
}
