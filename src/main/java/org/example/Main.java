package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата: " + getSquareSquare(5));
        System.out.println("Площадь круга: " + getSquareCircle(8));
        System.out.println("Площадь треугольника: " + getSquareTriangle(7, 9, 10));
    }
   static double getSquareSquare(double a) {
        return a * a;
    }
    static double getSquareCircle(double r) {
        return Math.PI * (r * r);
    }
    static double getSquareTriangle(double b, double c, double d) {
        double pp = (b + c + d) / 2.0;
        return Math.sqrt(pp * (pp - b) * (pp - c) * (pp - d));
    }
}