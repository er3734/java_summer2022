package day09_tenaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double a= scan.nextDouble();
        System.out.println((a>=0)?a:(-1*a));

    }
}
