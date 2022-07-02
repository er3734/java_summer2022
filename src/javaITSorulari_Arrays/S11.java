package javaITSorulari_Arrays;

import java.util.Arrays;

public class S11 {
    public static void main(String[] args) {
        //Tüm sıfırları bir tamsayı dizisinde sona erdirmek için kodu yazın.


        int[] dizi = {5, 0, 3, 0, 4, 8,0,3,0,34,2,0,0,3};
        int[] yeniDizi = new int[dizi.length];
        int a=0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] != 0) {
                yeniDizi[a] = dizi[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(yeniDizi));
    }

}
