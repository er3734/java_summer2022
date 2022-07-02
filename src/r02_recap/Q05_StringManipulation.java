package r02_recap;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin,
    // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyisminiz giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisminiz giriniz");
        String soyIsim=scan.nextLine();
        String fuulName=isim.concat(" ").concat(soyIsim).toUpperCase();
        System.out.println("fuulName = " + fuulName);

       // System.out.println("soyisminiz giriniz");
        //String soyIsim=scan.nextLine();
        //System.out.println(isim.toUpperCase().concat(soyIsim.toUpperCase()));


    }
}