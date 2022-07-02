package day12_stringManupolition;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soy=scan.nextLine();

        if (isim.length()<soy.length()){
            System.out.println("soyisminiz daha uzun");
        }else if (soy.length()<isim.length()){
            System.out.println("isminiz daha uzun");
        }else
            System.out.println("uzunlukları eşit");

    }
}
