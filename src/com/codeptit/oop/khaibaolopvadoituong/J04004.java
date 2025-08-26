package com.codeptit.oop.khaibaolopvadoituong;

import java.util.Scanner;

class PhanSo {
    private long tuSo;
    private long mauSo;

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }


    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else
            return gcd(b, a % b);
    }

    
    static void sol(PhanSo a, PhanSo b){
        PhanSo res = new PhanSo();
        res.setTuSo(a.getTuSo()*b.getMauSo() + b.getTuSo()*a.getMauSo());
        res.setMauSo(a.getMauSo()*b.getMauSo());
        long ucln = gcd(res.tuSo, res.mauSo);
        System.out.println((res.getTuSo() / ucln) + "/" + (res.getMauSo() / ucln));
    }

}
public class J04004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo phanSoA = new PhanSo();
        PhanSo phanSoB = new PhanSo();
        phanSoA.setTuSo(scanner.nextLong());
        phanSoA.setMauSo(scanner.nextLong());
        phanSoB.setTuSo(scanner.nextLong());
        phanSoB.setMauSo(scanner.nextLong());
        PhanSo.sol(phanSoA, phanSoB);
        
    }
}
