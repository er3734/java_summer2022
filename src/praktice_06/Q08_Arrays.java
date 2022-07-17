package praktice_06;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_Arrays {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
     public static void main(String[] args) {
        /*
         Scanner scan=new Scanner(System.in);
         System.out.println("8 elemnalı bir dizi giriniz");

         int[]arr=new int[8];
         for (int i = 0; i <arr.length ; i++) {
             System.out.println(i+". elemnı giriniz");
             arr[i]=scan.nextInt();
         }
         System.out.println(Arrays.toString(arr));
         int sayac=0;
         for (int i = 0; i <arr.length ; i++) {
             if (arr[i]%3==0){
                 sayac++;
             }
         }
         System.out.println(sayac+" tane 3 e bölünebilen elemna vardır");*/

         Scanner scan=new Scanner(System.in);
         System.out.println("Dizinin eleman syısını girinzi");
         int boyut= scan.nextInt();

         int[]arr=new int[boyut];
         int sayac=0;
         for (int i = 0; i < arr.length ; i++) {
             System.out.println("dizinin "+ i +". elementi giriniz");
             arr[i]= scan.nextInt();
             System.out.print(arr[i]+" ");
             if (arr[i]%3==0){

                 sayac++;
             }
         }
         System.out.println("3 ebolunebilen sayı : "+ sayac);

     }

}
