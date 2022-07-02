package alıstırmaSayfam;

import java.util.Scanner;

public class A22NestedifElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("şifre giriniz");
        char ilk=scan.next().charAt(0);

        if (ilk>='A'&&ilk<='Z'){
            if(ilk=='A'){
                System.out.println("gcerli şifre");
            }else
                System.out.println("gecersiz şifre");
        }else if (ilk>='a' && ilk<='z'){
            if (ilk=='z'){
                System.out.println("gcerli şifre");
            }else
                System.out.println("gecersiz şifre");
        }


    }

}
