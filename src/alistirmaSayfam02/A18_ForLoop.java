package alistirmaSayfam02;

import java.util.Scanner;

public class A18_ForLoop {
    public static void main(String[] args) {
       /* Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
        o ana kadar kaç sayı girildiği ekrana yazdırılacak.
        bu soruyu hem for-loop hemde while -do döngüsü ile yapınız.*/
        Scanner scan=new Scanner(System.in);
        int top=0;
        int sayac=0;

        for (int i=1; top<=100; i++){
            System.out.println(i+". sayıyı giriniz");
            int sayi=scan.nextInt();
            top+=sayi;
            sayac++;
        }
        System.out.println(top);
        System.out.println(sayac);

    }
}
