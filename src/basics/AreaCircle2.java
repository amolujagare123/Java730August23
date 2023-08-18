package basics;


import java.util.Scanner;

public class AreaCircle2 {

    public static void main(String[] args) {
        double r;
        double pi = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle = ");
        r = sc.nextDouble();
        double area = pi * r * r ;


        System.out.println("area of circle="+area);
    }
}
