package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        wrapper class javanın haızr methodalrı kullanbilmemiz için
        prmt. data türlerinin her biri açtığıClass lardır
         */

        String str= "java ile hayat ne guzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi=true;
        Boolean buguzelMİ=true;
        buguzelMİ.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String telNo= "22234";

        Scanner scan=new Scanner(System.in);
        System.out.println("5 bas. şifre gir");

        String sif=scan.nextLine();

        Integer sifSayi= Integer.parseInt(sif);

        System.out.println("gir sifre : "  + (sif+3));
        System.out.println("intger sifre : " + (sifSayi+3));


    }
}
