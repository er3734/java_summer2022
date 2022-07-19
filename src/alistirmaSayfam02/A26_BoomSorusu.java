package alistirmaSayfam02;

import java.util.Arrays;

public class A26_BoomSorusu {
    public static void main(String[] args) {
       // sayılardan oluşan bir diziyi parametre olarak alan  ve dizide 7 rakamı  var ise  "Boom!"
        // ifadesini; aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
        /*Örnek çıktı:
                [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"     */

        int[]dizi={1, 2, 3, 4, 5, 6, 1};

        diziBoom(dizi);}


    private static void diziBoom(int[] dizi) {
        String[]strDizi=new String[dizi.length];
        for (int i = 0; i < dizi.length ; i++) {
            strDizi[i]= String.valueOf(Integer.valueOf(dizi[i]));
        }
        System.out.println(Arrays.toString(strDizi));
        int sayac=0;
        for (String w:strDizi
        ) {
            if (w.contains("7")){
                System.out.println("Boom!");
            }else {
                sayac++;
            }
        }
        if (sayac==strDizi.length){
            System.out.println("dizide 7 rakamı yok");
        }
    }
    }

