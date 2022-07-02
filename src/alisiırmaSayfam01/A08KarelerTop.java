package alisiırmaSayfam01;

import java.util.Scanner;

public class A08KarelerTop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen poz. bir tam sayı giriniz");
        int a= scan.nextInt();
        int top=0;
        int top2=0;

        for(int i=1;i<=a;i++){
            if(i % 2 == 0){
                top+=i*i;
            }else
                top2+=i*i;

        }
        System.out.println(top);
        System.out.println(top2);


    }
}
