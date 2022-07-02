package alisiırmaSayfam01;

import java.util.Scanner;

public class A69DoWhileO5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sifre ="";
        int sayac = 0;

        while(sayac!=5) {
          System.out.println("lutfen şifrenizi giriniz");
          sifre=scan.nextLine();
          int i=0;
          int kontrol =0;
          int kontrolb=0;
          int kontrolc=0;
          do {
              if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                  kontrol++;
              }
              if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                  kontrolb++;
              }
              if (!(sifre.charAt(i)>='a'&&sifre.charAt(i)<='z'||sifre.charAt(i)>='A'
                      &&sifre.charAt(i)<='Z'||sifre.charAt(i)>='0'&&sifre.charAt(i)<='9')){
                  kontrolc++;
              }
              i++;
          } while (i < sifre.length());

          if (kontrol == 0) {
              System.out.println("şifre küçük harf içermeli");
          } else {
              sayac++;
          }
          if (kontrolb == 0) {
              System.out.println("şifre büyük harf içermeli");
          } else {
              sayac++;
          }
          if (kontrolc==0){
              System.out.println("şifre özel karekter içermeli");
          }else {
              sayac++;
          }
          if (sifre.length() < 8) {
              System.out.println("şifre en az sekiz karekter olmalı");
          } else {
              sayac++;
          }
          if (sifre.contains(" ")){
              System.out.println("şifre boşluk içermemeli");
          }else {
              sayac++;
          }
          if (sayac==5){
              System.out.println("şifre başarılı");
          }else {
              sayac=0;
          }
        }
    }
}
