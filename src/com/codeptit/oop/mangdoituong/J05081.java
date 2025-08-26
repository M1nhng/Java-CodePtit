package com.codeptit.oop.mangdoituong;

import java.util.*;
import java.util.Scanner;

public class J05081 {
    class Manage implements Comparable<Manage> {
        private String maMatHang;
        private String tenMatHang;
        private String donViTinh;
        private int giaMua;
        private int giaBan;
        private int loiNhuan = 0;
        private static int cnt = 1;
        public Manage(String tenMatHang, String donViTinh, int giaMua, int giaBan) {
            this.maMatHang = String.format("MH%03d", cnt++);
            this.tenMatHang = tenMatHang;
            this.donViTinh = donViTinh;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
            loiNhuan = giaBan - giaMua;
        }
        @Override
        public int compareTo(Manage o){
            if(this.loiNhuan != o.loiNhuan){
                return o.loiNhuan - this.loiNhuan;
            }
            return this.maMatHang.compareTo(o.maMatHang);
        }
        @Override
        public String toString() {
            return maMatHang + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan;
        }
        

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());
        J05081 j05081 = new J05081();
        List<Manage> manage = new ArrayList<>();
        while (t > 0) {
            t--;
            String ten = scanner.nextLine();
            String dv = scanner.nextLine();
            int giaMua = Integer.parseInt(scanner.nextLine().trim());
            int giaBan = Integer.parseInt(scanner.nextLine().trim());
            manage.add(j05081.new Manage(ten, dv, giaMua, giaBan));
        }
        Collections.sort(manage);
        for (Manage item : manage) {
            System.out.println(item.toString());
        }
        scanner.close();
    }
}
