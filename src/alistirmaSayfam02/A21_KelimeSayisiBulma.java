package alistirmaSayfam02;

import java.util.Scanner;

public class A21_KelimeSayisiBulma {
    /*Java Girilen Cümledeki Kelime Sayısını Bulma
    kullanıcıdan alınan cümlede kaç tane kelime olduğunu bulup ekrana yazdıracağız
     */
    public static void main(String[] args) {
        Scanner al=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle=al.nextLine();
        int syac=1;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.substring(i,i+1).contains(" ")){
                syac++;
            }
        }
        System.out.println(syac + " kelime içeriyor");

    }
}
