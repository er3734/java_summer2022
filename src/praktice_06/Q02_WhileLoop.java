package praktice_06;

import java.util.Scanner;

public class Q02_WhileLoop {

     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("bir sayı giriniz");
         int sayi=scan.nextInt();
         int i=0;
         while (i<=sayi){
             if (i%2!=0){
                 System.out.print(i+",");
             }
             i++;
         }


     }
}
