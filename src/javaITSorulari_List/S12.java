package javaITSorulari_List;

import java.util.ArrayList;
import java.util.List;

public class S12 {
    public static void main(String[] args) {
        //Dağ Dizisi ==> [0, 2, 5, 3, 1] Sürekli maksimum değere yükseliyor,
        //maksimum değerden sonra sürekli azalan
        //Dağ Dizisi Değil ==> [5, 2, 7, 1, 4] Maksimum değere azalıyor sonra artıyor,
        //maksimum değerden sonra azalıyor veartıyor
        //Verilen herhangi bir dizinin Mountain Array olup olmadığını kontrol etmek için bir kod yazın.

        List<Integer>liste=new ArrayList<>();
        liste.add(5);
        liste.add(2);
        liste.add(7);
        liste.add(1);
        liste.add(4);
        System.out.println("liste = " + liste);
        int sayac=0;
        for (int i = 0; i <liste.size()/2 ; i++) {
            if (liste.get(i)< liste.get(i+1)){
            sayac++;
            }
        }
        int sayac2=0;
        System.out.println("sayac = " + sayac);

        for (int i = liste.size()-1; i >liste.size()/2 ; i--){
            if (liste.get(i)< liste.get(i-1)){
                sayac2++;
            }

        }
        System.out.println("sayac2 = " + sayac2);
        if (sayac==liste.size()||sayac2==liste.size()/2){
            System.out.println("mountain array");
        }else {
            System.out.println("mountain array değil");
        }}}


