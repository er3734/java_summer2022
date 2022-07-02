package day14_methodCreation;

public class C04_MethodCreationRetun {

    //verilen isim ve soyismi ilk harfi büyük geriye kalanklatı * olacak
    // şekilde değitirip bize bu halini dödüren bir method aoluşturun
    // Not: prog. ielerleyen kısmların da isim ve soy ismi bu şekilde kullanmak istiyoruz
    public static void main(String[] args) {

        String isim="Enes";
        String soy="Bozkurt";

        String gizliIsim=isimGizle(isim,soy);
        System.out.println(isim+ " " +soy);
        System.out.println(gizliIsim);
        isimGizle("ahmet","cetin");
        System.out.println(isimGizle("ahmet","can"));
    }

    public static String isimGizle(String isim, String soy) {
        isim=  isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        soy=soy.substring(0,1).toUpperCase()+soy.substring(1).replaceAll("\\w","*");

       //System.out.println(isim+soy);

        return isim+ " " +soy;
    }

}
