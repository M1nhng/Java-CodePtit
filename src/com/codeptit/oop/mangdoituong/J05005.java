package com.codeptit.oop.mangdoituong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SinhVien1 implements Comparable<SinhVien1> {

    public static int NUM = 1;
    private String msv, ten, lop, ngaySinh;
    private float gpa;

    public SinhVien1(String ten, String lop, String ngaySinh, float gpa) {
        this.ten = formatName(ten);
        this.lop = lop;
        this.ngaySinh = formatDate(ngaySinh);
        this.gpa = gpa;
        this.msv = String.format("B20DCCN%03d", NUM++);
    }

    private String formatName(String s) {
        String[] str = s.trim().split("\\s+");
        String res = "";
        for (String i : str) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length() - 1);
    }

    private String formatDate(String s) {
        String[] str = s.split("/");
        String res = "";
        for (String i : str) {
            if (i.length() == 1) {
                i = "0" + i;
            }
            res += i + "/";
        }
        return res.substring(0, res.length() - 1);
    }

    public Float getGPA() {
        return gpa;
    }

    @Override
    public int compareTo(SinhVien1 other) {
        return -(this.getGPA().compareTo(other.getGPA()));
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}

public class J05005 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        List<SinhVien1> list = new ArrayList<>(t);
        for (int i = 1; i <= t; i++) {
            ip.nextLine();
            String Name = ip.nextLine();
            String Room = ip.nextLine();
            String Date = ip.nextLine();
            float Gpa = ip.nextFloat();
            SinhVien1 p = new SinhVien1(Name, Room, Date, Gpa);
            list.add(p);
        }
        Collections.sort(list);
        for (SinhVien1 i : list) {
            System.out.println(i);
        }
    }
}