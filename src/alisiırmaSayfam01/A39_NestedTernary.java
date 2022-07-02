package alisiırmaSayfam01;

import java.util.Scanner;

public class A39_NestedTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a= scan.nextInt();
        System.out.println(a>=100&&a<=999?"üç basamaklı":"üç basamaklı değil");
    }
}
