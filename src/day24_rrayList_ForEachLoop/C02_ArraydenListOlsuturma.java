package day24_rrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlsuturma {
    public static void main(String[] args) {
        /*
        içinde 200 tane 10000 küçük poz tam sayı olan bir list oluştrun
        kullanıcıdan bşr sayp isteyip listede var olup olmadığını kullanıcıya yazalım
         */

        Random rnd=new Random();//sayı uretir
        int sayi=0;
        List<Integer>sayilistesi=new ArrayList<>();

        while (sayilistesi.size()<200){
            sayi= rnd.nextInt(1000);
            if (!sayilistesi.contains(sayi)){
                sayilistesi.add(sayi);
            }
        }
       System.out.println(sayilistesi);

        boolean bildiMi=false;
        int sayac=1;
        Scanner scan=new Scanner(System.in);

        while (!bildiMi) {//bildiMi==false
            System.out.println("lutfen bir sayı tahmininde bulunuz");
            sayi=scan.nextInt();
            if (sayilistesi.contains(sayi)){
                System.out.println("tebrikler "+sayac+" adet taminde listeden sayı buldunz");
                bildiMi=true;
            }else {
                System.out.println(sayac+" adet sayı soylediniz hiçbiri listede yok");
                sayac++;
            }
        }
    }
}
