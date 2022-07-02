package alisiırmaSayfam01;

import java.util.Scanner;

public class A43_Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("SDET KISALTMASININ BİR HARFİNİ GİRİNİZ");
        char a=scan.next().toUpperCase().charAt(0);

        switch (a){
            case 'S':
                System.out.println("software");
                break;
            case 'D':
                System.out.println("developer");
                break;
            case 'E':
                System.out.println("engineer");
                break;
            case 'T':
                System.out.println("testing");
                break;
            default:
                System.out.println("yanlış giriş");
        }
    }
}
