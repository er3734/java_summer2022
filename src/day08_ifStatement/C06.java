package day08_ifStatement;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("bir yıl giriniz");
        int a= scan.nextInt();

        if(a%4==0){
            if (a%100==0){
                if (a%400==0){
                    System.out.println("artık yıl");
                }else
                    System.out.println("artık yıl değil");
            }else
                System.out.println("artık yıl");
        }else
            System.out.println("artık yıl değil");*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil= scan.nextInt();
        if (yil%4 != 0){
            System.out.println("Artik yil degil");
        } else if(yil%100 !=0){
            System.out.println("artik yil");
        } else if (yil%400 !=0){
            System.out.println("Artik yil degil");
        } else {
            System.out.println("artik yil");
        }




    }
}
