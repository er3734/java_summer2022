package day12_stringManupolition;

public class Odev7 {
    public static void main(String[] args) {

        String isim="Erdi";
        String soy="Balta";
        String kno="1234 4567 8901 3456";

        String isilkHarf=isim.substring(0,1).toUpperCase();
        String isGeriyeKalan=isim.substring(1).replaceAll("\\w","*");

        String soyilkHarf=soy.substring(0,1).toUpperCase();
        String soyGeriyeKalan=soy.substring(1).replaceAll("\\w","*");

        String knoSon=kno.substring(15,19);
        String knoilk="**** **** ****";

        System.out.println("isim-soyisim : " + isilkHarf+isGeriyeKalan+soyilkHarf+soyGeriyeKalan + "\n" +
                "kart no : " + knoilk + " " + knoSon);
    }
}
