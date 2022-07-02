package day03_scanner;

import java.util.Scanner;

public class C08_2ScannerHartf {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("tc nizi giriniz");
        char tc=scan.next().charAt(4);
        System.out.println("tc'nizin 5.harfi : " + tc);

    }

}
