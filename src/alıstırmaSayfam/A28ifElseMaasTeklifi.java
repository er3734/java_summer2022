package alıstırmaSayfam;

import java.util.Scanner;

public class A28ifElseMaasTeklifi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("maaş beklentiniz");
        int maas=scan.nextInt();

        if (maas>=80000){
            System.out.println("kabul ediyorum");
        } else if (maas>=60000&&maas<80000) {
            System.out.println("konusabiliriz");
        }else
            System.out.println("maalesf kabul edemem");
    }
}
