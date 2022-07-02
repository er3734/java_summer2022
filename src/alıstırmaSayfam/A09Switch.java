package alıstırmaSayfam;

import java.util.Scanner;

public class A09Switch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen iki sayı giriniz");

        double a= scan.nextDouble();
        double b= scan.nextDouble();

        System.out.println("lutfen yapmak isteğiniz işlemi seciniz");
        char islem=scan.next().charAt(0);
        hesapMakinesi(a,b,islem);
    }
    private static void hesapMakinesi(double a, double b, char islem) {
        switch (islem) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;

            case 'x':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("yanlış secim yaptınız");
        }


    }
}
