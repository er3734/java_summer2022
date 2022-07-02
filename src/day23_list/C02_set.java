package day23_list;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        elimizde urunlerin bir liste var
        ürün listesindeki istenen sıradaki ürünü
        istediğmiz yeni ürünle  değiştirip
        eski ürünü varolan eski ürünler listesine ekleyelim
         */
        List<String>urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");
        List<String>eskiUrunler=new ArrayList<>();
        //listedeki ikramın yerine biskrem koyalım
        //ikramı da eski ürünler listesine ekleyelim

        String yeniUrun="biskrem";
        String sileneckUrun="ikram";

        int temp=urunler.indexOf(sileneckUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : "+urunler);
        System.out.println("eski urunler listesi : "+eskiUrunler);

       yeniUrun="kahve";
       sileneckUrun="cay";

       temp=urunler.indexOf(sileneckUrun);
       silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : "+urunler);
        System.out.println("eski urunler listesi : "+eskiUrunler);

        yeniUrun="findik";
        sileneckUrun="cekirdek";

        temp=urunler.indexOf(sileneckUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : "+urunler);
        System.out.println("eski urunler listesi : "+eskiUrunler);

    }
}
