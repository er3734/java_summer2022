package alisiırmaSayfam01;

import java.util.Scanner;

public class A03AritmatikTop {
    public static void main(String[] args) {
        Scanner scann =new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı= scann.nextInt();
        int t=0;

        for(int i=0;i<=sayı;i+=3) {
            t += i;
            System.out.println(i + "  =  " + t);
        }


        /*while(sayı>=0){
            t+=sayı;
            sayı-=2;
        }
        System.out.println(t);*/


    }
}
