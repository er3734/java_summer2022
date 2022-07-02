package day14_methodCreation;

import java.util.Scanner;

public class C08_Methodret {
    public static void main(String[] args) {
         /*
        Kullanicidan ismini,soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin
        isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
        KK numarasini ise 4 rakamlik 4 blok olacak sekilde duzelten 2 method yazin,ve programda kullanabilmek
        icin duzenlenmis hallerini geri dondurun
         */
        System.out.println(kullaniciIsim());
        System.out.println(kartNo());
        System.out.println(yasBilgisi());

    }
    public static String kullaniciIsim(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminiz giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyadınızı giriniz");
        String soy=scan.nextLine();

        String sonIsim=isim.substring(0,1).toUpperCase().concat(isim.substring(1).toLowerCase());
        String sonSoy=soy.substring(0,1).toUpperCase().concat(soy.substring(1).toLowerCase());
        return sonIsim+" "+sonSoy;
    }
    public static String kartNo(){
        Scanner scan=new Scanner(System.in);
        System.out.println("kart numarssını giriniz");
        String kNo=scan.nextLine();
        String sonDort="**** **** **** "+kNo.substring(15,19);

        return sonDort;
    }
    public static int yasBilgisi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasşınız giriniz");
        int yas = scan.nextInt();
        int yyas = 0;
        if (yas < 0 || yas > 120) {
            System.out.println("gcersiz yaş aralığı");
        } else {
            yyas = yas;
        }
        return yyas;
    }
}
