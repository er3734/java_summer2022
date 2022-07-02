package replitSorular;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("günde ne kadar cay içiyorsunuz");
        int cay= scan.nextInt();
        System.out.println("ne kadar şeker atıyorsunuz");
        int seker= scan.nextInt();

        double skrgr=1.7;

        double yılda=(364*skrgr*seker*cay)/1000;
        System.out.println("yılda +  = " + yılda +"kg");

    }
}
