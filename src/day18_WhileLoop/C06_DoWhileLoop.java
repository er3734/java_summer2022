package day18_WhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
  /*  Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
   islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
    ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve
    girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
    */
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int sayi=0;
    int pozSayiAdedi=0;
    int negSayiAdedi=0;
    int pozSayilarTop=0;

    do {System.out.println("lutfen toplamak uzere poz. tam sayi girinz");
      sayi=scan.nextInt();
      if (sayi>0){
        pozSayiAdedi++;
        pozSayilarTop+=sayi;
      } else if (sayi<0) {
        System.out.println("negatif sayı giremezsiniz");
        negSayiAdedi++;
      }

    }while (sayi!=0);
    System.out.println(pozSayiAdedi +" adet poz sayı girdiniz : " +pozSayilarTop);
    System.out.println(negSayiAdedi +" adet neg sayı girdiniz");

  }
}
