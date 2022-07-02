package r01_recap;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {

       int input=12345;

        int bes=input%10;
        input/=10;
        int dort=input%10;
        input/=10;
        int uc=input%10;
        input/=10;
        int iki=input%10;
        input/=10;
        int bir=input%10;

        System.out.println(bir+iki+dort+bes);

   //Scanner al=new Scanner(System.in);
   //    System.out.print("5 Basmaklı Sayı Girin :");
   //    int sayi=al.nextInt();

   //    int b1=(sayi/10000)%10; // 1.basamak
   //    int b2=(sayi/1000)%10;  // 2.basamak
   //    int b4=(sayi/10)%10;  // 4.basamak
   //    int b5=(sayi)%10; // 5.basamak

   //    System.out.println("Toplam : "+ (b1+b2+b4+b5));

   //   Scanner scan=new Scanner(System.in);
   //   System.out.println(" 5 bas sayı giriniz");
   //   int s= scan.nextInt();

   //   int ilkiki=s/1000;//12
   //   int soniki=s%100;//45

   //   int bir=ilkiki/10;//1
   //   int iki=ilkiki%10;//2

   //   int uc=soniki/10;//4
   //   int dort=soniki%10;//5

   //   System.out.println(bir+iki+uc+dort);
    }
}