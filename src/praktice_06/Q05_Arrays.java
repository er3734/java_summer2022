package praktice_06;

import java.util.Arrays;

public class Q05_Arrays {
    	/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

    public static void main(String[] args) {
        int[]dizi={2,6,4,5,8,9};
        int[]ydizi=new int[dizi.length];


        karelerToplami(dizi,ydizi);
    }

    public static void karelerToplami(int[] dizi,int[]ydizi) {
        int carpim=1;
        for (int i = 0; i <dizi.length ; i++) {
            carpim=dizi[i]*dizi[i];
            System.out.print(dizi[i]*dizi[i]+" ");
            ydizi[i]=carpim;

        }
        System.out.println();
        System.out.println(Arrays.toString(ydizi));
    }
}
