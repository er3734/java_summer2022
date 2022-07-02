package day07_ifStatments;

import java.util.Scanner;

public class C06_ifElseEmeklli {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yaşınızı giriniz");
        int yas= scan.nextInt();

        if (yas<0||yas>130){
            System.out.println("lutfen gecerli bir yaş giriniz");
        }else if (yas<65){
            System.out.println("emekli olamazsın, " + (65-yas)+ " yıl daha calışmalısın");
        }else {
            System.out.println("emekli olablirsin");
        }
    }
}
