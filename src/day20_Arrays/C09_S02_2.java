package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_S02_2 {
    public static void main(String[] args) {
        int sayilar[]=new int[5];
        int dtop=0;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <sayilar.length ; i++) {
            System.out.println("dizide toplanacak sayıyı giriniz");
            sayilar[i]=scan.nextInt();
            dtop+=sayilar[i];
        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println(dtop);

        int carpım=sayilar[0]*sayilar[1]*sayilar[2]*sayilar[3]*sayilar[4];
        System.out.println(carpım);
    }
}
