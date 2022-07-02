package day15_verloading_forLoop;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk bir sayı giriniz");
        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0||i%5==0){
                System.out.println("i = " + i);
            }
        }
    }
}
