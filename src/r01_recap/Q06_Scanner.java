package r01_recap;

import java.util.Scanner;

public class Q06_Scanner {


    /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("işçi sayısı");
        double isci=scan.nextDouble();
        System.out.println("iş yapma suresi");
        double issure=scan.nextDouble();
        double isBitme=(issure)/isci;

        System.out.println("isBitme = " + isBitme);
    }


}