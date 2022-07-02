package alisiırmaSayfam01;

import java.util.Scanner;

public class A59WhileCarpımO5 {
    public static void main(String[] args) {
        carpım();
        carpım();

    }
    public static void carpım(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfene bir rakam griniz");
        int sayi=scan.nextInt();
        if (sayi>0&&sayi<=9){
            int i=1;
           while (i<10){
               int sonuc=i*sayi;
               System.out.print(sayi+" x "+i+" = "+sonuc+",");
               i++;
           }
        }else {
            System.out.println("yanlış giriş");
        }
    }
}
