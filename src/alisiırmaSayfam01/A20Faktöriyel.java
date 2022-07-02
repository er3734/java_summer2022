package alisiırmaSayfam01;

import java.util.Scanner;

public class A20Faktöriyel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a=scan.nextInt();
        int f=1;
        while(a>0){
            System.out.print(a+ "x" );
            f*=a;
            a--;
        }
        System.out.println(f);
    }
}
