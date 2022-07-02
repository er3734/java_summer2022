package day03_scanner;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("cemberin yarıçapını giriniz");
        double r= scan.nextDouble();
        double pi=3.14;
        double cevre=2*pi*r;
        double alan=pi*r*r;
        System.out.println("cemberin cevresi : " + cevre);
        System.out.println("dairenin alanı : " + alan);

    }
}
