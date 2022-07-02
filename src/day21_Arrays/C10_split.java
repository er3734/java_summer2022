package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split methodu bbir array methodu değil
       string methodudur ama array döndürdüğü için
       split ile herhangi bir stringi isredğimiz şekilde parcalara
       bolup bir array haline getirebiliyoruz

         */

        String str="java ne kadar güzel";
        String kelimeler[]= str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[java, ne, kadar, güzel]
        System.out.println(kelimeler.length);
        String kelimelerNe[]= str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));//[java ,  kadar güzel]
        String kelimelerE[]= str.split("e");
        System.out.println(Arrays.toString(kelimelerE));//[java n,  kadar güz, l]



    }
}
