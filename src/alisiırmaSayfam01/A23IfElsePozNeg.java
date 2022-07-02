package alisiırmaSayfam01;

import java.util.Scanner;

public class A23IfElsePozNeg {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1.sayıyı giriniz");
        int a= scan.nextInt();
        System.out.println("lutfen 2.sayıyı giriniz");
        int b= scan.nextInt();

        if (a>0&&b>0){
            System.out.println(a+b);
        } else if (a<0&&b<0) {
            System.out.println(a*b);
        } else if ((a<0&&b>0)||(a>0&&b<0)) {
            System.out.println("işlem yapamazsınız");
        } else if (a==0||b==0) {
            System.out.println("carpmaya göre yutan eleman");
        }
    }
}
