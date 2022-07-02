package alisiırmaSayfam01;

import java.util.Scanner;

public class A68DoWhileO3 {
    public static void main(String[] args) {
        int top = 0;

        int a;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen bir poz sayı girniz");
            a = scan.nextInt();
            top += a;
        } while (a != 0);
        System.out.println("top = " + top);
    }
}
