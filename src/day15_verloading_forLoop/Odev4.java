package day15_verloading_forLoop;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("100 den kucuk bir sayı giriniz");
        int input= scan.nextInt();
        for (int i = 1; i <=input ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
            
        }
        
    }
}
