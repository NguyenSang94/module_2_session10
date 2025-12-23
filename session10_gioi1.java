package session10_Gioi1;

import java.util.Scanner;

public class Computer {
    public double calculatePrice(double basePrice){
        System.out.println("Using basePrice only");
        return basePrice;
    }
    public double calculatePrice(double basePrice,double taxRate){
        System.out.println("Using basePrice + tax");
        return basePrice +  taxRate;
    }
    public double calculatePrice(double basePrice,double taxRate,double discountRate){
        System.out.println("Using basePrice + tax + discount");
        return basePrice +  taxRate - discountRate ;
    }

    static void main() {
        Computer computer = new Computer();
        double c1 = computer.calculatePrice(1000);
        System.out.printf("Final Price = %.1f%n ",c1);
        double c2 = computer.calculatePrice(1000, 100);
        System.out.printf("Final Price = %.1f%n ",c2);
        double c3 = computer.calculatePrice(1000, 100, 50);
        System.out.printf("Final Price = %.1f%n ",c3);

    }
}
