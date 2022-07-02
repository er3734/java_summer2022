package javaITSorulari_Arrays;

import java.util.Arrays;

public class S07 {
    public static void main(String[] args) {
        //Bir Dizedeki ünlülerin sayısını bulun
        String s = "Apex, nesne ayönelimli abir programlama dilidir";
        String[]dizi=s.toLowerCase().split("");
        System.out.println(Arrays.toString(dizi));
        int sayac=0;
        for (int i = 0; i < dizi.length ; i++) {
            switch (dizi[i]){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    sayac++;
                    break;
            }

        }
        System.out.println(sayac+" adet sesli harf vardır");
    }
}
