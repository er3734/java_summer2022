package alisiırmaSayfam01;

import java.util.Scanner;

public class A21IfElseUcgen {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("ücgenin bir kenarını giriniz");
        int a= scan.nextInt();
        System.out.println("ücgenin bir kenarını giriniz");
        int b = scan.nextInt();
        System.out.println("ücgenin bir kenarını giriniz");
        int c = scan.nextInt();

        if(a==b&&b==c){
            System.out.println("eşkenar üçgen");
        }else
            System.out.println("eşkenar üçgen değil");

    }
}
