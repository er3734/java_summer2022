package day20_Arrays;

import java.util.Arrays;

public class C09_S2_1 {

    //soru 1: Verilen 3 elemanli bir array’in tum elemanlarini
    // bir soldaki konuma tasiyacak bir program yazin.
    // Ornek; array [1,2, 3] ise output [2, 3, 1] olacak

    public static void main(String[] args) {
        int nmr[]={0,1,2,3,4,5,6,7,8,9};

        int temp=nmr[0];
        for (int i = 0; i <nmr.length-1 ; i++) {
            nmr[i]=nmr[i+1];
        }
        nmr[nmr.length-1]=temp;
        System.out.println(Arrays.toString(nmr));

        //yukarıda değiştirdiğimiz arrayi
        // ilk durumuna getirmek için sağa kaydıralım
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
        temp=nmr[nmr.length-1];
        for (int i = nmr.length-1; i >0; i--) {
            nmr[i]=nmr[i-1];
        }
        nmr[0]=temp;
        System.out.println(Arrays.toString(nmr));


    }
}
