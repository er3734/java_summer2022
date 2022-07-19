package javaITSorulari_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
       // Kullanıcıdan öğeleri alarak bir tamsayı dizisi oluşturun ve
        //ardından konsoldaki en küçük ve en büyük öğeler arasındaki farkı yazdırın.

        Random rnd=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("dizinin elemen sayısını giriniz");
        int diziUzun=scan.nextInt();

        int i=0;
        int[]dizi=new int[diziUzun];
        for (int w:dizi
             ) {
            dizi[i]= rnd.nextInt(27);
          i++;
        }
        System.out.println(Arrays.toString(dizi));
        Arrays.sort(dizi);
        int fark=dizi[dizi.length-1]-dizi[0];
        System.out.println("fark = " + fark);
    }
}
