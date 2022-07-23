package alıstırmaSayfam;

import java.util.Scanner;

public class A06HaftanınGunleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir günün ilk harfini yazın");
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        if(ilkHarf == 'P'){
            System.out.println("pazar,pazarteesi veya perşembe");
        }else if(ilkHarf =='C'){
            System.out.println("carsamba,cuma veya c.tesi");
        }else if(ilkHarf=='S') {
            System.out.println("salı");
        }else
            System.out.println("yanlış bir harf girdiniz");
    }
}
