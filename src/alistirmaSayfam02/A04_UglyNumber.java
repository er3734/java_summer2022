package alistirmaSayfam02;

public class A04_UglyNumber {
    public static void main(String[] args) {
        /*
                Ugly Number:

        Girilen bir sayının  ugly number olup olmadığını
        kontrol etmek için bir Java programı yazın.
                Sayı sisteminde,  ugly number  sadece asal faktörleri
        2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number
        1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

        Test Data:
        13

        Beklenen çıktı:
        ugly number  degildir

        Test Data:
        25
        Beklenen Çıktı:

        ugly number*/

        int sayi=12;
        String asal="";
        for (int i = 2; i <sayi ; i++) {
            if(sayi%i==0){
                asal+=i;
            }

        }
        System.out.println(asal);

    }
}
