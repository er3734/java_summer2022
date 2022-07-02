package day23_list;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        /*
           remove methodu iki şekşlde kı-ullaaınlır
            1 0bjeyi yazıp silmemizi istersek boolean sonuc doner
             2-index girersek o indexteki elemanı siler
             bize silinen elemnaı dondurur
        */

        System.out.println(urunler);//[nutella, ikram, cekirdek, cay]
        System.out.println(urunler.remove("ikram"));//true
        System.out.println(urunler);//[nutella, cekirdek, cay]
        System.out.println(urunler.remove("hobby"));//false
        System.out.println(urunler);//[nutella, cekirdek, cay]

        //ikinci yonten index girelim

        System.out.println(urunler.remove(1));////cekirdek
        System.out.println(urunler);//[nutella, cay]

        //olmayan bir indexi silmeye çalışırsak
        //System.out.println(urunler.remove(3));//RTE verir
    }
}
