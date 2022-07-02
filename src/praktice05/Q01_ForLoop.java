package praktice05;

import java.util.Scanner;

public class Q01_ForLoop {

     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük
     yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("bir harf giriniz");
         String harf=scan.next();
         String harfler="a,e,i,o,u,A,E,I,O,U";

         if (harf.length()>1){
             System.out.println("lutfen tek karakter giriniz");
         }else if (!(harf.charAt(0)>='a'&&harf.charAt(0)<='z'||harf.charAt(0)>='A'&&harf.charAt(0)<='Z')){
             System.out.println("lutfen harf giriniz");
         } else if (harfler.contains(harf)){
             System.out.println(harf+" sesli harftir");
         }else
             System.out.println(harf+"sesiz harftir");
     }

}