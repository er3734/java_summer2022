package day23_list;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");
        urunler.add("ikram");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram"));
        System.out.println(urunler);

        /*
        index of methodu bize bilgi donduren bir methoddur
        listemizi değiştirmez
         */
        System.out.println(urunler.indexOf("ikram"));//1

        urunler.lastIndexOf("ikram");
        System.out.println(urunler.lastIndexOf("ikram"));//4


        /*
        indexof methodu aramaya 0. indexten lastindexof methodu ise
        aramaya son indexten başlar

        arama bitip urun bulunduğunda ikiside bulunan urunun indexini verir
         */

        System.out.println(urunler.indexOf("hobby"));//-1
        System.out.println(urunler.lastIndexOf("hobby"));//-1

    }
}
