package alisiırmaSayfam01;

import java.util.Scanner;

public class A70DoWhileO6 {
    public static void main(String[] args) {
        int top=0;
        int sayac=0;
        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen bir sayı giriniz");
            int a= scan.nextInt();
            top+=a;
            sayac++;
        }while (top<=500);
        System.out.println(sayac+ " adet sayı girdiniz");
        System.out.println("top = " + top);




    }
}
