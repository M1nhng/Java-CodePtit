package com.codeptit.oop.khaibaolopvadoituong;

import java.util.Scanner;

public class J04001 {
    public static class Point{
        private double x;
        private double y;

        public void get(Scanner scanner){
            x = scanner.nextDouble();
            y = scanner.nextDouble();
        }

        public static double distance(Point a, Point b){
            return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++){
            Point a = new Point();
            Point b = new Point();
            a.get(scanner);
            b.get(scanner);
            System.out.printf("%.4f\n", Point.distance(a, b));
        }
        scanner.close();
    }

}
