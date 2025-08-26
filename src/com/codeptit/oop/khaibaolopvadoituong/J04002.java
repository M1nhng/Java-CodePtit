package com.codeptit.oop.khaibaolopvadoituong;

import java.util.Scanner;

public class J04002 {
    public static class Rectange{
        protected double width;
        protected double height;
        protected String color;
        
        Rectange(){
            this.width = this.height = 1;
        }
        public Rectange(double width, double height, String color){
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        
        double findArea(){
            return width * height;
        }
        
        double findPerimeter(){
            return (width + height) * 2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        J04002 j04002 = new J04002();
        Rectange rectange = new Rectange();
        double width = scanner.nextDouble();
        rectange.setWidth(width);
        double height = scanner.nextDouble();
        rectange.setHeight(height);
        String color = scanner.next();
        if(color.length() > 0){
            color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
        }
        rectange.setColor(color);
        int dt = (int) rectange.findArea();
        int cv = (int) rectange.findPerimeter();
        if(rectange.getWidth() > 0 && rectange.getHeight() > 0){
            System.out.printf("%.0f %.0f %s", rectange.findPerimeter(), rectange.findArea(), rectange.getColor());
        }
        else System.out.println("INVALID");
        
       
        scanner.close();
        
    }
}
