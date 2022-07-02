package day23_list;

import java.util.Arrays;

public class C13_S04 {
    public static void main(String[] args) {
        // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin
        //Arraylist kullanmadan cözüm

        String[]sehirler={"istanbul","ankara","mersin","konya","kastamonu"};
        String istenmeyenHarf="a";

        int sayac=0;
        for (int i = 0; i <sehirler.length ; i++) {
            if(sehirler[i].contains(istenmeyenHarf)){
                sayac++;
            }
        }

        String []kalanSehirler=new String[sehirler.length-sayac];

        int a=0;

        for (int i = 0; i < sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
            kalanSehirler[a]=sehirler[i];
            a++;}
        }
        sehirler=kalanSehirler;
        System.out.println(Arrays.toString(sehirler));
    }
}
