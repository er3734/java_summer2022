package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kulanıcıdan ismini isteyin
        //girilen ismi
        //isminiz : ismail şeklinde yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String kullaniciIsmi=scan.next();
        System.out.println("isminiz : " + kullaniciIsmi);


    }
}
