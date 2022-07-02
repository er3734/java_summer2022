package day03_scanner;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("karenin bir kenarını giriniz" );
        double kenar= scan.nextDouble();
        double alan=kenar*kenar;
        double cevre=kenar*4;
        System.out.println("kareni cevresi : " + cevre);
        System.out.println("karenin alanı : " + alan);
    }

}
