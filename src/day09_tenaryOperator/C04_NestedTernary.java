package day09_tenaryOperator;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char kar=scan.next().charAt(0);

        System.out.println((kar>='a'&&kar<='z')?"küçük harf":((kar>='A'&&kar<='Z')?"büyük harf":"girdiğiniz karekter harf deği"));


    }
}
