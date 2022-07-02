package javaITSorulari_Nested;

import java.util.Scanner;

public class Nesif_S04_n {
    public static void main(String[] args) {
        /*Bir yılın artık yıl olup olmadığını kontrol
         eden bir program yazın
         Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
         Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir
         */
        Scanner scan=new Scanner(System.in);
        int yil=scan.nextInt();
        artikYil(yil);
    }

    private static void artikYil(int yil) {
        System.out.println((yil%100==0)?((yil%400==0)?"artik yil":"artik yil değil"):
                yil%4==0?"artik yil":"artik yil değil");
    }
}
