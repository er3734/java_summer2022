package praktice02;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin
    // ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();
    }
}