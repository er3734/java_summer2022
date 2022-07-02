package day07_ifStatments;

import java.util.Scanner;

public class C04_BasicifStament {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir gün ismi giriniz");
        String gun=scan.next().toLowerCase();

        if(gun.equals("cumartesi") || gun.equals("pazar")){
            System.out.println("hafta sonu");
        }if (gun.equals("pazartesi")||gun.equals("salı")||gun.equals("carsamba")
        ||gun.equals("perşembe")||gun.equals("cuma")){
            System.out.println("haftaiçi");
        }if (!(gun.equals("pazartesi")||gun.equals("salı")||gun.equals("carsamba")
                ||gun.equals("perşembe")||gun.equals("cuma")||
                gun.equals("pazar")|| gun.equals("cumartesi"))){
            System.out.println("gecerli bir gün ismi giriniz");
        }
    }
}
