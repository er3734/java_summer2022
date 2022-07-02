package day03_scanner;

import java.util.Scanner;
import java.util.SortedMap;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanıcıdan ismini soy ismini ve yaşını alıp
        girilen bilgiler = seyfi capar 34 şeklinde yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminiz giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("lutfen yaşınızı giriniz");
        int yas= scan.nextInt();

        System.out.println("girilen bilgiler : " + isim + " "+ soyIsim + " " + yas);
    }
}
