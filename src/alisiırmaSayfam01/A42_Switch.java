package alisiırmaSayfam01;

import java.util.Scanner;

public class A42_Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı gieiniz");
        int a= scan.nextInt();

        switch (a){
            case 10:
                System.out.println("iki bas. en küçük sayı");
                break;
            case 100:
                System.out.println("üç bas. en küçük sayı");
                break;
            case 1000:
                System.out.println("dört bas.en küçük sayı");
                break;
            default:
                System.out.println("girdiğin sayıyı değiştir");

        }

    }
}
