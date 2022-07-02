package day09_tenaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        //kulalnıcıdan bir sayı isteyin
        //sayı poz ise sayıyı yazdırın
        //say neg ise bir sayı daha isteyin ve ikisinin carpımı

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double a= scan.nextDouble();

        if (a>0){
            System.out.println(a);
        }else {
            System.out.println("bir sayı  daha giriniz");
            double b= scan.nextDouble();
            System.out.println(a*b);
        }
            /*
            Eger if else icerisinde yeni kodlar varsa
            ternary ile yapmamiz mumkun olmaz
            */

    }
}
