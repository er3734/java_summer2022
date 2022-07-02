package day11_StringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("email adresini giriniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("mail adrsinz kaydedildi");
        }else {
            System.out.println("yazımı kontrol edin");
        }


    }
}
