package replitSorular;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen karenin bir kenarını giriniz");
        int a= scan.nextInt();
        
        int alan=a*a;
        int cevre=4*a;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
