package day03_scanner;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("uzun kenarı giriniz");
        double a= scan.nextDouble();
        System.out.println("kısa kenarı giriniz");
        double b= scan.nextDouble();
        System.out.println("yüksekliği giriniz");
        double h = scan.nextDouble();
        double hacim= a*b*h;
        System.out.println("dikdörtgenler prizmasının hacmi : " + hacim);

    }
}
