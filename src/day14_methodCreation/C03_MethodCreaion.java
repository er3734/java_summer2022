package day14_methodCreation;

import methodCalıs.M10PolidromMet;
import methodCalıs.M8SkorHesapla;

public class C03_MethodCreaion {
    public static void main(String[] args) {

        //input olarak verilen isim ve soyismi
        // ilk harfi büyük geriye kalan harfler yıldız olacak şekilde yaz.

        String isim="Enes";
        String soy="Bozkurt";
        String ad="erdi";
        String sad="fatih";

        ismiGizle(ad,sad);
        ismiGizle(isim,soy);
        System.out.println(isim+ " " + soy);
        ismiGizle("hatice","nur");


    }

    public static void ismiGizle(String isim, String soy) {

      isim=  isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

      soy=soy.substring(0,1).toUpperCase()+soy.substring(1).replaceAll("\\w","*");

      System.out.println(isim+soy);



    }
}
