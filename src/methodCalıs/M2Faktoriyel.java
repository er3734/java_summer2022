package methodCalıs;

import java.util.Scanner;

public class M2Faktoriyel {
    public static int faktöriyel(){
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı");
        int a= scan.nextInt();
        int f=1;

        while (a>0){
            f*=a;
            a--;
        }
        //System.out.println("fak : " + f);
        return f;

    }
    public static void main(String[] args) {
        /*faktöriyel();
        faktöriyel();
        faktöriyel();
        faktöriyel();*/

        System.out.println(faktöriyel()+top());

    }
    public static int top(){
        int a=4;
        int b=7;
        int toplam=a+b;
        return toplam;

    }
}
