package session09_Kha2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Shape s1 = new Rectangle(2,3);
        Shape s2 = new Circle(1);
        System.out.println("Diện tích hình chữ nhật: "+ s1.area());
        System.out.println("Diện tích hình tròn: "+ s2.area());
    }
}
