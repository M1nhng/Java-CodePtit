package com.codeptit.oop.mangdoituong;

import java.util.*;
import java.util.Scanner;

class SinhVien {
	private String msv;
	private String name;
	private String dob;
	private String lop;
	private double gpa;
	private static int cnt = 1;

	public SinhVien(String name, String lop, String dob, double gpa) {
		this.msv = String.format("B20DCCN%03d", cnt++);
		this.name = name;
		this.lop = lop;
		this.dob = normalizeDob(dob);
		this.gpa = gpa;
	}
	
	private String normalizeDob(String s){
		s = s.trim();
		String[] p = s.split("/");
		if (p.length != 3) return s;
		String day = p[0].length() == 1 ? "0" + p[0] : p[0];
		String month = p[1].length() == 1 ? "0" + p[1] : p[1];
		String year = p[2];
		return day + "/" + month + "/" + year;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s %.2f", msv, name, lop, dob, gpa);
	}
}

public class J05003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		J05003 j05003 = new J05003();
		int t = Integer.parseInt(scanner.nextLine().trim());
		List<SinhVien> sinhViens = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			String name = scanner.nextLine();
			String lop = scanner.nextLine();
			String dob = scanner.nextLine();
			double gpa = Double.parseDouble(scanner.nextLine().trim());
			sinhViens.add(new SinhVien(name, lop, dob, gpa));
		}
		for (SinhVien sv : sinhViens) {
			System.out.println(sv);
		}
		scanner.close();
	}
}
