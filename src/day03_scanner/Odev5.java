package day03_scanner;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminiz giriniz");
        String soyIsim= scan.nextLine();
        System.out.println("İsminiz : " + isim + "\nSoyisminiz : " + soyIsim );
        System.out.println("Kursumuza katılımız alınmıştır, teşekkür ederiz");
    }
}
