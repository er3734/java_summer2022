package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /* kullanıcıdan iki sayı alıp bu sayıların carpımını  yazdırın

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. sayıyı giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("kutfen 2. sayıyı giriniz");
        double sayi2= scan.nextDouble();
        //double carpim=sayi1*sayi2;
        //System.out.println(carpim);

       System.out.println("sayıların carpımı : " + sayi1*sayi2);

    }
}
