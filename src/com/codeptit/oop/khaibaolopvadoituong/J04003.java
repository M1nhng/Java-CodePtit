package com.codeptit.oop.khaibaolopvadoituong;

import java.util.Scanner;

public class J04003 {
    class PhanSo {
        private long tuSo;
        private long mauSo;

        public PhanSo(long tuSo, long mauSo) {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
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

        long ucln(long tuSo, long mauSo){
            if(mauSo == 0){
                return tuSo;
            }
            return ucln(mauSo, tuSo % mauSo);
        }

        void rutGon(){
            long gcd = ucln(Math.abs(this.tuSo), Math.abs(this.mauSo));
            tuSo /= gcd;
            mauSo /= gcd;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long tuSo = scanner.nextLong();
        long mauSo = scanner.nextLong();
        J04003 j04003 = new J04003();
        PhanSo phanSo = j04003.new PhanSo(tuSo, mauSo);
        phanSo.rutGon();
        System.out.println(phanSo.getTuSo() + "/" + phanSo.getMauSo());

        scanner.close();
    }
}
    