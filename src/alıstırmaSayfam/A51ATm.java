package alıstırmaSayfam;

import java.util.Scanner;

public class A51ATm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("işlem 1 bakiye sorgulama");
        System.out.println("işlem 2 para çekme");
        System.out.println("işlem 3 para yatırma");
        System.out.println("işlem 4 çıkış");
        System.out.println("lutfen yapacağınız işlemi seciniz");
        int islem= scan.nextInt();
        int bakiye=1000;

        switch (islem){
            case 1:
                System.out.println("bakiyeniz :" + bakiye);
                break;
            case 2:
                System.out.println("yatırcağınız parayı girin");
                int miktar=scan.nextInt();
                bakiye+=miktar;
                System.out.println("bakiyeniz :" + bakiye);
                break;
            case 3:
                System.out.println("cekeceğiniz miktarı giriniz");
                miktar=scan.nextInt();
                bakiye-=miktar;
                System.out.println("bakiyeniz :" + bakiye);
                break;
            case 4:
                System.out.println("iyi günler");
                break;
            default:
                System.out.println("yanlış işlem");

        }
    }
}
