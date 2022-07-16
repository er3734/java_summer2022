package day21_Arrays;

import java.util.Arrays;

public class C05_ElementEkleme {
    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method oluşturun

        String [] sinifListesi={"Ali Can","Nida Yücedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayiğit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniSinifListesi=new String[sinifListesi.length+1];
        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;

        return yeniSinifListesi;
    }
}
