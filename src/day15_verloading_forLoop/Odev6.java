package day15_verloading_forLoop;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir sayı giriniz");
        int say= scan.nextInt();
        for (int i = 1; i <=say ; i++) {
            if (i%15==0){
                System.out.println(i+ " Java Guzeldir");
            } else if (i%5==0) {
                System.out.println(i +" guzeldir");
            } else if (i%3==0) {
                System.out.println(i+ " Java");
            }else
                System.out.println(i);

        }
    }
}
