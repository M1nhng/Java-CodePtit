package com.codeptit.oop.mangdoituong;

import java.util.*;

class SinhVienn {
	private String msv;
	private String name;
	private String lop;
	private String dob;
	private double gpa;
	private static int cnt = 1;

	SinhVienn() {
		this.msv = null;
		this.name = null;
		this.lop = null;
		this.dob = null;
		this.gpa = 0;
	}

	public SinhVienn(String name, String lop, String dob, double gpa) {
		this.msv = String.format("B20DCCN%03d", cnt++);
		this.name = normalizeName(name);
		this.lop = lop;
		this.dob = normalizeDob(dob);
		this.gpa = gpa;
	}

	private String normalizeName(String s) {
		StringTokenizer st = new StringTokenizer(s.trim().toLowerCase());
		StringBuilder sb = new StringBuilder();
		while (st.hasMoreTokens()) {
			String w = st.nextToken();
			sb.append(Character.toUpperCase(w.charAt(0)));
			if (w.length() > 1)
				sb.append(w.substring(1));
			if (st.hasMoreTokens())
				sb.append(" ");
		}
		return sb.toString();
	}

	private String normalizeDob(String s) {
		s = s.trim();
		String[] p = s.split("/");
		if (p.length != 3)
			return s;
		String day = p[0].length() == 1 ? "0" + p[0] : p[0];
		String month = p[1].length() == 1 ? "0" + p[1] : p[1];
		String year = p[2];
		return day + "/" + month + "/" + year;
	}

	public String getMsv() {
		return msv;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = normalizeName(name);
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = normalizeDob(dob);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		SinhVienn.cnt = cnt;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s %.2f", msv, name, lop, dob, gpa);
	}
}

public class J05004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine().trim());
		ArrayList<SinhVienn> ds = new ArrayList<SinhVienn>();
		for(int i = 0; i < t; i++){
			String name = scanner.nextLine();
			String lop = scanner.nextLine();
			String dob = scanner.nextLine();
			double gpa = Double.parseDouble(scanner.nextLine().trim());
			ds.add(new SinhVienn(name, lop, dob, gpa));
		}
		for (SinhVienn sv : ds) {
			System.out.println(sv);
		}
		scanner.close();
	}
}


