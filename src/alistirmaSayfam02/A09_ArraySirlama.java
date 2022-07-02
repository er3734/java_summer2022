package alistirmaSayfam02;

import java.util.Arrays;

public class A09_ArraySirlama {
    public static void main(String[] args) {
        int sayilar[]={1,3,6,2,4,5,9,7};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(sayilar.length);
        int sayilar2[]=new int[sayilar.length];
        int sayac=0;
        for (int i = sayilar.length-1; i >=0 ; i--) {
            sayilar2[sayac]=sayilar[i];
            sayac++;
        }
        System.out.println(Arrays.toString(sayilar2));

    }
}
