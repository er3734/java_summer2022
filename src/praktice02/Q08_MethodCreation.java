package praktice02;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
public class Q08_MethodCreation {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
<<<<<<< HEAD
     public static void main(String[] args) {
      hespMak();
         System.out.println(hespMak());

     }
     public static double hespMak(){
         Scanner scan=new Scanner(System.in);
         System.out.println("yapacağınız işlemi \"+,-,x,/\" olarak giriniz");
         char kar=scan.next().charAt(0);
         System.out.println("ilk rakamı giriniz");
         double sayi1=scan.nextInt();
         System.out.println("2. rakamı giriniz");
         double sayi2=scan.nextInt();
         double sonuc=0;

         switch (kar){
             case '+':
                 sonuc=sayi1+sayi2;
                 System.out.println("toplama : " +sonuc);
                 break;
             case '-':
                 sonuc=sayi1-sayi2;
                 System.out.println("cıkarma : " + sonuc);
                 break;
             case 'x':
                 sonuc=sayi1*sayi2;
                 System.out.println("carpma : " +sonuc);
                 break;
             case '/':
                 sonuc=sayi1/sayi2;
                 System.out.println("bölme : " + sonuc);
                 break;
             default:
                 System.out.println("yanlış giriş");
         }
         return sonuc;
     }
=======
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
}