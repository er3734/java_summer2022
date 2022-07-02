package replitSorular;

import java.util.Scanner;

public class S34_2ForWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a= scan.nextInt();
        int tersSayi=0;
       // int yedekSayi = a;
        while(a!=0){
            tersSayi = tersSayi * 10;
            tersSayi = tersSayi + a % 10;
            a = a / 10;
           /* if (a == 0) {
                i = 10;
            }*/
        }
        System.out.println("\nMatematiksel yol ile sayiyi ters cevirdik :" + tersSayi);
    }
}
