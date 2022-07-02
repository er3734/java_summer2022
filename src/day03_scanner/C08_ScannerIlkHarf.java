package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        /*
        kullanıcıdan ismini alıp ilk harfini büyük harfle yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        /*java Scanner classında nextchar methodu yoktur
        bunu yerine string olarak ilk kelimeyi alıp onunda ilk harfini alabiliriz
         */
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi " + ilkHarf);
    }
}
