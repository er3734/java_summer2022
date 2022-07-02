package alisiırmaSayfam01;

import java.util.Scanner;

public class A56AsalSayılar {
    public static void main(String[] args) {
        asalSayı();
        asalSayı();
    }
    public static void asalSayı(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayi=scan.nextInt();
        int sayac=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sayac++; }
        }
        if (sayac ==0){
            System.out.println("sayı asaldır");
        }else {
            System.out.println("sayı asal değildir");
        }
    }
}
