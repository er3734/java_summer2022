package r01_recap;

import java.util.Scanner;

public class Q04_NotHesaplama {

        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen 1. vizeyi giriniz");
            int vize1= scan.nextInt();
            System.out.println("lutfen 2.vizeyi giriniz");
            int vize2= scan.nextInt();
            System.out.println("final notunuzu giriniz");
            int finl=scan.nextInt();
            
            double ort=((vize1+vize2)/2)*0.3+finl*0.7;
            System.out.println("ort = " + ort);
        }

}