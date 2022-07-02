package alisiırmaSayfam01;

import java.util.Scanner;

public class A71DoWhileO4 {
    public static void main(String[] args) {
        int top = 0;
        int nsayac = 0;
        int psayac = 0;
        int a;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen bir sayı giriniz," +
                    "işlemi bitirmek için 0 a basınız");
            a = scan.nextInt();
            if (a < 0) {
                System.out.println("negatif sayı giremezsin");
                nsayac++;
            }else if(a>0){
                top += a; psayac++;}
            else {}
        } while (a != 0);
        System.out.println(psayac+" adet poz. sayı girdiniz");
        System.out.println("top = " + top);
        System.out.println(nsayac+" adet neg. sayı girdinz");
    }
}
