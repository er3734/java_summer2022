package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        //Co5 teki nethodu kullanaral arraye eleman ekleyelim

        String takimListesi[]={"süleyman","osman"};
        String eklenecekIsim="talha";


        takimListesi=C05_ElementEkleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));

    }
}
