package replitSorular;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("diktörtgenin uzun kenarını giriniz");
        int a= scan.nextInt();
        System.out.println("diktörtgenin kısa kenarını giriniz");
        int b= scan.nextInt();
        
        int alan=a*b;
        int cevre=2*(a+b);

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
