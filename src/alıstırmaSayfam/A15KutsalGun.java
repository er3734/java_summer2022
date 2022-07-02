package alıstırmaSayfam;

import java.util.Scanner;

public class A15KutsalGun {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gün giriniz");
        String gun= scan.nextLine();

        if(gun.toLowerCase().equals("cuma")){
            System.out.println("müslamanlar için kutsal gün");
        } else if (gun.toLowerCase().equals("cumartesi")) {
            System.out.println("yahUdiler için kutsal gün");
        }else if (gun.toLowerCase().equals("pazar")){
            System.out.println("hristiyanlar için kutsal gün");
        }else
            System.out.println("normal gün");
    }
}
