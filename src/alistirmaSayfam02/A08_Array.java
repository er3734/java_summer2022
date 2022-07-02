package alistirmaSayfam02;

import java.util.Arrays;

public class A08_Array {
    public static void main(String[] args) {
        // Soru : İki farklı dizideki ortak elemanları bulup,
        // yeni oluşturulan boş diziye aktaran java örneği.
        // İki dizideki ortak elemanları bulup,
        // ortak olan eleman sayısını alacak kadar boş yeni bir dizi oluşturun
        // ve bu ortak elemanları bu boş diziye aktarıp yazdırın.
        // Örneğe göre : [1, 3, 5, 6, 9]
        int dizi1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int dizi2[] = {5, 3, 14, 6, 9, 20, 1};//1,3,5,6,9,

        int ortakDiziSayisi=0;
        String ortak="";

        for (int i = 0; i <dizi1.length ; i++) {
            for (int j = 0; j <dizi2.length ; j++) {
                if (dizi1[i]==dizi2[j]){
                    ortakDiziSayisi++;
               ortak+=dizi1[i];
                }
            }
        }
        System.out.println(ortakDiziSayisi);
        System.out.println(ortak);
        int ortakDizi[]=new int[ortakDiziSayisi];
        for (int i = 0; i <ortakDizi.length ; i++) {
            ortakDizi[i]= Integer.parseInt(ortak.substring(i,i+1));

        }
        System.out.println(Arrays.toString(ortakDizi));

    }
}
