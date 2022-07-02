package alisiırmaSayfam01;

import java.util.Scanner;

public class A19OgrencilerinNotOrt {
    public static void main(String[] args) {

        int topNot=0;
        Scanner scan=new Scanner(System.in);

        for(int i=5;i>=0; i--){
            System.out.println("öğrencinin notunu giriniz");
            int a= scan.nextInt();
            if(a<0||a>100){
                System.out.println("gecersiz not aralığı");
            }else
                topNot+=a;
        }
        double ort=topNot/5;
        System.out.println("not ortalaması : " + ort);
    }
}
