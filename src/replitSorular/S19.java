package replitSorular;

import java.util.Scanner;

public class S19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminiz giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyiminizi giriniz");
        String soy=scan.nextLine();
        System.out.println("kredi k<artı numaranızı giriniz");
        String kno=scan.nextLine();

        String ilkI=isim.substring(0,1).toUpperCase();
        String geriI=isim.substring(1).replaceAll("\\w","*");

        String ilkS=soy.substring(0,1).toUpperCase();
        String soyS=soy.substring(1).replaceAll("\\w","*");

        String knoSon=kno.substring(14,19);
        String knoIlk="**** **** **** ";

        System.out.println(ilkI.concat(geriI).concat(ilkS).concat(soyS));
        System.out.println(knoIlk.concat(knoSon));

    }
}
