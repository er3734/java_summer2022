package alisiırmaSayfam01;

import java.util.Scanner;

public class A31_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayı giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println((a>b)?b:a);

    }
}
