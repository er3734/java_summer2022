package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];

        System.out.println(sayilar);//[I@19dfb72a
        //non primitive data türündeki dataları her zamn direkt yazdıramayabiliriz
        //Arrayi yazdırmak için
        // Array clasısından toString methodu kullanırız

        System.out.println(Arrays.toString(sayilar));
        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(sayilar);//[I@19dfb72a
        System.out.println(Arrays.toString(sayilar));

        String sinifList[]={"Ali","Ayşe","Ahmet"};
        System.out.println(sinifList);//[Ljava.lang.String;@17c68925
        System.out.println(Arrays.toString(sinifList));//ali,ayşe,ahmet
        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList));//ali hasan ahmet

        System.out.println(sinifList[1]);//hasan
        System.out.println(sinifList[0]);//ali
    }
}
