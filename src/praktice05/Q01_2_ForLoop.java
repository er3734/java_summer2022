package praktice05;

import java.util.Scanner;

public class Q01_2_ForLoop {
    public static void main(String[] args) {
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
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf=scan.next().toLowerCase();

        String sesli="aeiou";
        String sessiz="bcdfghjklqmnprstwxvyz";
        if (harf.length()==1){
            for (int i = 0; i <sesli.length() ; i++) {
                if (sesli.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                } else if (sessiz.contains(harf)) {
                    System.out.println("sesiz harf girdiniz");
                    break;
                }else {
                    System.out.println("yanlış karekter girdiniz");
                    break;
                }
            }
        }else {
            System.out.println("birden fazla karekter girdiniz");
        }

    }
}
