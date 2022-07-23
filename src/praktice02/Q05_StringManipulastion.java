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
<<<<<<< HEAD
        isimsoyisimUzunluk(isim,soyIsim);

    }

    private static void isimsoyisimUzunluk(String isim, String soyIsim) {
        if (isim.length()>soyIsim.length()){
            System.out.println("iminiz soyisimden daha uzun");
        } else if (isim.length()==soyIsim.length()) {
            System.out.println("isim ve soyismizin uzuluğu eşit");
        } else
            System.out.println("soyisminiz isminizden daha uzun");
=======
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
    }
}