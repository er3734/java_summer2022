package javaITSoruları_ifStatments;

import java.util.Scanner;

public class ifS_S03_if {
    public static void main(String[] args) {
        /*
        a) "Son haneye yuvarla:" ve son hane şundan büyükse yuvarlanmış değeri yazdırın.

        b) "Son basamakta aşağı yuvarla" ve son basamak 5'ten küçükse yuvarlanmış değeri yazdırın*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayı giriniz");
        int s=scan.nextInt();
        /*if (s%10>=5){
            s=(s/10+1)*10;
            System.out.println(s);
        }else
            s=s-s%10;
        System.out.println(s);*/

        System.out.println(s%10>=5?(s=(s/10+1)*10):(s=(s/10)*10));
    }
}
