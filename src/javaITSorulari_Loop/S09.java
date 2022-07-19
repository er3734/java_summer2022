package javaITSorulari_Loop;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        //Bir Dize'deki tüm küçük harfli karakterleri yıldız işaretiyle yazdırmak için kod yazın.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime=scan.nextLine();

        kucukleriYilidizYap(kelime);
    }

    public static void kucukleriYilidizYap(String kelime) {
        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)>='a'&&kelime.charAt(i)<='z'){
              kelime=  kelime.replace(kelime.substring(i,i+1),"*");
            }
        }
        System.out.println(kelime);
    }
}
