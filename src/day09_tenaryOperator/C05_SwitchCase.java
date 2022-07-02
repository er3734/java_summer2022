package day09_tenaryOperator;

import java.util.Scanner;
    /*
      kullanicidan gun numarasini alip
      1 ise pazartesi,
      ...
      7 ise pazar yazdiralim
     */

public class C05_SwitchCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kacıncı gün olduğunu girin");
        int gun= scan.nextInt();

        switch (gun){
            case 1:
                System.out.println("pazarrtesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3 :
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar" );
                break;
            default:
                System.out.println("yanlış sayı girdiniz");


        }
    }
}
