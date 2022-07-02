package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Soru 10 ) Kullanicidan iki sayi isteyin.
        //Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        //sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. ve 2. poz tam sayıyı giriniz");
        int bas=scan.nextInt();
        int bitis=scan.nextInt();

        aralarıTopla(bas,bitis);
    }
    public static void aralarıTopla(int bas, int bitis) {
        int top=0;
        if (bas<=bitis){
            for (int i = bas; i <=bitis ; i++) {
                top+=i;
            }
        }else {
            for (int i = bas; i >=bitis ; i--) {
                top+=i;
            }
        }
        System.out.println("Aradaki sayıların top = " + top);
    }
}
