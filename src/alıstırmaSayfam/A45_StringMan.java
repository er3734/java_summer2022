package alıstırmaSayfam;

import java.util.Scanner;

public class A45_StringMan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle griniz");
        String cumle= scan.nextLine();
        System.out.println("bir harf giriniz");
        char kar=scan.next().charAt(0);

        System.out.println(cumle.indexOf(kar));
    }
}
