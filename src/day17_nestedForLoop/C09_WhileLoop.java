package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        /*
      Kullanicidan bir sifre girmesini isteyin.
      Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
      sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
       ve basarılı şifre girinceye kadar tekrar şifre girmesini isteyi
        - Ilk harf buyuk harf olmali
       - Son harf kucuk harf olmali
         - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
                                             */
        Scanner scan=new Scanner(System.in);
        String sifre="";
        boolean sBasMi=false;
        int kontrol=0;

        while (kontrol!=4){
            System.out.println("lutfen sifre giriniz");
            sifre=scan.nextLine();

            if (sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z'){
                kontrol++;
            }else {
                System.out.println("ilk harf buyuk olmalı");
            }
            if (sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z'){
                kontrol++;
            }else {
                System.out.println("son harf kucuk olmalı");
            }
            if (sifre.contains(" ")){
                System.out.println("sifre bosluk içermemli");
            }else {
                kontrol++;
            }
            if (sifre.length()>=8){
                kontrol++;
            }else {
                System.out.println("sifre en az sekiz karekter olmalı");
            }
            if (kontrol==4){
                System.out.println("sifre basarılı");
                sBasMi=true;
            }else {
                kontrol=0;}
        }
    }
}
