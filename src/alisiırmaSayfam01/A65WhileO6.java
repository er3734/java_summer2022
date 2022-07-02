package alisiırmaSayfam01;

import java.util.Scanner;

public class A65WhileO6 {
    public static void main(String[] args) {
       // System.out.println(rakamalrTop());
        //System.out.println(rakamalrTop());
        int a=rakamalrTop()+5;
        System.out.println(a);
    }
    public static int rakamalrTop(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int input=scan.nextInt();
        int birler=0;
        int rakamlarTopl=0;
        int temp=input;

        while (temp!=0){
            birler=temp%10;
            rakamlarTopl+=birler;
            temp/=10;
        }
        return rakamlarTopl;
    }
}
