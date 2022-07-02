package replitSorular;

import java.util.Scanner;

public class S15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("üç basamaklı sayı giriniz");
        int a= scan.nextInt();

        int b1=a%10;
        a/=10;
        int b2=a%10;
        a/=10;
        int b3=a%10;

        System.out.println("verielen tamsayının rakamları toplamı : " + (b1+b2+b3));
    }
}
