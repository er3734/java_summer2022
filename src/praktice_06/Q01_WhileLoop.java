package praktice_06;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {
       /* benim yaptığım
       int syi=12345;
        int top=0;
        int bb=0;
        while (syi>0){
            bb=syi%10;
            syi/=10;
            top+=bb;
        }
        System.out.println(top);*/
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        basamakToplama(sayi);
        System.out.println(basamakToplama(sayi));
    }
    public static int basamakToplama(int sayi) {
        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
     return toplam;
    }
}
