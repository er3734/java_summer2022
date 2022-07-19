package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02__02_RandomListOlusturma {
    public static void main(String[] args) {

        Random rnd=new Random();
        int sayi=0;
        List<Integer>sayilar=new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            sayi= rnd.nextInt(200);
            sayilar.add(sayi);

        }
        System.out.println(sayilar);
        Scanner scan=new Scanner(System.in);
        int sayac=1;
        while (true){
            System.out.println("bir sayı giriniz");
            sayi=scan.nextInt();
            if (sayilar.contains(sayi)){
                System.out.println("tebrikler "+ sayac+ " adet tahminde buldunuz");
                break;
            }else {
                System.out.println(sayac+" adet sayı soylediniz ama bulamadınz");
                sayac++;
            }
        }

    }
}
