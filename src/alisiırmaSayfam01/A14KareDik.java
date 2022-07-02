package alisiırmaSayfam01;

import java.util.Scanner;

public class A14KareDik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cismin kısa kenarını giriniz");
        int a=scan.nextInt();
        System.out.println("lutfen cismin uzun kenarını giriniz");
        int b=scan.nextInt();

        if(a==b){
            System.out.println("cisminiz karedir");
        }else
            System.out.println("cisminiz dikdörtgendir");


    }
}
