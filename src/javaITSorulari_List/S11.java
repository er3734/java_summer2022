package javaITSorulari_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class S11 {
    public static void main(String[] args) {
        //Döngüleri kullanarak bir tamsayı Listesindeki tüm
        //öğelerin benzersiz olup olmadığını kontrol edin

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(6);
        sayilar.add(6);
        sayilar.add(0);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(9);
        sayilar.add(7);
        sayilar.add(11);
        sayilar.add(51);
        sayilar.add(4);

        int syac=0;
        for (int w:sayilar) {
            for (int k:sayilar) {
                if (w==k){
                    System.out.println("k = " + k);
                    System.out.println("w = " + w);
                    syac++;
                    System.out.println("syac = " + syac);

                }
            }
        }
        if (syac==sayilar.size()){
            System.out.println("tekrarlanan elemna yok");
        }else {
            System.out.println(" en az bir eleman tekrarlandı");
        }
    }
}
