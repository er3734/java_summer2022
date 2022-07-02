package day14_methodCreation;

import day13_MethotCreation.C04_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /* Eger bir class'İn icerisinde herhangi bir hesaplama yapip bunu da kalici olarak saklamak istersek
kodumuzu sade ve anlasilir tutmak icin islemi bir method'da yapip
sonucunu main methoda dondurebiliriz
Return type'ı void olmayan bir methodun soncunu main method'da bir variable'a atama yaparsak programin geri kalaninda
bu yeni degeri kullanma sansimiz olur

 */
        //kulanıcıdan şehir ismini ve doğum tarihini alıp
        //buları prog.da kullanacağımız formatta bir method oluşturun
        // şehir ismini programnızda büyük harf olarak
        // tarihi ise 2022-06-30 şeklinde kullanmak istiyoruz



        String sehir=sehirAl();
        String tarih=tarihAl();
        String sehir1=sehirAl();
        String seh2=sehirAl();
        String tarih2=tarihAl();

        System.out.println("giridiğiniz şehir : " +sehir);
        System.out.println("giridğiniz tarih : " +tarih );
        System.out.println(sehir1);
        System.out.println(seh2);
        System.out.println(tarih2);

        System.out.println(seh2+sehir+sehir1);

        C01_MethodCreation.terstenYazdir("erdi");
        C02_MethodCreation.rakamlariTopla(123);
        C03_MethodCreaion.ismiGizle("erdi","balta");
        C04_MethodCreation.topla(56,23);


    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yil=scan.nextInt();
        if (yil>1900&&yil<2100){
            tarih=yil+"-";
        }else {
            System.out.println("yıl için gecerli bir sayı yaznız");
        }
        System.out.println("ay giriniz");
        int ay= scan.nextInt();
        if (ay<=0||ay>12){
            System.out.println("ay için gecerli bir sayı giriniz");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("gün giriniz");
        int gun=scan.nextInt();
        if (gun<=0||gun>31){
            System.out.println("gecerli bir sayı giriniz");
        } else if (gun<10) {
            tarih=tarih+"0"+gun;
        }else {
            tarih=tarih+gun;
        }
        return tarih;
    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen şehrinizi giriniz");
        String sehir=scan.nextLine().toUpperCase();

        return sehir;
    }
}
