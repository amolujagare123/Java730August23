package basics;

import java.util.Scanner;

public class AreaRectangle2 {

    public static void main(String[] args) {

        double l;
        double b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        l = sc.nextDouble();
        System.out.println("Enter Breadth:");
        b = sc.nextDouble();

        double area= l * b;

        System.out.println("area of rectangle="+area);

    }
}
