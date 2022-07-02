package alisiırmaSayfam01;

import java.util.Scanner;

public class A01_IkininKatları {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int a=scan.nextInt();
        int k=1;
        while(k<=a){
            System.out.println(k);
            k*=2;
        }

    }
}
