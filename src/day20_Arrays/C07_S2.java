package day20_Arrays;

import java.util.Arrays;

public class C07_S2 {
    public static void main(String[] args) {
        int rakamlar[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(rakamlar));
        for (int i = 0; i <rakamlar.length ; i++) {
            if (i<rakamlar.length-1) {
                System.out.print(rakamlar[i] + ",");
            }else
                System.out.println(rakamlar[rakamlar.length-1 ]);
        }

    }
}
