package r02_recap;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str1=scan.nextLine();
        System.out.println("ikinci keklimeyi giriniz");
        String str2=scan.nextLine();

        System.out.println(str1.concat(" " + str2));
        System.out.println(str1.substring(1).concat(str2.substring(1)));
    }
}