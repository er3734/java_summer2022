package day22_MultiDimensionalArray;

import arrayler.A07ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        /*
        list primitive data türlerini kabul etmez
         */

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);
        /*
        sadece add kulanırsak java sona ekler
         */
        sayilar.add(2,10);//indexi 2 olan yere 10 elemntyini ekleyelim
        System.out.println(sayilar);//[5, 3, 10, 7]
        /*
        add(index,element) istediğimiz indexe istediğimiz elemnti yerleştirir
        add methodu eski elementleri silmez veya update etmez yeni elemnt ekler
         */
        sayilar.add(4,5);
        System.out.println(sayilar);
    }
}
