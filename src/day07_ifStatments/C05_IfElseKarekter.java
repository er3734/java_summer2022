package day07_ifStatments;

import java.util.Scanner;

public class C05_IfElseKarekter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");
        char kar =scan.next().charAt(0);

        if(kar>='A'&& kar<='Z'){
            System.out.println("büyük harf karekter girdiniz");
        }else if (kar>='a' && kar<='z'){
            System.out.println("küçük harf karekter girdiniz");
        }else if(kar>='0'&& kar<='9'){
            System.out.println("sayı karekteri girdiniz");
        }else
            System.out.println("yanlış karekter gridiniz");

    }
}
