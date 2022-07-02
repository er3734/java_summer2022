package praktice01;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Y veya N girin");
        char kar=scan.next().charAt(0);

        if (kar=='Y'||kar=='y'){
            System.out.println("YES");
        } else if (kar=='N'||kar=='n') {
            System.out.println("NO");
        }else
            System.out.println("yanlış karakter girdiniz");

    }
}