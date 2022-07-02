package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        /* bir önceki soruyu tek sferde kullacıdan tüm bilgileri alarak yapınız

         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi, soyisminizi ve yaşınızı giriniz \naralarda enter tuşuna basınız");

        String isim=scan.nextLine();
        scan.nextLine();
        String soyIsim=scan.nextLine();
        scan.nextLine();
        double yas= scan.nextDouble();
        System.out.println("girilen bilgiler : " + isim + " "+ soyIsim + " " + yas);

    }
}
