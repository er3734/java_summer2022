package alisiırmaSayfam01;

import java.util.Scanner;

public class A64WhileO6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int a= scan.nextInt();
        int i=1;
        int sayac=0;
        while (i<=a){
            if (a%i==0){
                System.out.print(i+",");
                System.out.print("-"+i+",");
                sayac++;
            }
            i++;
        }
        System.out.println("");
        System.out.println((2*sayac)+" tane tam bolen sayısı vardır ");

    }
}
