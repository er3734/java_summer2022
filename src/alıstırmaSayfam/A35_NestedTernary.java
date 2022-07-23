package alıstırmaSayfam;

import java.util.Scanner;

public class A35_NestedTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a= scan.nextInt();
        System.out.println((a<10)?"rakam":((a<100)?"iki basamaklı":"üç basamaklı"));
    }
}
