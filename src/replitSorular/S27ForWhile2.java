package replitSorular;

import java.util.Scanner;

public class S27ForWhile2 {
    /*Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
    Giriş :
            30
            40
    Beklenen Cikti:
            30 ve 40 icin GCD = 10
            30 ve 40 icin LCM = 120*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1. tam sayıyı giriniz");
        int a = scan.nextInt();
        System.out.println("lutfen 2. tam sayıyı giriniz");
        int b = scan.nextInt();

        System.out.println(EBOB(a,b));
        System.out.println(EKOK(a,b));
    }

    public static int EBOB(int a, int b) {
        int ebob=0 ;

        if (a < b) {
            for (int i = 1; i <= a; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    ebob = i;}
                }
            }else
                for (int i = 1; i <= b; i++) {

                if ((a % i == 0) && (b % i == 0)) {
                    ebob = i;}
        }
        return ebob;
    }
        public static int EKOK(int a,int b){
        int ekok=(a*b)/EBOB(a,b);
        return ekok;
    }
    }

