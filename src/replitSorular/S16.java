package replitSorular;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("zamanı saat dakkia ve saniye şeklinde giriniz");
        System.out.println("saati giriniz");
        int saat= scan.nextInt();
        System.out.println("dakikayı giriniz");
        int dk=scan.nextInt();
        System.out.println("saniyeyi giriniz");
        int sn= scan.nextInt();

        System.out.println(saat+ " saat " + dk + " dakika " + sn + " saniye ==> "
                +(saat*60*60+dk*60+sn) + " saniye ");
    }
}
