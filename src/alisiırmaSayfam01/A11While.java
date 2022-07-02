package alisiırmaSayfam01;

import java.util.Scanner;

public class A11While {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int tp=0;
        while(true){
            System.out.println("bir sayı giriniz");
            int a= scan.nextInt();

            if(a<0){
                System.out.println("neg sayı giridniz");
                break;
            }
            if(a%2!=0){
                tp+=a;
            }
        }
        System.out.println(tp);
    }
}
