package javaITSorulari_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S07 {
    public static void main(String[] args) {
        //Bir Tamsayı Listesinde en yakın 2 tamsayıyı bulun
        //Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        List<Integer>liste=new ArrayList<>();
        liste.add(34);
        liste.add(44);
        liste.add(24);
        liste.add(64);
        liste.add(74);
        liste.add(30);
        liste.add(39);
        liste.add(78);
        liste.add(2);
        Collections.sort(liste);
        System.out.println("liste = " + liste);
        int fark=liste.get(liste.size())- liste.get(0);
        for (int i = liste.size()-1; i >=1 ; i--) {
            for (int j = i-1; j >=0; j--) {
                if (liste.get(i)- liste.get(j)<fark){
                    fark=liste.get(i)- liste.get(j);
                    System.out.println(liste.get(i)+","+ liste.get(j));
                }

            }

        }
    }
}
