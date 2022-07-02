package day03_scanner;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim ve soyisminiz giriniz");
        String isim=scan.nextLine();
        scan.nextLine();
        String soyIsim=scan.nextLine();
        System.out.println("İsim - Soyisim : " + isim  + soyIsim);

    }
}
