package alisiırmaSayfam01;

import java.util.Scanner;

public class A61WhileO3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1.sayıyı giriniz");
        int a= scan.nextInt();
        System.out.println("lutfen 2.sayıyı giriniz");
        int b= scan.nextInt();
        if (a<b){
            while (a<=b){
                if (a%2==0){
                    System.out.print(a+",");
                }
                a++;
            }
        }else{
            while (b<=a){
                if (b%2==0){
                    System.out.print(b+",");
                }
                b++;
            }
        }
    }
}
