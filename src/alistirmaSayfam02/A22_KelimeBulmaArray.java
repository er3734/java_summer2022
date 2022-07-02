package alistirmaSayfam02;

import java.util.Arrays;
import java.util.Scanner;

public class A22_KelimeBulmaArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cımle giriniz");
        String cumle=scan.nextLine();

        kelimeSayisi(cumle);
    }

    public static void kelimeSayisi(String cumle) {
        String []cumele =cumle.split(" ");
        System.out.println(Arrays.toString(cumele));
        System.out.println(cumele.length+ " tane kelime vardır");
    }
}
