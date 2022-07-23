package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
       bir list olusturalim
  iki ayri method'dan birinde
  sadece elemanlari degistirelim

  digerinde yeni bir list atayip,
  ayni sayida yeni leman ekleyelim

  ve her iki method call'dan sonra kendi listemizi
  main method icerisinde kontrol edelim
         */
        List<String>list=new ArrayList<>();
        list.add("ali");
        list.add("veli");
        list.add("can");
        System.out.println("ilk basta list: "+list);//ali veli can
        elemanlariDegistir(list);
        System.out.println("elemandgistir methodundan sora list : "+list);//oguz murat fatih
        listDegistir(list);
        System.out.println("listdegistir methodundan sonra : "+list);//oguz murat fatih
    }

    private static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("nutella");
        list.add("cay");
        list.add("cokakrem");
        System.out.println("listDgistir methodunda : "+list);//nutella cay cokakrem
    }

    public static void elemanlariDegistir(List<String> list) {
        list.set(0,"oguz");
        list.set(1,"murat");
        list.set(2,"fatih");
        System.out.println("elemanDegistir methodunda : "+list);////oguz murat fatih
    }
}
