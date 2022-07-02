package day08_ifStatement;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir gün ismi giriniz");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")||gun.equals("salı")||gun.equals("carşamba")||gun.equals("perşembe")||gun.equals("cuma")
            ||gun.equals("cumartesi")||gun.equals("pazar")){
            String out=gun.substring(0,1).toUpperCase().concat(gun.substring(1,3).toLowerCase());
            //String put=gun.substring(1,3).toLowerCase();
            System.out.println(out);
        }else
            System.out.println("gecerli gün ismi giriniz");
    }
}
