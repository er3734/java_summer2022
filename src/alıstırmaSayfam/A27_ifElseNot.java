package alıstırmaSayfam;

import java.util.Scanner;

public class A27_ifElseNot {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen öğrencinin notunu giriniz");
        int not= scan.nextInt();

        if (not<50){
            System.out.println("notunuz : D");
        } else if (not>=50&&not<60) {
            System.out.println("notunuz : C");
        }else if (not>=60&&not<80){
            System.out.println("notunuz : B");
        }else if (not>=80&&not<=100)
            System.out.println("notunuz : A");
    }
}
