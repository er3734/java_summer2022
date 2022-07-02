package alıstırmaSayfam;

import java.util.Scanner;

public class A38_NestedTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("geniş kenarı giriniz");
        int a= scan.nextInt();
        System.out.println("uzun kenarı giriniz");
        int b= scan.nextInt();

        System.out.println(a==b?"kare":"dikdörtgen");
    }
}
