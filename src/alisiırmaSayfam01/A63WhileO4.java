package alisiırmaSayfam01;

import java.util.Scanner;

public class A63WhileO4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf=scan.next().charAt(0);
        System.out.println("bir harf giriniz");
        char harf2=scan.next().charAt(0);

        if (harf<harf2){
            while (harf<=harf2){
                //String hf= String.valueOf(harf).toUpperCase();
                //System.out.print(hf+",");
                char bharf= (char) (harf-32);
                System.out.print(bharf+",");
                harf++;
            }
        }
    }
}
