package alisiırmaSayfam01;

import java.util.Scanner;

public class A46_StringMan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String str1= scan.nextLine();
        System.out.println("bir kelime giriniz");
        String str2=scan.nextLine();

        if (str1.indexOf(str2)==-1){
            System.out.println("kulanılmamış");
        } else if (str1.indexOf(str2)>=0) {
            System.out.println("bir kere");

        }else if ((str1.indexOf(str2)==-1)){
            System.out.println("kulanılmamış");
        }


    }
}
