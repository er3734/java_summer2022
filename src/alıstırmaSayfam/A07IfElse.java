package alıstırmaSayfam;

import java.util.Scanner;

public class A07IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a= scan.nextInt();

        if(a%2==0){
            System.out.println(a + " girdiğiniz sayı çifttir");
        }else
            System.out.println(a + " girdiğiniz sayı tektir");
    }
}
