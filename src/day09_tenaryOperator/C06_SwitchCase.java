package day09_tenaryOperator;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("gün ismi giriniz");
        String gun=scan.nextLine().toLowerCase();*/

        String input ="CUMA";
        input=input.toLowerCase();

        switch (input){
            case "pazartesi":
                System.out.println("haftaiçi");
                break;
            case "salı":
                System.out.println("haftaiçi");
                break;
            case "çarşamba":
                System.out.println("haftaiçi");
                break;
            case "perşembe":
                System.out.println("haftaiçi");
                break;
            case "cuma":
                System.out.println("haftaiçi");
                break;
            case "cumartesi":
                System.out.println("haftasonu");
                break;
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("yanlış giriş");
        }
        switch (input) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("haftaiçi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("yanlış giriş");
        }
    }
}
