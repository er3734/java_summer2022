package day12_stringManupolition;

import java.util.Scanner;

public class Odev6_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sifre gir");
        String sifre = scan.next();
        char ilkharf = sifre.charAt(0);
        //System.out.println(ilkharf);
        char sonharf = sifre.substring(sifre.length() - 1).charAt(0);
        //System.out.println(sonharf);
        int bosluk = sifre.trim().length();
        System.out.println(bosluk);
        int uzunluk = sifre.length();


        if (ilkharf >= 'A' && ilkharf <= 'Z' && sonharf >= 'a' && sonharf <= 'z' && bosluk == uzunluk && uzunluk >= 8) {
            System.out.println("islem basari ile tamamlandi");

        } else {
            System.out.println("islem basarisiz lutfen gecerli bir sifre yaziniz");
        }

    }
}
