package day23_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        Collections.sort(urunler);
        System.out.println(urunler);//[cay, cekirdek, ikram, nutella]
        /*
        list ile gelen sort methodunda sıralama ozelliğini girmek gerekiyor
        bunun yerine collection clasından sort methodunu kullanıyoruz
        bu method listemizi natural ordera gore sıralar
         */

    }
}
