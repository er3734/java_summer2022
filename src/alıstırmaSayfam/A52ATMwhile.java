package alıstırmaSayfam;

import java.util.Scanner;

public class A52ATMwhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("bakiyeniz = " + bakiye);

        while (bakiye>0) {
            System.out.println("işlem 1 bakiye sorgulama");
            System.out.println("işlem 2 para çekme");
            System.out.println("işlem 3 para yatırma");
            System.out.println("işlem 4 çıkış");
            System.out.println("lutfen yapacağınız işlemi seciniz");
            int islem = scan.nextInt();

            if (islem==1){
                System.out.println("bakiyeniz = " + bakiye);
            } else if (islem==2) {
                System.out.println("cekeceğiniz miktarı girin");
                int miktar=scan.nextInt();
                if (miktar>bakiye){
                    System.out.println("yetersiz bakiye");
                } else  {
                    bakiye-=miktar;
                    System.out.println("bakiyeniz = " + bakiye);
                }
            } else if (islem==3) {
                System.out.println("yatırcağınız mikatarı girin");
               int  miktar=scan.nextInt();
                bakiye+=miktar;
                System.out.println("bakiyeniz = " + bakiye);
            } else if (islem==4) {
                System.out.println("cıkış yapılıyor");
                break;
            } else
                System.out.println("yanlış giriş");

           /* switch (islem){
                case 1:
                    System.out.println("bakiyeniz = " + bakiye);
                    break;
                case 2:
                    System.out.println("yatırcağınız mikatarı girin");
                    int miktar=scan.nextInt();
                    bakiye+=miktar;
                    System.out.println("bakiyeniz = " + bakiye);
                    break;
                case 3:
                    System.out.println("cekeceğiniz parayı girin");
                    miktar=scan.nextInt();
                    bakiye-=miktar;
                    System.out.println("bakiyeniz = " + bakiye);
                    break;
                case 4:
                    System.out.println("iyi günler");
                    break;
                default:
                    System.out.println("yanlış giriş");
                    break;
            }*/
        }
    }
}
