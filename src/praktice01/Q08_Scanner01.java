package praktice01;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int a=scan.nextInt();
        System.out.println("bir tam sayı değeri giriniz");
        int b=scan.nextInt();

        System.out.println("ikisinin toplamı : " + (a+b));


    }



}