package alisiırmaSayfam01;

import java.util.Scanner;

public class A32_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a= scan.nextInt();
        System.out.println((a%2==0)?"çift":"tek");
    }
}
