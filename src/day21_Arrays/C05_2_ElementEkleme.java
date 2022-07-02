package day21_Arrays;

import arrayler.A07ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class C05_2_ElementEkleme {
    public static void main(String[] args) {
        int numaralar[]={234,456,331,3232,897,222};
        Scanner scan=new Scanner(System.in);
        System.out.println("eklenecek numarayı giriniz");
        int numara= scan.nextInt();
        System.out.println("eklenecek 2. numarayı giriniz");
        int numara2=scan.nextInt();

        System.out.println(numaralar.length);

        int[]yeniArray=diziEkleme(numara,numaralar,numara2);
        System.out.println(Arrays.toString(yeniArray));
        System.out.println(yeniArray.length);
    }

    private static int[] diziEkleme(int numara, int[] numaralar,int numara2) {
        int eklenmisArray[]=new int[numaralar.length+2];
        for (int i = 0; i <numaralar.length ; i++) {
            eklenmisArray[i]=numaralar[i];
        }
        eklenmisArray[eklenmisArray.length-1]=numara;
        eklenmisArray[eklenmisArray.length-2]=numara2;
        return eklenmisArray;
    }
}
