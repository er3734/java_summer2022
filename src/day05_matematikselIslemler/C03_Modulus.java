package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayı=scan.nextInt();
        int rakTop=0;
        int girilenSayı=sayı;

        while(sayı!=0){
            rakTop+=sayı%10;
            sayı=sayı/10;

        }


       /* rakTop+=sayı%10;
        sayı=sayı/10;

        rakTop+=sayı%10;
        sayı=sayı/10;


        rakTop+=sayı%10;
        sayı=sayı/10;

        rakTop+=sayı%10;
        sayı=sayı/10;

        rakTop+=sayı%10;
        sayı=sayı/10;

        rakTop+=sayı%10;
        sayı=sayı/10;*/

        System.out.println(girilenSayı + " sayısının rakamlar toplamı : " + rakTop);


    }
}
