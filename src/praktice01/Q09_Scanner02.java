package praktice01;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("memleketinizi giriniz");
        String memleket=scan.next();
        System.out.println("konumunuzu giriniz");
        String konum=scan.next();
        System.out.println("yaşınızı giriniz");
        int yas= scan.nextInt();
        System.out.println("boyunuzu giriniz");
        double boy=scan.nextDouble();
        System.out.println("yasşadığınız " + konum + " u seviyor musunuz?  true/false");
        boolean sevMu=scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("sevMu = " + sevMu);


    }
}