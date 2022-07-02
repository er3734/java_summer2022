package day08_ifStatement;

import java.util.Scanner;

/*Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e   bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*/

public class C03_NestedifElse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("dört basmaklı sayı giriniz");
        int a= scan.nextInt();

        if (a<1000||a>9999){
            System.out.println("lutfen 4 bas giriniz");
        }else if (a%5==0){
            if (a%2==0){
                System.out.println("5'e bölünebilen çift sayı");
            }else
                System.out.println("5'bölünebilen tek sayı");
        }else
            if (a%2==0){
                System.out.println("5'e bölünemeyen çift sayı");
            }else
                System.out.println("5'bölünemeyen tek sayı");

    }
}
